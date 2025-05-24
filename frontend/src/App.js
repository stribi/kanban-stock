import React, { useEffect, useState } from 'react';

function App() {
  const [items, setItems] = useState([]);
  const [kits, setKits] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/items')
      .then(res => res.json())
      .then(data => setItems(data))
      .catch(err => console.error('Error fetching items:', err));
  }, []);

  useEffect(() => {
    fetch('http://localhost:8080/api/kits')
    .then(res => res.json())
    .then(data => setKits(data))
    .catch(err => console.error('Error fetching kits:',  err));
  },[]);

  useEffect(() => {
  fetch('http://localhost:8080/api/kits/with-items')
    .then(res => res.json())
    .then(data => setKits(data))
    .catch(err => console.error('Error fetching kits with items:', err));
}, []);


  return (
    <div>
    <div style={{ padding: '2rem' }}>
      <h1>Items</h1>
      <ul>
        {items.map(item => (
          <li key={item.id}>
            <strong>{item.code}</strong>: {item.name}
          </li>
        ))}
      </ul>
    </div>
    <div style={{ padding: '2rem' }}>
      <h1>Kits</h1>
     {/*  <ul>
        {kits.map(kit => (
          <li key={kit.id}>
            <strong>{kit.code}</strong>: {kit.name}
          </li>
        ))}
      </ul> */}
      {kits.map(kit => (
  <div key={kit.id} style={{ marginBottom: '2rem' }}>
    <h2>{kit.code}: {kit.name}</h2>
    <ul>
      {kit.items.map((item, index) => (
        <li key={index}>
          {item.code} – {item.name} ({item.quantity} pcs)
        </li>
      ))}
    </ul>
  </div>
))}
    </div>
  
   
    </div>
  );
}

export default App;
