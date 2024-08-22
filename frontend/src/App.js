import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Login from './Login';
import Dashboard from './Dashboard';
import AccountOverview from './AccountOverview';
import Transactions from './Transactions';

function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route path="/" exact component={Login} />
          <Route path="/dashboard" component={Dashboard} />
          <Route path="/account-overview" component={AccountOverview} />
          <Route path="/transactions" component={Transactions} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
