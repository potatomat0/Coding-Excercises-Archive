import React, { useState, useEffect } from "react";
import ReactDOM from 'react-dom/client'


function Pet(props) {
    function handleDelete() {
        props.setPets(prev=>prev.filter(pet=>pet.id!=props.id))
    }
    return (<li>
        Name: {props.name},
        Species: {props.species},
        Age: {props.age}
        
        <button onClick={handleDelete}>Delete me</button>
    </li>)
}

function App() {

    const [pets,setPets] = useState([
        { name: 'amongus', species: 'puss', age: 12312, id: 1},
        { name: 'coom', species: 'obama', age: 12312, id: 2},
        { name: 'buss', species: 'dog', age: 12312, id: 3},
    ])

    return (<> 
    <ul>
        {
            pets.map(pet=> <Pet key={pet.id} setPets={setPets}
                             name={pet.name} species={pet.species} 
                             age={pet.age} id={pet.id} /> )                    
        }
    </ul>
    </>
    )
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);