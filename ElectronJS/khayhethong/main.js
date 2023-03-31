let {app,Tray,Menu,MenuItem,BrowserWindow} = require('electron')
const ctxMenu=new Menu();
let win = null

ctxMenu.append(new MenuItem({label:"Hello",type:'checkbox',click:(mi)=>{
    mi.enabled=false;
    ctxMenu.items[1].enabled=true
   ctxMenu.items[2].enabled=true

    win= new BrowserWindow({
        width:300,
        height:300,
        title:"Hello",
    })
}}))
ctxMenu.append(new MenuItem({label:"Hi",type:'checkbox',enabled:false,click:()=>{
    // win.isVisible() ? win.hide() : win.show();
    if(win.isVisible()){
        win.hide();
    }else{
        win.show()
    }

}}))
ctxMenu.append(new MenuItem({label:"Bye",type:'checkbox',enabled:false,click:()=>{
    win=new BrowserWindow({
        width:300,
        height:300,
        title:"Bye"
    })
}}))
app.on('ready',function(){
    let tray = new Tray('avt.jpg')
    tray.setToolTip('Melody Mark')
    tray.setContextMenu(ctxMenu)
   
})
// let electron = require('electron')
// const ctxMenu=new electron.Menu();
// ctxMenu.append(electron.MenuItem({label:"Hello",click:()=>{
//      new electron.BrowserWindow({
//         width:300,
//         height:300,
//         title:"Hello"
//     })
// }}))
// ctxMenu.append(new electron.MenuItem({label:"Hi",click:()=>{
//     new electron.BrowserWindow({
//         width:300,
//         height:300,
//         title:"Hi"
//     })
// }}))
// ctxMenu.append(new electron.MenuItem({label:"Bye",click:()=>{
//     new electron.BrowserWindow({
//         width:300,
//         height:300,
//         title:"Bye"
//     })
// }}))
// electron.app.on('ready',()=>{
//     let tray = new electron.Tray('avt.jpg')
//     tray.setToolTip('Melody Mark')
//     tray.setContextMenu(ctxMenu)
// })