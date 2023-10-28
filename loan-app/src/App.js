import logo from './logo.svg';
import './App.css';
import {  Routes, Route } from 'react-router-dom';
import {customerLogin} from './Component/customer';
import {CustomerRegistration} from './Component/customer';


function App() {
  return (
    <div className = 'cointainer-fluid'>
      <div className='alert alert-secondary'>
          <h2 className='text-center'>Loan application</h2>
      </div>

      <div>
        <Routes>
          <Route path='' element={<customerLogin />}></Route>
          <Route path='/login' element={<customerLogin />}></Route>
          <Route path='/register' element={<CustomerRegistration />}></Route>
          <Route path='/success/:emailId/*' element={<Success />}></Route>
        </Routes>
      </div>
      
      

    </div>



  );
}

export default App;
