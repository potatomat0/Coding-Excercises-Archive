let {BrowserWindow,ipcMain,app, ipcRenderer} = require('electron');
require('@electron/remote/main').initialize()
app.on('ready', _ => {
  let mainWindow = new BrowserWindow({
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,
    }
  });

  require('@electron/remote/main').enable(mainWindow.webContents)
  
  const websites = [
    'http://google.com',
    'http://github.com',
    'http://youtube.com',
    'http://rateyourmusic.com'
  ]

  mainWindow.webContents.send('dulieu', websites)

  // window.webContents.send('data',webLink)
  
  mainWindow.loadFile('index.html');
  ipcMain.on('openWebsite',  _ =>  {
    let secondaryWindow = new BrowserWindow({
      parent: mainWindow,
      modal: true,
      show: false
    })
  
    secondaryWindow.loadURL(webLink)
    secondaryWindow.once('ready-to-show', () => {
      secondaryWindow.show()
    })
} 
  )
    mainWindow.on('close', _=> {
    app.quit()
  })
});