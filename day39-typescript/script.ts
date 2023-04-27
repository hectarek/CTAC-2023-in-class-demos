// TypeScript


// Need to compile to JavaScript first before using TypeScript

const person = 'Herman';

console.log(person);

const inputs = document.querySelectorAll('input');

inputs.forEach(input => {
  console.log(input);
});

// tsc script.ts


// Basic Types in TypeScript

let surname = 'Gorgonzola';
let age = 30;
let isTeacher = false;

surname = 20; // type error
surname = 'luigi'; // no error

// age = 'banana'; // type error
age = 40;

// isTeacher = 'yes';
isTeacher = true;


// Example

const circ = (diameter) => {
    return diameter * Math.PI;
  };

// Explicit Types
// TypeScript will check the type of the variable before compiling to JavaScript

const circumference = (diameter: number) => {
  return diameter * Math.PI;
};

// console.log(circumference('hello'));
console.log(circumference(7.5));



// Arrays
let names = ['arnold', 'helga', 'gerald'];

names.push('phoebe');
names.push(3); // type error
names[1] = 3; // type error

let numbers = [10, 20, 12, 15];

numbers.push(25);
numbers.push('shaun'); // type error
numbers[0] = 'shaun'; // type error

let mixedTypes = ['kenny', 5, 4, 'cartman', 6, 9];

mixedTypes.push('kyle');
mixedTypes.push(10);
mixedTypes[0] = 3;
mixedTypes.push(true); // error...

// // Objects
let karate = {
  name: 'Jackie Chan',
  belt: 'black',
  age: 80
};

karate.age = 60;
karate.name = 'Shining Dragon';
karate.age = '30';
karate.skills = ['fighting', 'sneaking']

karate = {
  name: 'Bruce Lee',
  belt: 'orange',
  age: 40,
  // skills: ['running'], // error if added
}; // no error


// Explicit Types
let character: string = 'mario';
let age: number;
let isLoggedIn: boolean;

age = 'thirty';
age = 30;

isLoggedIn = 25;
isLoggedIn = true;

// arrays
let trees: string[] = [];

trees.push('spruce');
trees.push('juniper');
console.log(trees);

// // union types
let number: number | string;

let mixed: (string|number|boolean)[] = [];
mixed.push('hello');
mixed.push(false);
mixed.push(20);
console.log(mixed);

let uid: string|number;

// objects
let ninjaOne: object;
ninjaOne = { name: 'yoshi', age: 30 };
ninjaOne = []; // allowed because arrays are objects

let ninjaTwo: {
  name: string,
  age: number,
  beltColour: string
};
ninjaTwo = { name: 'ken', age: 20, beltColour: 'black' };

// Using Any

let age: any = 25;

age = true;
console.log(age);
age = 'hello';
console.log(age);
age = { name: 'Dorothy' };
console.log(age);

let mixed: any[] = [];

mixed.push(5);
mixed.push('mario');
mixed.push(false);
console.log(mixed);

let user: { name: any, age: any };

user = { name: 'Hasan', age: 25 };
console.log(user);

user = { name: 25, age: 'Hasan' };
console.log(user);


// // Function and Void

// let greet = () => {
//   console.log('hello world');
// }

let greet: Function; // capital F unlike object

greet = () => {
  console.log("Hello");
}

const add = (a: number, b: number) => {
  console.log(a + b);
}

add(3,5);
add(3,'5'); // usually NaN

// What about optional params?

const subtract = (a: number, b: number, c?: number | string) => { // try default params
  console.log(a + b);
  console.log(c);
}

subtract(3,5);

// being explicit about returns

const minus = (a: number, b: number): number => { // explicit return type
  return a - b;
}

let result = minus(10,8); // TS infers the return type


// What if we don't return anything??

const multiply = (a: number, b: number): void => { // try default params
  console.log(a * b);
}

// undefined is not the same thing as void, any lack of any value

// Interfaces

interface User {
  id: string;
  name: string;
  email?: string; // optional
}

const user: User = {
  id: '1',
  name: 'John Doe',
  email: 'john@example.com',
};

// Interfaces with Functions

interface Greeter {
  (name: string): string;
}

const greet: Greeter = (name) => {
  return `Hello, ${name}!`;
};

console.log(greet('John')); // Hello, John!

// Generics

const addUID = (obj: object) => {
  let uid = Math.floor(Math.random() * 100);
  return {...obj, uid};
}

let objOne = addUID({ name: 'Jerry', age: 90 });

console.log(objOne.name); // error because it doesn't know the object

// we can use a generic value that captures all of the values from the object

const addUIDs = <T>(obj: T) => { // you can do <T extends object>
  let uid = Math.floor(Math.random() * 100);
  return {...obj, uid};
}


let objTwo = addUIDs({ name: 'Jerry', age: 90 });

console.log(objTwo.name); // error because it doesn't know the object


interface Data<T> {
  uid: number,
  dataType: string,
  data: T
}

const data1: Data<string> = {
  uid: 30,
  dataType: "Email",
  data: "The text of the email"
}

const data2: Data<object> = {
  uid: 30,
  dataType: "Email",
  data: {
    text: 'the text of the email'
  }
}