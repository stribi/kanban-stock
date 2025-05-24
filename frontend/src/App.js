import React, { useEffect, useState } from 'react';

function App() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/items')
      .then(res => res.json())
      .then(data => setItems(data))
      .catch(err => console.error('Error fetching items:', err));
  }, []);

  return (
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
  );
}

export default App;
