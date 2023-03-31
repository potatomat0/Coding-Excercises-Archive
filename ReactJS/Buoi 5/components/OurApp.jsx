import React from 'react'
// import '../css/style.css'

import Header from './Header.jsx'
import Menu from './Menu.jsx'
import Pane from './Pane.jsx'
import Clear from './Clear.jsx'
import Lower from './Lower.jsx'
import Footer from './Footer.jsx'

export default class OurApp extends React.Component {
    render() { 
        return <>
                <Header/>
                <Menu/>
                <Pane/>
                <Clear/>
                <Lower/> 
                <Clear/>
                <Footer/>
             </>
    }
}