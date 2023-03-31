let electron = require('electron');

function createWindow() {
    // new electron.BrowserWindow()
    //                         .loadFile('index.html')
    let win = new electron.BrowserWindow();
    win.loadFile('index.html');
    win.on('closed', _=>{
        console.log('bye')
    })
    win.on('resize', _=>{
        setTimeout(_=>{console.log('hey you just moved me')},1000)
    })
    win.on('hide', _=>{
        setTimeout(_=>{console.log('i have been hidden')},500)
    })
}

electron.app.on('ready', createWindow)
// console ra thông báo khi tắt hết khung cửa sổ
    // cách 1
// electron.app.on('window-all-closed', _ => {
//     console.log('Bye')
//     electron.app.quit()
//   })