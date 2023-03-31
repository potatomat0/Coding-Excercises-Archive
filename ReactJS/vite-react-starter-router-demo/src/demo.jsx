import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import { useParams } from "react-router-dom";

const Home = () => <h2>Home</h2>;
const Stuff = () => <h2>Stuff</h2>;
const About = () => <h2>About</h2>;


const NotFound = () => (
  <h2>
    You Have landed on a site that doesnt exist click{' '}
    <Link to="/">Here</Link> to return to the home page{' '}
  </h2>
);

const users = [
  { id: 1, name: 'Nhật', role: 'admin' },
  { id: 2, name: 'Khương', role: 'user' },
  { id: 3, name: 'Hãi', role: 'user' }
];



const User = () => {
  const params = useParams();
  const user = users.find(user => user.id === parseInt(params.id));
  
  return <div className='content'>
      <h2>Tên {user ? user.name : 'User Not Found'}</h2>
      <p>Chức vụ: {user ? user.role : 'role not found'}</p>
      <p>Mã số sinh viên: {user ? user.id : 'User Not Found'} </p>
  </div>;
};


// Changed NavLink to Link and activeClassName to className
const NavigationBar = () => (
  <nav>
    <ul>
      <li><Link to="/">Home</Link></li>
      <li><Link to="/Stuff">Stuff</Link></li>
      <li><Link to="/about">About</Link></li>
      <li><Link to="/hlkjhjhkj">heheh dawd</Link></li>
      {/* loop through the users array */}
      <li>
      Users
        <ul>
          {users.map(user => (<li key={user.id}>
              <Link className="link" to={`/users/${user.id}`}>
              {user.name}{' '} </Link>
            </li>
          ))}
        </ul>
      </li>
    </ul>
  </nav>
);

function App() {
  return (
    <Router>
      <div>
        {/* navigation bar */}
        <NavigationBar />

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/Stuff" element={<Stuff />} />
          <Route path="/about" element={<About />} />
          <Route path="/users/:id" element={<User />} />

          {/* not found page */}
          <Route path="*" element={<NotFound />} />
        </Routes>
      </div>
    </Router>
    );
}

ReactDOM.createRoot(document.getElementById('root')).render(<App />)
