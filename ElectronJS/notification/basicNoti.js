const { app, BrowserWindow, Notification } = require('electron')

function createWindow () {
  const win = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false
  }
  })

  win.loadFile('index.html')
}

const options = {
  title: 'Custom Notification',
  subtitle: 'Subtitle of the Notification',
  body: 'Body of Custom Notification',
  silent: false,
  // icon: path.join(__dirname, '../assets/image.png'),
  hasReply: true,  
  timeoutType: 'never', 
  replyPlaceholder: 'Reply Here',
  // sound: path.join(__dirname, '../assets/sound.mp3'),
  urgency: 'critical' ,
  closeButtonText: 'Close Button',
  actions: [ {
      type: 'button',
      text: 'Show Button'
  }]
}

const NOTIFICATION_TITLE = 'Basic Notification'
const NOTIFICATION_BODY = 'Notification from the Main process'

function showNotification () {
  new Notification(options).show()
}

app.setAppUserModelId(process.execPath) //

app.whenReady().then(createWindow).then(showNotification)

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') {
    app.quit()
  }
})

app.on('activate', () => {
  if (BrowserWindow.getAllWindows().length === 0) {
    createWindow()
  }
})