import React from 'react';
import { Link } from 'react-router-dom';

function Dashboard() {
  return (
    <div className="dashboard-container">
      <h2>Welcome to Your Dashboard</h2>
      <div className="dashboard-links">
        <Link to="/account-overview">Account Overview</Link>
        <Link to="/transactions">Transactions</Link>
        <Link to="/transfer-funds">Transfer Funds</Link>
      </div>
    </div>
  );
}

export default Dashboard;
