// document.write('😓😠😈🤩🤤😫😫🥶💦💧💧🤭😓😈😈😈')

import React from 'react'
import ReactDOM from 'react-dom'

// một thẻ html viết bằng jsx có thể được biến thành một object
const ele = (
    <div foo="bar"> 
        <button> test </button>
        <span> Hello </span>
     </div>
)
//biến ele thành định dạng json và console.log ra ngoài
console.log(JSON.parse(JSON.stringify(ele)))

function Xacthuc({thuoctinh1,thuoctinh2}) {
    return  <p> {thuoctinh1? 'ton tai thuoc tinh 1' : 'khong ton tai thuoc tinh 2'} {thuoctinh2? 'ton tai thuoc tinh 2' : 'khong ton tai thuoc tinh 2'} </p>
} 

function App() {
  const style = {
    padding: '40px',
    textAlign: 'center'
  }

  return <div style={style}>Welcome to React!  <Xacthuc  thuoctinh1="some random value"/> <br></br>
  Bây giờ là: {new Date().toLocaleTimeString() } ⌚ </div>
}



setInterval(() => {
    ReactDOM.render(<App/>, document.querySelector('#app'))
}, 1000);