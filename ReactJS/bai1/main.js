let electron = require('electron')
var win=null;
const ctxMenu=new electron.Menu();
ctxMenu.append(new electron.MenuItem({label:"Hello",click:()=>{
    win.webContents.send('hello')
}}))
ctxMenu.append(new electron.MenuItem({label:"Hi",click:()=>{
   win.webContents.send('hi')
}}))
ctxMenu.append(new electron.MenuItem({label:"Bye",click:()=>{
   win.webContents.send('bye')
}}))
function cuaso(){
        win = new electron.BrowserWindow({
                width:500,
                height:500,
                webPreferences:{
                    nodeIntegration:true,
                    contextIsolation:false,
                }
        })
        win.loadFile('index.html')
        win.webContents.on('context-menu',(e,params)=>{
            ctxMenu.popup(win,params.x,params.y)
            console.log(win)
        })
}
electron.app.on('ready',cuaso)