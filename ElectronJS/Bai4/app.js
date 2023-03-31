let electron = require('electron');
electron.app.on('ready', _=>{
    let win = new electron.BrowserWindow()
    win.loadURL(process.argv[2])
})
//ví dụ để chạy: mở terminal: cmd + enter + electron app.js http://www.itc.edu.vn + enter