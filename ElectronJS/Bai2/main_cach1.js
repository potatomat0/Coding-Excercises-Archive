let electron = require('electron');

function createWindow() {
    let winParent = new electron.BrowserWindow()
    let winChild = new electron.BrowserWindow({
        parent: winParent,
        width: 400,
        height: 300,
        modal: true,
        title: 'This is a child window',
        show: false
    });

    winChild.once('ready-to-show', _ => {
        winChild.show()
    })

    winParent.on('closed', _=>{
        console.log('bye')
    })
    
    
    winParent.loadFile('index.html')
    winChild.loadURL('https://github.com');
}

console.log(process.platform);
electron.app.on('ready', createWindow)
