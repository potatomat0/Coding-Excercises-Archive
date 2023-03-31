import React, { useState, useEffect } from "react";
import ReactDOM from 'react-dom/client'


function AddForm({setPets}) {
const [name, setName] = useState("");
const [species, setSpecies] = useState("");
const [age, setAge] = useState(0);


function handleSubmit(e) {
    e.preventDefault();
    setPets(prev=>[...prev, {name, species, age, id: Math.floor(Math.random()*1000)}]);
}

return (
    <form onSubmit={handleSubmit}>
        <label>
            Name:
            <input type="text"  value={name} onChange={e=>setName(e.target.value)}/>
        </label>
        <label>
            Species:
            <input type="text"  value={species} onChange={e=>setSpecies(e.target.value)}/>
        </label>
        <label>
            Age:
            <input type="number"  value={age} onChange={e=>setAge(e.target.value)}/>
        </label>
        <input type="submit" value="Add"/>    
    </form>
)


}


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
<AddForm setPets={setPets}> </AddForm>
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

