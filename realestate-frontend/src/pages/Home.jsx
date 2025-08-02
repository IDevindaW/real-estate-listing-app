import { useEffect } from 'react';
import { testApi } from '../services/api';

function Home() {
  useEffect(() => {
    testApi()
      .then(response => console.log(response.data))
      .catch(error => console.error(error));
  }, []);

  return <h1>Real Estate Listings</h1>;
}

export default Home;