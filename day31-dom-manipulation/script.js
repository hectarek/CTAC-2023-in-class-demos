// Day 31, Dom practice examples


// 
// const list = document.getElementById("favoriteFruits");

// console.log(list);

// const para = document.getElementsByTagName('p');

// console.log(para);

// const headings = document.getElementsByClassName('heading');

// console.log(headings)

// const listItem = document.querySelector('ol');

// console.log(listItem.children[2]);


// const paras = document.querySelectorAll('p');

// console.log(paras);


//Get all inputs
// const inputs = document.getElementsByTagName('input');
// const inError = document.getElementsByClassName('error');

// inputs.length; //2
// inError.length; //1

// const paragraphs = document.querySelectorAll('p');
// const heading = document.querySelectorAll('h1');

// //Works!
// const pCount = paragraphs.length;
// const firstP = paragraphs[0];

// console.log("paragraphs", paragraphs);
// console.log("pCount", pCount);
// console.log("firstP", firstP);
// console.log("heading", heading);

// const paraArray = Array.from(paragraphs);
// paraArray.push(heading);
// console.log("paragraphs", paraArray);


//Doesn't work!
// links.forEach(function(link){
//         //do something with link
// });

// Array methods like forEach, map, reduce, and so on, don't work. Luckily, its easy enough to convert a nodeList into an Array;

// const links = document.querySelectorAll('a');
// const arrayOfLinks = Array.from(links);


// Children

// const selectedItem = document.querySelector('.selected');
// console.log(selectedItem);

// const firstItem = selectedItem.previousElementSibling;
// console.log(firstItem);

// const fruitList = document.getElementsByClassName('dragon')[0];

// console.log(fruitList.nextElementSibling);
// console.log(fruitList.parentElement.parentElement);


// Editing the DOM 


// const list = document.querySelector('ol');
// // const otherList = document.getElementsByTagName('ul')[0];

// const newListItem = document.createElement('li');
// newListItem.innerHTML = "SourSop / Guanavana";

// console.log(newListItem);

// list.appendChild(newListItem);

// for (let i = 3; i < 7; i++) {
//     let listItem = document.createElement('li');
//     listItem.innerHTML = 'item ' + i;
//     list.appendChild(listItem);
// }

// list.className = 'myClass';

// otherList.children[1].children[0].href = 'www.google.com';
// console.log(otherList);

// Add event Listeners

// const myButton = document.querySelector('button');
// const myTextBox = document.getElementById('text');
// const pTag = document.getElementById('your-text');


// myButton.addEventListener('click', (event) => {
//     console.log(myTextBox.value)
//     pTag.innerHTML = myTextBox.value;
//     myTextBox.value = "";
// })


// myTextBox.addEventListener('keyup', function(e) {
//     console.log(e);
//     if (e.key == "Enter"){
//         alert('You have submitted the text');
//     }
// });

document.getElementsByTagName('section')[0].addEventListener("click", (e) => {
    console.log(e.target)
})

// document.querySelector('.outer').addEventListener('click', function(e){
//     // e represents the event (element that has been clicked)
//         console.log(e.target, e.currentTarget);
//         //inner, outer
// })


// document.querySelector("#newtodo").addEventListener("keyup", function(e) {
//     if (e.keyCode == 13) {
//         console.log('Has pressed Enter');
//     }
// });

// const listItems = document.getElementsByTagName('li');

// console.log(listItems);


// // Browser Storage

// localStorage.setItem('accept-cookies', 'true');

// localStorage.setItem('first-item', "1");
// // Saves to localStorage space of web storage

// sessionStorage.setItem('first-item', "1");
// // Saves to sessionStorage part of web storage

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
// const objAsString = JSON.stringify(obj);
// localStorage.setItem('my-object', objAsString);

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

// // Will Override
// localStorage.setItem('nickname', 'Jerry Mouse');

// // Will not override
// if (localStorage.getItem('nickname') === null ) {
//     localStorage.setItem('nickname', 'Jerry Mouse')
// }
