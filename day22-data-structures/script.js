// While Loops
// let myNum = 0;

// while (myNum < 10) {
//     console.log(myNum);
//     myNum+=1;
// }

// Do While
// let myOtherNum = 0;

// do {
//     console.log(myOtherNum);
//     myOtherNum++;
// } while (myOtherNum < 10)

// For Loops
// let str = '';

// for (let i = 0; i < 10; i++) {
//     str += i
//     console.log(str)
//     if (i > 5) {
//         console.log("That string is getting pretty big");
//     }
// }

// for (let i = 0; i < 10; i++) {
//     console.log(i);
//     console.log("This is before the break");
//     break;
//     console.log("This is after the break");
// }

// for (let i = 0; i < 10; i++) {
//     console.log(i);
//     console.log("This is before the continue");
//     continue;
//     console.log("This is after the continue");
// }

// Arrays

// // Good
// let myNameArray = ["John", "Susie", "Jose", "Issa"];

// // Less good
// let myName1 = "John"
// let myName2 = "Susie"
// let myName3 = "Jose"
// let myName4 = "Issa"

// console.log(myArray);

// console.log(myArray[2]);

// let myNameArray = ["John", "Susie", "Jose", "Issa"];

// myNameArray[1] = "Sally";

// console.log(myNameArray);

// console.log(" My Array's Length is " + myNameArray.length);


// let differentAnimals = ["dog", "cat", "bird", ["pig", "hedgehog", ["goat", "cow"]], "fish"]

// console.log(differentAnimals[3][2][1]);

// let plants = ['juniper', 'banana', 'shrub', 'orchid', 'fern'];

// plants.push('moss');

// console.log(plants);

// let myLastPlant = plants.pop();

// console.log(plants);
// console.log(myLastPlant);
// let newArray = [];

// for (let i = 0; i < plants.length; i++) {
//     console.log(plants[i]);
//     if (plants[i] === 'banana') {
//        newArray.push(plants[i]);
//     }
// }

// console.log(newArray);

let plants = ['juniper', 'banana', 'shrub', 'orchid', 'fern'];

plants.shift();
plants.unshift("oak")

console.log(plants)