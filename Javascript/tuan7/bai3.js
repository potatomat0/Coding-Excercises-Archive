var bai3 = [
    {name: 'hoang minh nhat', dateOfbirth: 2003, salary: 300000},
    {name: 'nguyen van a', dateOfbirth: 2001, salary: 400000},
    {name: 'john doe', dateOfbirth: 1997, salary: 500000},
] 

var trungbinh = arr => {
    let sum = 0
    let avg = 0
    arr.forEach(obj => {
    for (let key in obj) {
      sum += parseInt(obj[key].salary)
    }
     avg = sum/(arr.length)
  })
  return avg
}

console.log(trungbinh(bai3))