// TypeScript
// Need to compile to JavaScript first before using TypeScript
var person = 'Herman';
console.log(person);
var inputs = document.querySelectorAll('input');
inputs.forEach(function (input) {
    console.log(input);
});
// tsc script.ts
// Basic Types in TypeScript
var name = 'Geralt';
var age = 30;
var isBlackBelt = false;
// name = 20;
// name = 'luigi';
// age = 'yoshi';
age = 40;
// isBlackBelt = 'yes';
isBlackBelt = true;
var circ = function (diameter) {
    return diameter * Math.PI;
};
// console.log(area('hello'));
console.log(circ(7.5));
