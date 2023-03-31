const {app, BrowserWindow} = require('electron')

function createWindow() {
    const win = new BrowserWindow({
        height: 600, width: 800,
        webPreferences: {
            nodeIntegration: true
        },
        resizable: false
    })
    win.loadFile('index.html')
}

app.on('ready',createWindow)
