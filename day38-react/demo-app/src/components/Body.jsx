export default function Body ({ myName, phrase }) {

    let alertUser = () => {
        alert("Thanks for the Email!")
    }

    return (
        <div>
            {/* <h2> This is Hector</h2> */}
            <h2> This is {myName} </h2>
			<p>Nice weather we are having</p>
			<h3>{phrase}</h3>
			<input type="text" name="text" id="text" />
			<button className="btn btn-primary" onClick={alertUser}>Email Me</button>
        </div>
    )
}