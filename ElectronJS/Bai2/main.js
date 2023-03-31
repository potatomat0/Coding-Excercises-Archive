let electron = require('electron');

let appWindow = {}

function createWindow() {
    appWindow.main = new electron.BrowserWindow({
        webPreferences: {
            height: 800, width: 600,
            nodeIntegration: true,
            contextIsolation: false,
            frames: false, 
            webPreferences: {
                preload: path.join(__dirname, 'preload.js')
              }
        }
    })
    appWindow.setting = new electron.BrowserWindow({
        parent: appWindow.main,width: 400,height: 300,modal: true,
        title: 'This is a child window',show: false
    });
    appWindow.setting1 = new electron.BrowserWindow({
        parent: appWindow.main,width: 400,height: 300,modal: true,
        title: 'This is a setting window',show: false
    });

    appWindow.setting1.loadURL('https://google.com')

    appWindow.setting.once('ready-to-show', _ => {
        appWindow.setting.show()
    })

    appWindow.main.on('closed', _=>{
        console.log('bye')
    })
    
    
    appWindow.main.loadFile('index.html')
    appWindow.setting.loadURL('https://github.com');

  
    
}


electron.app.on('ready', createWindow)
// console.log(process.platform);
const jobsDone =  (event, arguments) => console.log(`hello ${arguments}`);
//renderer to main process
electron.ipcMain.on('hi', jobsDone)
electron.ipcMain.on('exit',  () => electron.app.quit())
//main process to renderer:
electron.ipcMain.on('hi', () => {
    appWindow.setting1.show();
})

