import Heading from "./Heading";
import Body from './Body';
import Footer from "./Footer";

function App() {

  let userArray = [
    {
      name: "Hector",
      phrase: "Want to connect?"
    },
    {
      name: "Hectorina",
      phrase: "Want to Chat?"
    },
    {
      name: "Hectopolis",
      phrase: "Want to be Friends?"
    },
    {
      name: "Gorgonzola",
      phrase: "Feeling Fresh?"
    },
  ]

	return (
		<div className="App" >
      <Heading />
      {
        userArray.map((user, index) => {
          return <Body key={index} myName={user.name} phrase={user.phrase} />
        })
      }
      <Footer/>
		</div>
	);
}

export default App;
