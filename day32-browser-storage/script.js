// // Browser Storage

localStorage.setItem('accept-cookies', 'true');

localStorage.setItem('first-item', "1");
// Saves to localStorage space of web storage

sessionStorage.setItem('first-item', "1");
// Saves to sessionStorage part of web storage

// // Usage

// localStorage.setItem('test-item', "This localStorage thing is quite useful");
// localStorage.getItem('test-item'); // "This localStorage thing is quite useful"
// localStorage.removeItem('test-item');
// localStorage.getItem('test-item'); // null

// sessionStorage.setItem('test-item', "The sessionStorage object too!");
// sessionStorage.getItem('test-item'); // "The sessionStorage object too!"
// sessionStorage.removeItem('test-item');
// sessionStorage.getItem('test-item'); // null

// // Clearing storage

// localStorage.clear();
// console.log(localStorage); // {length: 0}

// sessionStorage.clear();
// console.log(sessionStorage); // {length: 0}

// // Saving Objects and Arrays

// const obj = { name: "Brian", lastName: "Adams" };
// console.log(obj)
// const objAsString = JSON.stringify(obj);
// console.log(objAsString)
// localStorage.setItem('my-object', objAsString);


// let myObj = localStorage.getItem('my-object');
// console.log(myObj.name);
// let myNewObj = JSON.parse(myObj);

// console.log(myNewObj.name);


// // Checking in Local Storage:

// localStorage.setItem('test', "x");


// console.log( Object.values(localStorage) ); 
// console.log( Object.keys(localStorage) ); 
// console.log( Object.entries(localStorage) ); 

// function doesItemExist(key) {
//   if (localStorage.getItem(key)) {
//     return true
//   } else {
//     return false
//   }
// }

// doesItemExist('test'); // true
// doesItemExist('test2'); // false

// // How to prevent override

// Will Override
localStorage.setItem('nickname', 'Jerry Mouse');
localStorage.setItem('nickname', 'Tom Cat');


// Will not override
if (localStorage.getItem('nickname') === null ) {
    localStorage.setItem('nickname', 'Jerry Mouse')
}
