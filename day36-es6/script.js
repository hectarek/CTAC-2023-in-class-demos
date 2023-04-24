// ES6 Variable Declaration

// let variable = '';

// const var2 = '';

// var hello = '';

// Functions

// function myFunction() {

// }

// let myFunctionVar = () => {

// }

// Classes

// function Animal(name, call) {
//     this.name = name;
//     this.call = call;
// }

// class Animal {
//     constructor() {

//     }
// }

// // returns a promise
// let countValue = new Promise(function (resolve, reject) {
// 	reject("Promise rejected");
// });

// // executes when promise is resolved successfully
// countValue.then(function successValue(result) {
// 	console.log(result); // Promise resolved
// });

// Default Parameter

// function add (x, y = 10) { // default is 10 when there is no y
//     return x + y;
// }

// console.log(add(4, 6));


// Template Literals

// let firstName = 'Jerry';
// let lastName = 'Mouse';

// console.log("Hello, " + firstName + " " + lastName);

// console.log(`Hello ${firstName} ${lastName} ${5+6}`)

// let x = 3;
// let y = 5;

// console.log(`The answer to your question is ${x+y}`)

// let obj = {
//     name: "Tom",
//     says: () => {
//         return `Hi this is ${this.name}`
//     }
// }

// let someHeading = "this"

// let myDiv = `
//     <div>
//         <h2>${someHeading}</h2>
//     </div>
// `

// const section = document.getElementById('section');

// section.innerHTML = myDiv;


// Destructuring

// const person = {
//     name: 'Sara',
//     age: 25,
//     gender: 'female'    
// }

// let { name, age, gender } = person

// // let dog = 'Thomas', cat = 'Bernard', mouse = 'Picos';

// console.log(name); // Sara
// console.log(age); // 25
// console.log(gender); // female
// console.log(email);

// let user1 = {
//     name: '2ldkfie2f',
//     email: 'user3@gmail.com',
//     isActive: true,
// }

let user2 = {
    name: '2ldkfie2f',
    email: 'user3@gmail.com',
    isActive: true,
}

// let {email} = user1;
// console.log(email)

// console.log(user1.email);

// let { email: theUserEmail } = user2

// console.log(theUserEmail);


// Rest Parameter 


// function add (...theRest) {
    
//     return theRest.reduce((x, total) => {
//         return x += total
//     }, 0)

// }

// console.log(add(2,4,5,6,4,3,3,3,2,24,2,5,25,2));

// function logEachItem (...items) {
//     items.forEach((item) => console.log(item));
// }

// logEachItem("This", "That", "the Other", "Another one", "Another one")


// Spread Operator

// // make an array of fruits with 6 fruits
// let fruits = ['apple', 'banana', 'orange', ];

// let allFruits = [ ...fruits, 'grape', 'kiwi', 'mango'];

// function spreadExample (...item) {
//     let word = [...item]
//     return word;
// }

// console.log(spreadExample('This Apple', "Another apple"));