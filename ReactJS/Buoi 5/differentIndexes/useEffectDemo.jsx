// import React from 'react'
// // import '../css/style.css'
// import ReactDOM from 'react-dom/client'

// State and props demo
import React from 'react'
import ReactDOM from 'react-dom'
import {Component} from 'react'

class OurApp extends Component {
    constructor() {
        super()
        this.state = {name: '🤩🤩☠️'}
    }
    componentDidMount() { 
        console.log(`didMount triggered: tao la ${this.state.name}`);
    }
    componentDidUpdae() { 
        console.log(`didUpdate triggered: tao la ${this.state.name}`);
    }

    render() { 
        return <>
           <p> {`xin chao tao la ${this.state.name}`} </p>
           <button onClick={()=>this.setState({name:'🔥🔥🔥'})}> Nhấn vào tao</button>
             </>
    }
}

setInterval(_=>{
    ReactDOM.render(
        <OurApp />,
        document.querySelector('#wrapper') 
    )
},1000)