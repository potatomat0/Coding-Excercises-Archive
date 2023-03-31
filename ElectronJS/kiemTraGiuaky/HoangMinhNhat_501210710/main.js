const electron = require('electron');
const url = require('url');
const path = require('path');

const {app,Tray,Menu,MenuItem,BrowserWindow,ipcMain,dialog} = electron;

//Set environment
process.env.NODE_ENV = 'production';

let mainWindow;
let addWindow;

//Listen for the app to be ready
app.on('ready', function(){
    //Create new window
    mainWindow = new BrowserWindow({
        icon: __dirname + './shopping_cart.png',
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false
        }
    });
    //Load html into the window
    mainWindow.loadFile('mainWindow.html');
    
   
    //Quit app on close
    mainWindow.on('closed', function(){
        app.quit();
    });

    //Build the menu from template
    const mainMenu = Menu.buildFromTemplate(mainMenuTemp);

    //Insert menu
    Menu.setApplicationMenu(mainMenu);
});

//Add item handler
function createAddWindow(){
    //Create new window
    addWindow = new BrowserWindow({
        width: 300,
        height: 200,
        title: 'Add Item',
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false
        }
    });
    //Load html into the window
    addWindow.loadURL(url.format({
        pathname: path.join(__dirname, 'addWindow.html'),
        protocol: 'file:',
        slashes: true
    }));
    //Handle garbage collection
    addWindow.on('close', function(){
        addWindow = null;
    });
}

ipcMain.on('item:add', function(e, item){
    mainWindow.webContents.send('item:add', item);
    addWindow.close();
});

const mainMenuTemp = [
    {
        label:'File',
        submenu: [
            {
                label: 'Add Item',
                accelerator: process.platform == 'darwin' ? 'Command+T' : 'Ctrl+T',
                click(){
                    createAddWindow();
                }
            },
            {
                label: 'Clear Items',
                accelerator: process.platform == 'darwin' ? 'Command+W' : 'Ctrl+W',
                click(){
                    dialog.showMessageBox(mainWindow,{
                        title: 'Cảnh báo',
                        type: 'info',
                        buttons: ['ok', 'cancel'],
                        noLink: true, //để custom button không tạo ra liên kết
                        defaultId: 0,
                        cancelId: 1,
                        detail: 'Bạn có thực sự muốn xóa?',
                      })
                        .then(ketqua => {
                          switch(ketqua.response) {
                            case 0: mainWindow.webContents.send('item:clear'); break; 
                          }
                        })
                    // mainWindow.webContents.send('item:clear');
                }
            },
            {
                label: 'Quit',
                accelerator: process.platform == 'darwin' ? 'Command+Q' : 'Ctrl+Q',
                click(){
                    app.quit();
                }
            }
        ]
    }
];

if(process.platform == 'darwin'){
    mainMenuTemp.unshift({});
}

const ctxMenu=new Menu();

ctxMenu.append(new MenuItem({label:"Thoát",type:'normal',click:()=>{
    app.quit();
}}))
ctxMenu.append(new MenuItem({label:"Xóa toàn bộ sản phẩm",type:'normal',enabled:true,click:()=>{
    dialog.showMessageBox(mainWindow,{
        title: 'Cảnh báo',
        type: 'info',
        buttons: ['ok', 'cancel'],
        noLink: true, //để custom button không tạo ra liên kết
        defaultId: 0,
        cancelId: 1,
        detail: 'Bạn có thực sự muốn xóa?',
      })
        .then(ketqua => {
          switch(ketqua.response) {
            case 0: mainWindow.webContents.send('item:clear'); break; 
          }
        })
    
    // mainWindow.webContents.send('item:clear');
}}))
ctxMenu.append(new MenuItem({label:"Thêm sản phẩm",type:'normal',enabled:true,click:()=>{
    addWindow = new BrowserWindow({
        width: 300,
        height: 200,
        title: 'Add Item',
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false
        }
    });
    addWindow.loadFile('addWindow.html')
}}))
app.on('ready',function(){
    let tray = new Tray('shopping_cart.png')
    tray.setToolTip('Shopping cart button')
    tray.setContextMenu(ctxMenu)
   
})
