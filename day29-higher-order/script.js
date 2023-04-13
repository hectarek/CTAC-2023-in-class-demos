// Day 29 Higher Order Functions

// THIS

// const thisIsMyAdminObjectThatHasALongName = {
//     name: 'Erin',
//     consoleName: function() {
//         console.log(this.name);
//     },
// }

// function ask() {
//     function say() {
//         console.log(this.name);
//     }
//     say();
// };

// ask()
// console.log(this);
// thisIsMyAdminObjectThatHasALongName.consoleName(); //'Erin'

// const test = {
// 	prop: 42,
// 	func: function () {
// 		return this.prop;
// 	},
// };

// console.log(test.func()); // Expected output: 42

// class Animal {
//     constructor(name, call) {
//         this.name = name;
//         this.call = call;
//     }

//     sayCall () {
//         console.log(this.call)
//     }
// }

// let dog = new Animal('dog', 'woof');

// dog.sayCall();

// function add(number1, number2) {
//     return number1 + number2;
// }

// function subtract(number1, number2) {
//     return number1 - number2;
// }

// const multiply = (n1, n2) => n1 * n2;

// function calculator(operation, number1, number2) {
//     return operation(number1,number2);
// }

// console.log(calculator(add, 5, 4));
// console.log(calculator(subtract, 5, 2));
// console.log(
//     calculator(multiply,5,6)
// );

// Higher Order Array Functions

// FILTER

// function evens(num){
//     return num % 2 == 0;
//   }

// const numbers = [1,2,3,4,5,6,7,8,9,10,11,12];

// let evenNumbers = numbers.filter(num => {
//     return num % 2 == 0;
// })

// console.log(evenNumbers);

// let oddNumbers = numbers.filter(function(num) {
//       return num % 2 != 0
//    }
// )

// console.log(evenNumbers); // [2,4,6,8,10,12]
// console.log(oddNumbers); // [1,3,5,7,9,11]

// FIND

// const users = [
// 	{ name: "Alberta Johnson", isActive: true, age: 33 },
// 	{ name: "Darnell Thompson", isActive: false, age: 25 },
// 	{ name: "Sally Seashell", isActive: false, age: 41 },
// 	{ name: "Inija Rosas", isActive: true, age: 56 },
// ];

// function over40(user) {
//     return user.age > 40;
// }
// const userOlderThan40 = users.find(over40);

// console.log(userOlderThan40); // {name: 'Sally Seashell', isActive: false, age: 41}

// const currentOnlineUsers = users.filter((user) => user.isActive);
// const userOlderThan40 = users.find((user) => user.age > 40);

// console.log(currentOnlineUsers); // {name: 'Alberta Johnson', isActive: true, age: 33},
// // {name: 'Inija Rosas', isActive: true, age: 56}

// console.log(userOlderThan40); // {name: 'Sally Seashell', isActive: false, age: 41}

// MAP

// const users = [
// 	{ name: "Alberta Johnson", isActive: true, age: 33 },
// 	{ name: "Darnell Thompson", isActive: false, age: 25 },
// 	{ name: "Sally Seashell", isActive: false, age: 41 },
// 	{ name: "Inija Rosas", isActive: true, age: 56 },
// ];

// const returnNameAndAge = users.map((user) => user.name + " is " + user.age + " years old.");

// console.log(returnNameAndAge);
// console.log(users);

// const arr = [1,2,3,4,5,6,7,8,9];

// console.log(arr.map(num => 2**num));

// REDUCE

// const grades = [100,94,88,53,79,93,80,100,77,64,85,87,92];

// const reduceGrades = grades.reduce(function(grade, total) {
//     return total + grade;
// }, 0);

// console.log(reduceGrades);

// const avgGrades = (reduceGrades / grades.length);

// console.log(avgGrades);

// FOR EACH

// const trees = ['birch', 'cyprus', 'cedar', 'ashwood', 'oak'];

// const listOfTrees = trees.forEach(function(tree) {
//     console.log(tree);
// });

// let listOutTrees = trees.forEach(tree => console.log(tree));

// for (let tree of trees) {
//     console.log(tree);
// }

// ASYNC JS

// // Say "Hello."
// console.log("Hello.");

// // Say "Goodbye" two seconds from now.
// setTimeout(function() {
//   console.log("Goodbye!");
// }, 2000);

// // Say "Hello again!"
// console.log("Hello again!");

// function saySomething() {
//   console.log('Hello there');
// }

// const teacher = {
//     name: 'Erin',
//     callName: function() {

//             // Example of async waiting for some data
//             setTimeout(function(){
//                     console.log('This will appear later, my name is ' + this.name);
//             },1000)

//             // Runs immediately
//             console.log('Now my name is ' + this.name);
//     }
// }

// teacher.callName();

// Assigning Context

// bind() = Borrows a function, & creates a copy.
// "this" keyword replaced with the object passed in as an argument

// const teacher = {
// 	name: "Erin",
// 	callName: function () {
// 		//Save this to a variable
// 		const self = this;

// 		//self is visible inside function because of closure
// 		setTimeout(function () {
// 			console.log("later my name is " + self.name);
// 		}, 1000);

//         // Runs immediately
//         console.log('Now my name is ' + self.name);
// 	},
// };

// teacher.callName();

const obj = {
	x: 42,
	getX: function () {
		return this.x;
	},
};

// console.log(obj.getX());

const unboundGetX = obj.getX;
console.log(unboundGetX()); // The function gets invoked at the global scope
// Expected output: undefined

const boundGetX = unboundGetX.bind(obj);
console.log(boundGetX());
// Expected output: 42

// // Explaining Bind
// let dog = {
// 	name: "dog",
// 	bark: function () {
// 		console.log(this.name, "is barking");
// 	},
// };
// let parrot = {
// 	name: "parrot",
// 	chirp: function () {
// 		console.log(this.name, "is chirping");
// 	},
// };

// let speak = dog.bark.bind(parrot);
// speak();

// speak = function (sound) {
// 	console.log(this.name, "is", sound);
// };

// let dog = {
// 	name: "dog",
// };
// let parrot = {
// 	name: "parrot",
// };
// bark = speak.bind(dog, "barking");
// chirp = speak.bind(parrot, "chirpping");

// call
// Takes arguments seperatly
// const person = {
// 	fullName: function () {
// 		return this.firstName + " " + this.lastName;
// 	},
// };
// const person1 = {
// 	firstName: "John",
// 	lastName: "Doe",
// };
// const person2 = {
// 	firstName: "Mary",
// 	lastName: "Doe",
// };
// console.log(person.fullName.call(person1)); // John Doe console. log( person. fullName. call (person2) ); // Mary Doe

// // apply
// // take arguments as an array
// const obj = { name: "John" };
// let greeting = function (a, b) {
// 	return `${a} ${this.name}. ${b}`;
// };
// console.log(greeting.apply(obj, ["Hello", "How are you?"])); // returns: Hello John. How are you?
