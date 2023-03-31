import React from 'react'

//import from '.'
import OurHeader from './OurHeader.jsx'
import TimeArea from './TimeArea.jsx'
import {Pet} from './Pet.jsx'
import Footer from './Footer.jsx'


export default class OurApp extends React.Component {
    data = [
        {name: 'meow', species: '🐈', age: 8},
        {name: 'baxter', species: '🐕', age: 10},
        {name: 'moon', species: '🐄', age: 17},
        {name: 'peep', species: '🐖', age: 17},
    ]
    render() { 
        return <>
                <OurHeader/>
                 <TimeArea/>
                 <ul>
                    {this.data.map(item=><Pet name={item.name} species={item.species} age={item.age} />)}
                 </ul>
                 <Footer/>
             </>


    }
}