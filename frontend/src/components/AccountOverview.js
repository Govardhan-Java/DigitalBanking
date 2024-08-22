import React, { useState, useEffect } from 'react';
import axios from 'axios';

function AccountOverview() {
  const [account, setAccount] = useState(null);

  useEffect(() => {
    axios.get('/api/account/overview')
      .then(response => {
        setAccount(response.data);
      })
      .catch(error => {
        console.error("There was an error fetching the account data!", error);
      });
  }, []);

  if (!account) {
    return <p>Loading...</p>;
  }

  return (
    <div className="account-overview">
      <h2>Account Overview</h2>
      <p><strong>Account Number:</strong> {account.accountNumber}</p>
      <p><strong>Account Balance:</strong> ${account.balance.toFixed(2)}</p>
      <p><strong>Account Type:</strong> {account.type}</p>
    </div>
  );
}

export default AccountOverview;
