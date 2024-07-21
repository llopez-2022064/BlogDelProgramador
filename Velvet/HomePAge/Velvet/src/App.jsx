import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import { HomePage } from './components/HomePage/HomePage'
import { NavBar } from './components/NavBar/NavBar'
import { Footer } from './components/Footer/Footer';
import { Login } from './components/Login/Login';

function App() {


  return (
    <>
      <div>

        
        <Router>
          <Routes>
            <Route path='/' element={<HomePage />} />
            <Route path='/login' element={<Login/>} />
          </Routes>
        </Router>
        
      </div>

    </>
  )
}

export default App
