const electron = require('electron');


const { app, BrowserWindow, Menu, ipcMain } = electron;

// SET ENV
process.env.NODE_ENV = 'production';

let mainWindow;
let addWindow;

// Listen for app to be ready
app.on('ready', () => {
  // Create new window
  mainWindow = new BrowserWindow({
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,
      enableRemoteModule: true,
    }
  });
  mainWindow.webContents.openDevTools();
  // Load html into window
  mainWindow.loadFile('mainWindow.html');

  // Quit app when closed
  mainWindow.on('closed', () => app.quit());
  // Build menu from template
  const mainMenu = Menu.buildFromTemplate(mainMenuTemplate);
  // Insert menu
  Menu.setApplicationMenu(mainMenu);

});

// Handle create add window
function createAddWindow() {
  // Create new window
  addWindow = new BrowserWindow({
    width: 300,
    height: 200,
    title: 'Add Shopping List Item'
  });

  // Load html into window
  addWindow.loadFile('addWindow.html');
  // Garbage collection handler
  addWindow.on('closed', () => addWindow = null);
}

// Catch item:add
ipcMain.on('item:add', (e, item) => {
  console.log(item);
  mainWindow.webContents.send('item:add', item);
  addWindow.close();
});

// Create menu template
const mainMenuTemplate = [
  {
    label: 'File',
    submenu: [
      {
        label: 'Add Item',
        click(){
          createAddWindow();
        }
      },
      {
        label: 'Clear Items',
        click(){
          mainWindow.webContents.send('item:clear');
        }
      },
      {
        label: 'Quit',
        accelerator: process.platform == 'darwin' ? 'Command+Q' : 'Ctrl+Q',
        click(){
          app.quit();
        }
      }
    ],
  }
];

// If Mac add empty object to menu
if (process.platform == 'darwin') {
  mainMenuTemplate.unshift({});
}
