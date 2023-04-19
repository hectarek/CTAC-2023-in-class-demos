// // This simple script demonstrates the parsing and execution phases
// console.log("Hello, World!");
// // The JavaScript engine will parse this code and then
// // execute it by printing "Hello, World!" to the console.

// // Example of hoisting
// console.log(x); // Output: undefined
// var x = 5;
// console.log(x); // Output: 5

// console.log(y); // Output: undefined
// let y = 5;
// console.log(y); // Output: 5

// // Example of function calls and the call stack
// function first() {
// 	console.log("First function");
// 	second();
// }

// function second() {
// 	console.log("Second function");
// 	third();
// }

// function third() {
// 	console.log("Third function");
// }

// first(); // Output: "First function", "Second function", "Third function"

// async function asyncFunction() {
// 	return "Hello, World!";
// }

// asyncFunction().then((result) => console.log(result)); // Output: "Hello, World!"


// Promises

let myPromise = new Promise((resolve, reject) => {

    // Get info from this data base
    setTimeout(() => {
        let data = ['this', 'is', 'some', 'data'];
        if (data) {
            resolve(data);
        } else {
            console.log(data);
            reject("O NO, that didn't work");
        }
    }, 4000)
});

myPromise
    .then((data) => {
        // do some with data
        setTimeout(() => {
            let manipulatedData = data.map(item => item += " (s)");
            return manipulatedData;
        }, 2000)
    })
    .then((data) => {
        data.forEach((item) => console.log(item))
    })
    .catch((error) => {
        console.log(error);
    })


// async function getApiData() {
//     const response = await fetch('https://api.example.com/data');
//     const data = await response.json();
//     console.log(data);
//   }