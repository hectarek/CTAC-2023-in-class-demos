// basics of TS
// let userName = "Nick";
// let age = 57;
// let isDoctor = true;
// console.log(userName);
// userName = 'Bob';
// age = '34'
// isDoctor = "Yes";
// Arrays 
// let names = ["Tom", 'Jerry', 'Spike'];
// names.push('Nibbles');
// console.log(names);
// names.push(34);
// names[1] = 4;
// let myMixedArray = ["Light Roast", "Dark Roast", 16, 32, true];
// myMixedArray.push(false);
// myMixedArray.push(39);
// myMixedArray[3] = "Medium Roast";
// Objects 
// let user = {
//     name: "Hasan",
//     age: 53,
//     isActiveUser: true,
//     emails: ['hasan@mail', 'hasan@gmail'],
// }
// user = {
//     name: "Louise",
//     age: 34,
//     isActiveUser: false,
//     emails: ['louise@mail', 'louise@gmail'],
// }
// console.log(user);
// Explicit Types
// let character: string = 'Grimes';
// let age: number;
// let trees: string[] = ['fir', 'spruce', 'oak'];
// let user: {
//     username: string,
//     age: number,
//     isActiveUser: boolean;
// }
// let number: any = 34;
// number = 34;
// number = '34';
// let data: {
//     responseHeader: string,
//     params: string[],
//     data: {
//         forecast: string[],
//         dailyTempH: number,
//     }
// }
// let greet: Function;
// greet = () => {
//     console.log("Hello Everybody")
// }
// greet();
// const add = (x:number, y:number, z:number):number => {
//     return x+y+z;
// }
// const subtract = (x:number, y:number, z:number):number => {
//     return x-y-z;
// }
// const calculator = (operation: Function, x:number, y:number, z:number): number => {
//     return operation(x,y,z);
// }
// console.log(add(3,6,5))
// calculator(add, 3, 4, 5);
// Void
var myConsoleLogFunction = function (myphrase) {
    console.log(myphrase);
    return myphrase;
};
myConsoleLogFunction("Say this thing");
var addStrings = function () {
    return 'This ' + myConsoleLogFunction('that');
};
console.log(addStrings());
