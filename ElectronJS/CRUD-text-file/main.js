const { app,path,BrowserWindow } = require("electron");

let win;
function createWindow() {
  win = new BrowserWindow({
    webPreferences: {
        nodeIntegration: true,
        contextIsolation: false,
    }
});
  win.loadFile('index.html')
  win.on('closed', _=> {
    win=null
  })
}

app.on('ready', createWindow)

app.on('window-all-closed', _=> {
  if(process.platform !== 'darwin') app.quit()
})

app.on('activate', _=> {
  if(win===null) createWindow()
})