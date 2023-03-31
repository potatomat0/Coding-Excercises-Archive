import React, { useState, useEffect } from "react";
import ReactDOM from 'react-dom/client'
// nếu muốn sử dụng class component 
// import {component} from "react"


// function App() {
//   return 'Hello'
// }

// convert this class component to a functional component in ReactJS: 

// class App extends React.Component {
//   constructor(props) {super(props); this.state = {name: "Egoist"};}
//   componentDidMount(){
//     console.log(`didMount :Ohio onii-chan ${this.state.name}`);
//   }
//   componentDidUpdate(){console.log(
//     `didUpdate :Daisuki ${this.state.name}`
//   );}
//   render(){
//     return (
//       <>
//         <p>{`I Am ${this.state.name}`}</p>
//         <button onClick={()=>this.setState({name:'GodSe4L' })}>
//           Change me
//         </button>
//       </>
//     )
//   }
// }

// dạng function:

const App = () => {
  const [name, setName] = useState("Egoist");
  // useEffect(() => {
  //   console.log(`didMount :Ohio onii-chan ${name}`);
  // }, []); // muốn use effect chạy một lần thì để trống mảng ở argument thứ hai 
  useEffect(() => {
    console.log(`didUpdate :Daisuki ${name}`);
  }, [name]);

  const handleUnmount = () => {
    console.log(`bye bye ${name}`)
    setTimeout(_=>{
    const root = document.getElementById('root');
    while(root.firstChild) {
      root.removeChild(root.firstChild); 
    } 
    },1000)
  }
  
  return (
    <>
      <p>{`I Am ${name}`}</p>
      <button onClick={() => setName(name === "Egoist" ? "GodSe4L" : "Egoist")}>
        Change me
      </button>
      <button onClick={() => handleUnmount()}>Unmount</button>
    </>
  );
};




const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);