import logo from './logo.svg';
import './App.css';
import ResponsiveAppBar from "./components/Appbar";
import Player from "./Player";


function App() {
  return (
    <div className="App">
      <ResponsiveAppBar/>
        <Player/>
    </div>
  );
}

export default App;
