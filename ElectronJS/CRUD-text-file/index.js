const fs = require('fs');
const path = require("path")
CKEDITOR.replace( 'editor1' );

fileName = document.getElementById('fileName');

fileContents = document.getElementById('fileContents');

btnCreate = document.getElementById('btnCreate');
btnRead = document.getElementById('btnRead');
btnDelete = document.getElementById('btnDelete');

let pathName = path.join(__dirname, 'Files');

btnCreate.addEventListener('click', () => {
    let file = path.join(pathName,fileName.value)
    // let contents = fileContents.value;
    // https://ckeditor.com/docs/ckeditor4/latest/guide/dev_savedata.html
    // https://stackoverflow.com/questions/44947314/jquery-ckeditor-cannot-read-property-getdata-of-undefined
    let data = CKEDITOR.instances["fileContents"].getData();
    fs.writeFile(file,data, (err)=> {
        if(err) return console.log(err);
        console.log("the file was saved successfully");
        swal("Hurray!", "File has been created sucessfully!", "success");

    })
})

const deleteFile = _ => {
    let file = path.join(pathName, fileName.value)
    fs.unlink(file, err=> {
        if(err) return console.log(err);
        fileName.value = ''
        fileContents.value = ''
        console.log("the file was deleted!");
    })
}

btnRead.addEventListener("click", _ => {
    let file = path.join(pathName, fileName.value);
    fs.readFile(file, "utf8" , (err,data)=> {
        if(err) return console.log(err);
        // https://stackoverflow.com/questions/3610010/how-do-i-set-a-value-in-ckeditor-with-javascript
        data = CKEDITOR.instances["fileContents"].setData(data);
        console.log("the file was read!");
        console.log(data);
    })
})

btnDelete.addEventListener("click", _ =>{
    swal({
        title: "Are you sure?",
        text: "Once deleted, you will not be able to recover this file!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
      })
      .then((willDelete) => {
        if (willDelete) {
            deleteFile()
            swal("Poof! Your imaginary file has been deleted!", {
            icon: "success",
          });
        } else {
          swal("Your file is safe!");
        }
      });
})