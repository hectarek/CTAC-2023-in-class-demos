let user = {
	name: "John Doe",
	email: ["john@mail.com", "john2@mail.com"],
	age: 31,
	isActive: true,
	dependent: {
		name: "Sally Sue",
		age: 32,
		email: ["sally@mail.com", "sally2@mail.com"],
	},
};

// let myVariable = "name";

// console.log(user[myVariable]);

// user.name = "Susan Derby";

// user.status = 'Online';

// user.dependent = 'Sally'

// console.log(user);

// let fruits = ["apple", "banana", "orange", "mango"];

// for (let i in fruits) {
//     console.log(fruits[i]);
// }

// for (let key in user) {
//     console.log(user[key]);
// }

// Map

// let myMap = new Map();

// myMap.set("Dog", "Charles");
// myMap.set("Cat", "Meowington III");
// myMap.set("Fish", "Jose");
// myMap.set("Lizard", "Martin");
// // console.log(myMap);

// console.log(myMap.size);

// let newMap = new Map([
//     [1, "Tree"]
// ])

// console.log(newMap);

// myMap.has("Pig");
// myMap.get("Lizard");

// Sets

// let john = { name: "John" };
// let pete = { name: "Pete" };
// let mary = { name: "Mary" };

// visits, some users come multiple times set.add (john) ; set.add (pete);

// let pets = ["Dog","Cat","Lizard","Dog","Cat","Lizard","Dog","Cat","Lizard"];

// let mySet = new Set();

// for (let pet of pets) {
//     mySet.add(pet);
// }

// // mySet.add(mary);

// console.log(mySet.has('Pig'));

// for (let pet of mySet) {
//     console.log(pet);
// }

// mySet keeps only unique values
// console.log(mySet.size); // 3


// Functions 

// function myFunction() {
//    console.log("Hello there");
// }

// console.log(myFunction());

function multiply (x,y) {
    let product = x * y;
    console.log(product);
    return product
}

console.log(multiply(3,4))

// multiply(3,4);