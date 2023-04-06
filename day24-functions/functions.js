// Functions in objects example (Methods)
let shoppingCart = {
	items: ["apples", "cheese", "butter", "milk"],
	size: 4,
	addToCart: function (item) {
		shoppingCart.items.push(item);
	},
};

shoppingCart.addToCart("grapes");

// Hoisting
function add(num1, num2) {
	return num1 + num2;
}

const makeNoise = function () {
	console.log("Kabow!");
};

add(4, 5); // 9
makeNoise(); // Kabow!

// Anonymous functions

let greet = function (name) {
	// anonymous function
	return `Hello, ${name}!`;
};

console.log(greet("Alice")); // 'Hello, Alice!'

const calculator = {
	add: function (a, b) {
		return a + b;
	},
	subtract: function (a, b) {
		return a - b;
	},
	multiply: function (a, b) {
		return a * b;
	},
	divide: function (a, b) {
		return a / b;
	},
};

calculator.add(3, 6); // 9
calculator.subtract(6, 5); // 1
calculator.multiply(5, 5); // 25
calculator.divide(20,4) // 5


// IIFE

(   function () {
		// your code here
    }
)();

(function () {
	let message = "Hello, world!";
	console.log(message); // 'Hello, world!'
})();


console.log(message); // Error: message is not defined (private scope)

let counter = (function() {
    let count = 0;
  
    function increment() {
      count++;
      console.log(`Count: ${count}`);
    }
  
    function reset() {
      count = 0;
      console.log('Counter reset.');
    }
  
    return {
      increment: increment,
      reset: reset
    };
  })();
  
  counter.increment(); // Count: 1
  counter.increment(); // Count: 2
  counter.reset(); // Counter reset.
  console.log(counter.count); // undefined (private variable)


// Objects as Arguments
function displayUserInfo(user) {
    console.log('Name: ' + user.name);
    console.log('Age: ' + user.age);
  }
  
  let user = {
    name: 'Alice',
    age: 30
  };
  
  displayUserInfo(user);
  // Output:
  // Name: Alice
  // Age: 30
  

  function displayWeather(weatherData) {
  console.log(`Location: ${weatherData.location}`);
  console.log(`Temperature: ${weatherData.temperature}°C`);
  console.log(`Conditions: ${weatherData.conditions}`);
}

// Sample weather data from an API
let weatherData = {
  location: 'San Francisco',
  temperature: 18,
  conditions: 'Sunny'
};

displayWeather(weatherData);
// Output:
// Location: San Francisco
// Temperature: 18°C