// functional component

import React from 'react'
import ReactDOM from 'react-dom'
function CustomButton(props) {
    let styles = {
        padding: '40px',
        textAlign: 'center'
    }
    return <button style={styles}> {props.text} </button> 
}
function MyComponent(props) {
    // or here you can do the destructuring technique: function MyComponent({size, text})
    return <div style={
        // ở jxs mọi thuộc tính (attributes) có thể edit tại css đều được chuyển thành camelCase bên trong html tag
        {padding: '10px', backgroundColor: 'powderblue'}}>
            <button style={{fontSize: props.size}}>
                {props.text}
            </button>
            <CustomButton text="This is a customiezd button" />
        </div>
}

setInterval(_=>{
    ReactDOM.render(
        <MyComponent text="this is text value" size="50px" />,
        document.querySelector('#app') 
    )
})