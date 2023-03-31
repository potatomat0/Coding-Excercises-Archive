// let electron = require('electron');
const { app, BrowserWindow, ipcMain, nativeTheme } = require('electron')
const path = require('path');

let appWindow = {}

function createWindow() {
    appWindow.main = new BrowserWindow({
        webPreferences: {
            height: 800, width: 600,
            nodeIntegration: true,
            contextIsolation: false,
            frame: 0,
            webPreferences: {
                preload: path.join(__dirname, 'preload.js')
              }
        }
    })
    appWindow.setting = new BrowserWindow({
        parent: appWindow.main,width: 400,height: 300,modal: true,
        title: 'This is a child window',show: false
    });
    appWindow.setting1 = new BrowserWindow({
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

// dark mode
ipcMain.handle('dark-mode:toggle', () => {
    if (nativeTheme.shouldUseDarkColors) {
      nativeTheme.themeSource = 'light'
    } else {
      nativeTheme.themeSource = 'dark'
    }
    return nativeTheme.shouldUseDarkColors
  })

ipcMain.handle('dark-mode:system', () => {
    nativeTheme.themeSource = 'system'
  })


app.on('ready', createWindow)




// console.log(process.platform);
const jobsDone =  (event, arguments) => console.log(`hello ${arguments}`);
//renderer to main process
ipcMain.on('hi', jobsDone)
ipcMain.on('exit',  () => app.quit())
//main process to renderer:
ipcMain.on('hi', () => {
    appWindow.setting1.show();
})

