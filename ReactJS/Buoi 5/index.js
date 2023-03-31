// State and props demo
import React from 'react'
import ReactDOM from 'react-dom'

import OurApp from './components/OurApp.jsx'

setInterval(_=>{
    ReactDOM.render(
        <OurApp />,
        document.querySelector('#wrapper') 
    )
},1000)