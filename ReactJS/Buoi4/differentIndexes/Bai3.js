// Bài 3
import React from 'react'
import ReactDOM from 'react-dom'

// function OurHeader(props) {
//     let styles = {
//         padding: '40px',
//         textAlign: 'center',
//         color: rgb(71,12,150)
//     }
//     return <h1 style={styles}> {props.text} </h1> 
// }
function OurContent(props) {
    let styles = {
        padding: '40px',
        textAlign: 'center',
    }
    return <h3 style={styles}> {props.text} </h3> 
}
function TimeArea() {
    const styles = {
        padding: '10px',
        textAlign: 'center',
        color: blue
    }
    return <h5 style={styles}> The current time is {new Date().toLocaleTimeString()} ⌚ </h5> 
}

function OurApp() {
        return <>
            <OurContent text="Our super insightful content" />
            <TimeArea />
        </>
}

setInterval(_=>{
    ReactDOM.render(
        <OurApp />,
        document.querySelector('#app') 
    )
})