// State and props demo
import React from 'react'
import ReactDOM from 'react-dom'

class ParentComponent extends React.Component {
    state = {name: 'John'}
    setName(n) {
        this.setState({name: n})
    }
    render() { 
        return <ChildComponent name={this.state.name}
                                setName={this.setName.bind(this)} />

    }
}

function ChildComponent(props) {
    return <>
                <p>{props.name}</p>
                <button onCLick={_=>props.setName('Mark')}>
                    Change name
                </button>
            </>
}

setInterval(_=>{
    ReactDOM.render(
        <ParentComponent />,
        document.querySelector('#app') 
    )
})