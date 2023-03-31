const { app, BrowserWindow } = require('electron')
const path = require('path')


function createWindow () {
  const win = new BrowserWindow({
    width: 500, height: 500,
    minWidth: 200, minHeight: 200,
    maxWidth: 1000, maxHeight: 800,
    webPreferences: {
      preload: path.join(__dirname, 'preload.js')
    }
  })
  
  win.loadFile('index.html')
}

function smallWin() {
  const about = new BrowserWindow({
    icon: path.join(__dirname, '/assets/display.png'), 
    width: 350,
    height: 350,
    resizable: false,
    movable: true,
    minimizable: false,
    maximizable: false,
    closable: true,
    focusable: true,
    fullscreenable: false,
    title: 'About Us',
    frame :true,
    backgroundColor: '#C147E9',
    
  })
  about.loadFile('about.html')
}

app.whenReady().then(() => {
  createWindow()
  smallWin()

  app.on('activate', () => {
    if (BrowserWindow.getAllWindows().length === 0) {
      createWindow()
    }
  })

  app.on('closed', () => {
    require("shell").openExternal("https://www.google.com")
  })
})

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') {
    app.quit()
  }
})
