import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Routes, Route, Link, NavLink } from 'react-router-dom';
import { useParams, useLocation  } from "react-router-dom";
import './mystyleSPA.css';
import { TransitionGroup, CSSTransition } from 'react-transition-group';
import { Outlet } from 'react-router-dom';

const Home = () => <div className='content'>
   <h2>Home</h2>
   <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Eius commodi alias, odit impedit, voluptatum sit dolorum autem quo id officiis delectus laboriosam. Optio vitae nisi possimus? Similique, nam cum. Pariatur.</p>
   <br></br>
   <p> id officiis delectus laboriosam. Optio vitae nisi possimus? Similique, nam cum. Pariatur.</p>
</div>;

const Stuff = () => <div className='content'>
    <h2>Stuff</h2>
    <ul>
      <li>Very cool product 1</li>
      <li>Very cool product 2</li>
      <li>Very cool product 3</li>
      <li>Very cool product 4</li>
    </ul>
</div>;
const Contact = () => <div className='content'>
  <h2>Got any questions?</h2>
  <p>    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Eius commodi alias, odit impedit, voluptatum sit dolorum autem quo id officiis delectus laboriosam. Optio vitae nisi possimus? Similique, nam cum. Pariatur.</p>
</div>;


const NotFound = () => ( <div className='content'> 
  <h2>
    You Have landed on a site that doesnt exist click{' '}
    <Link to="/">Here</Link> to return to the home page{' '}
  </h2>
</div>
);

const users = [
  { id: 1, name: 'Nhật', role: 'admin', img: 'https://th.bing.com/th/id/OIP.YVNZBO9cJEIc0FUG-6c1IgHaHa?w=210&h=210&c=7&r=0&o=5&dpr=1.4&pid=1.7'  },
  { id: 2, name: 'Khương', role: 'user',img: 'https://gamepress.gg/pokemongo/sites/pokemongo/files/2019-06/591_0.png'  },
  { id: 3, name: 'Hãi', role: 'user',   img: 'https://th.bing.com/th/id/R.90a6a110a91fe2a6372b7224fbec4dde?rik=f4ZJ6%2fqgdcyTKQ&pid=ImgRaw&r=0'  }
];



const User = () => {
  const params = useParams();
  const user = users.find(user => user.id === parseInt(params.id));
  
  if (!user) {
    return <div className='content'>User Not Found</div>;
  }

  return  <div className='card'>
  <img src={user.img} alt='User' />
  <div className='card-content'>
    <h2>{user.name}</h2>
    <p>Role: {user.role}</p>
  </div>
</div>;
};


// Changed NavLink to Link and activeClassName to className
const Header = () => (
    <>
    <h1> Simple SPA </h1>
    <ul className='header'>
      <li><NavLink end activeClassName="active" to="/">Home</NavLink></li>
      <li><NavLink activeClassName="active" to="/Stuff">Stuff</NavLink></li>
      <li><NavLink activeClassName="active" to="/Contact">Contact</NavLink></li>
      <li><NavLink activeClassName="active" to="/hlkjhjhkj">heheh 😈</NavLink></li>
      {/* loop through the users array */}
      <li className="dropdown">
    <button className="dropbtn">Users 🔽
    </button>
    <div className="dropdown-content">
    {users.map(user => (<li key={user.id}>
              <NavLink className="link" to={`/users/${user.id}`}>
              {user.name}{' '} </NavLink>
            </li>
          ))}
    </div>
  </li>
    </ul>
    </>
);

const AnimatedOutlet = () => {
  const location = useLocation();

  return (
    <TransitionGroup>
      <CSSTransition key={location.key} classNames="fade" timeout={300}>
        <Outlet />
      </CSSTransition>
    </TransitionGroup>
  );
};

  function App() {
    return (
      <Router>
        <div>
          <Header />
          <TransitionGroup>
            <CSSTransition classNames="fade" timeout={300}>
              <Routes>
                <Route path="/" element={<AnimatedOutlet />}> 
                  <Route path="/" element={<Home />} />
                  <Route path="/Stuff" element={<Stuff />} />
                  <Route path="/Contact" element={<Contact />} />
                  <Route path="/users/:id" element={<User />} />
                  {/* not found page */}
                  <Route path="*" element={<NotFound />} />
                </Route>
              </Routes>
            </CSSTransition>
          </TransitionGroup>
            
        </div>
      </Router>
    );
  }

ReactDOM.createRoot(document.getElementById('root')).render(<App />)
