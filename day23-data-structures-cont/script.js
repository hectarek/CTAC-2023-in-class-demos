// // For in Loop

// let fruits = ["apple", "banana", "orange", "mango"];

// for (let index in fruits) {
// 	console.log(fruits);
// }

// for (let index in fruits) {
// 	console.log(fruits[index]);
// }

// let person = {
// 	name: "Alice",
// 	age: 30,
// 	city: "New York",
// };

// for (let key in person) {
// 	console.log(key + ": " + person[key]);
// }

// for (let fruit of fruits) {
//   console.log(fruit);
// }

// // Maps

// let map = new Map();

// map.set("1", "str1"); // a string key
// map.set(1, "num1"); // a numeric key
// map.set(true, "bool1"); // a boolean key

// // remember the regular Object? it would convert keys to string
// // Map keeps the type, so these two are different:
// console.log(map.get("1")); // 'str1'
// console.log(map.get(1)); // 'num1'
// console.log(map.get(true)); // 'bool1'
// console.log(map.size); // 3

// console.log(map.has("1")); // true
// console.log(map.has(1)); // true
// console.log(map.has(2)); // false

// console.log(map.clear("1"));
// console.log(map.get("1")); // undefined

// // Objects as Keys

// let john = { name: "John" };

// // for every user, let's store their visits count
// let visitsCountMap = new Map();

// // john is the key for the map
// visitsCountMap.set(john, 123);

// alert(visitsCountMap.get(john)); // 123

// Sets

let set = new Set();

let john = { name: "John" };
let pete = { name: "Pete" };
let mary = { name: "Mary" };

console.log(set);

// visits, some users come multiple times
set.add(john);
set.add(pete);
set.add(mary);
set.add(john);
set.add(mary);

console.log(set);

// set keeps only unique values
console.log(set.size) // 3

for (let user of set) {
  user.name; // John (then Pete and Mary)
}
