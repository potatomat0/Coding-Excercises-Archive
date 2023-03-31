let electron = require('electron');
// tạo error dialog từ main process
// electron.dialog.showErrorBox('error title', 'some error message from main process')
require('@electron/remote/main').initialize()
electron.app.on('ready', _ => {
  mainWindow = new electron.BrowserWindow({
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,
    }
  });

  const myNotification = new Notification('⚠️⚠️ Chú ý! ⚠️⚠️', {
    body: 'notification description', icon: path.join(__dirname, 'killyourself.jpg'),
  })

  myNotification.onclick = _ => console.log('notification clicked')
  //tạo hộp thoại mesage
  electron.dialog.showMessageBox(mainWindow,{
    title: 'Cảnh báo',
    type: 'info' ,
    buttons: ['ok', 'cancel'],
    noLink: true, //để custom button không tạo ra liên kết
    defaultId: 0,
    cancelId: 1,
    detail: 'you are such a waste of existence',
    icon: 'killyourself.jpg',
  })
    .then(ketqua => {
      switch(ketqua.response) {
        case 0: mainWindow.webContents.send('OK'); break; //send to the renderer, the line below is executing error box from main.js
              // electron.dialog.showErrorBox('happy ending', 'you have refused to stay depressed and start doing things you have once wanted to do'); break;
        case 1: electron.dialog.showErrorBox('bad ending', 'you are now dead 💀💀'); break;
        default: electron.dialog.showErrorBox('neutral ending', 'beep boop this is a neutral ending'); break;
      }
    })
  require('@electron/remote/main').enable(mainWindow.webContents)
  
  mainWindow.loadFile('index.html');
 
});