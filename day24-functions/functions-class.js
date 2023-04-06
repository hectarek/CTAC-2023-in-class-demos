// // let arr = ['toyota', 'tesla', 'saab', 'ford'];

// let a = 'apple';

// function consoleLogFirstThreeArrayItems () {
//     console.log(arr[0]);
//     console.log(arr[1])
//     console.log(arr[2])

// }

// consoleLogFirstThreeArrayItems(arr);

// // function add (x,y) {
// //     return x + y;
// // }

// // add(4, 5)
// // add(6, 7)
// // add(2, 9)

// // console.log(add(3,5))

// function calculateTipBy20Percent(amount) {
//     return amount * 0.2 ;
// }

// // calculateTipBy20Percent(40);

// function calculateTotalWithTip(amount) {

//     let total = amount += calculateTipBy20Percent(amount);

//     return total;

// }

// console.log(calculateTotalWithTip(200));

// Function as Object

// let shoppingCart = {
// 	items: ["apples", "cheese", "butter"],
// 	size: 4,
// 	addToCart: function (item) {
// 		shoppingCart.items.push(item);
// 	},
//     getCartItems: function() {
//         for (let item of shoppingCart.items) {
//             console.log(item);
//         }
//     }
// };

// shoppingCart.addToCart("grapes");

// // console.log(shoppingCart.addToCart())

// shoppingCart.getCartItems();

// Hoisting

// saySomething();

// function saySomething () {
//     console.log('something')
// }

// function hoistFuntion () {
//     let a = 10;
//     let b = 5;
// }

// hoistFuntion();

// console.log(a);
// console.log(b);

// const myFunctionVariable = function () {
//     console.log("Some thing else")
// }

// myFunctionVariable();

// // Functions not being Hoisted

// subtract(10, 7);

// function subtract (x,y) {
//     return x-y
// }

// // add(3,5); // WILL NOT WORK

// let add = function (x,y) {
//     return x + y;
// }

// add(3,5);

// // IIFE

// (function () {
//     console.log("This is happening right away")
// })();

// function displayUserInfo(user) {
// 	console.log("Name: " + user.name);
// 	console.log("Age: " + user.age);
// }

// let user = {
// 	name: "Alice",
// 	age: 30,
// };

// displayUserInfo(user);

function displayWeather(data) {
	console.log(`Location: ${data.location}`);
	console.log(`Temperature: ${data.temperature}°C`);
	console.log(`Conditions: ${data.conditions}`);
}

// Sample weather data from an API
let weatherData = {
	location: "San Francisco",
	temperature: 18,
	conditions: "Sunny",
};

displayWeather(weatherData);
