// class component

import React from 'react'
import ReactDOM from 'react-dom'
class MyComponent extends React.Component {
    // or here you can do the destructuring technique: function MyComponent({size, text})
    render() {
        return <div style={
            // ở jxs mọi thuộc tính (attributes) có thể edit tại css đều được chuyển thành camelCase bên trong html tag
            {padding: '10px', backgroundColor: 'powderblue'}}>
                <button style={{fontSize: this.props.size}}>
                    {this.props.text}
                </button>
            </div>
    }
}

setInterval(_=>{
    ReactDOM.render(
        <MyComponent text="this is text value" size="50px" />,
        document.querySelector('#app') 
    )
})