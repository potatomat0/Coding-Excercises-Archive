// Tạo Map, gồm các công việc đã hoàn thành: done và chưa hoàn thành: work - in -progress
// ·  Xuất ra tên các cv đã hoàn thành, và chưa hoàn thành
// ·  Đếm xem có bao nhiêu cv đã hoàn thành.
// ·  Xóa các cv đã hoàn thành
var task = new Map()

task
    .set('a','done')
    .set('b','doing')
    .set('c','doing')
    .set('d','done')
    .set('e','done')
    .set('f','doing')
//xuất ra các công việc đã hoàn thành và chưa hoàn thành
// ---cách 1
for (const [key, value] of task) {
    console.log(`${key} = ${value}`);
  }

//đếm xem có bao nhiêu công việc đã hoàn thành
mang = [...task.values()]
dem = mang.filter(a=> a==='done').length 
console.log(`Số công việc đã hoàn thành: ${dem}`)
  
//xóa những công viên đã hoàn thành
dem = 0
 for (const [key, value] of task) {
    if (value==='done')
        task.delete(key)
  }
  console.log(task)
