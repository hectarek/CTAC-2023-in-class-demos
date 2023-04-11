// class Car {
// 	constructor(model, make, year) {
// 		this.model = model;
// 		this.make = make;
// 		this.year = year;
// 		this.speed = 60; // mph
// 		this.time = 1; // hour
// 	}

// 	mph() {
// 		return speed / time;
// 	}
// }

// // let sedan = new Car('Camry', 'Toyota', 2015);

// // console.log(sedan);
// // console.log(new Car);

// let userName = "Jerry";
// let isActive = true;

// let getUserInfo = (name, status) => {
// 	name = userName;
// 	status = isActive;

// 	return "Username: " + name + " status: " + status;
// };

// let user = {
// 	name: "Jerry",
// 	status: true,
// 	getUserInfo: (user, status) => {
// 		user.user;
// 		user;
// 	},
// };

// class User {
// 	constructor(name, status) {
// 		this.name = name;
// 		this.status = status;
// 	}
// 	getUserInfo() {
// 		return this.user + this.status;
// 	}
// }

// const Jerry = new User("Jerry", true);
// const Mary = new User("Mary", true);
// const Saj = new User("Saj", true);

class Book {
	constructor(title, author, year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	getBookSummary() {
		return "${this.title} was written by ${this.author} in ${this.year}.";
	}
	getBookAge() {
		const age = new Date().getFullYear() - this.year;
		return "S{this.title} is ${age} years old.]";
	}
	reviseYear(newYear) {
		this.year = newYear;
		this.revised = true;
	}
	static getTopBookStore() {
		return "Barnes & Noble";
	}
}

let myBook = new Book("This is a Book about Plants", "Hector Gonzalez", 2022);

class CookBook extends Book {
    constructor(title, author, typeOfFood) {
        super(title, author);
        this.typeOfFood = typeOfFood;
    }
}

let bbqBook = new CookBook("The South's Best Hogs", "Hector Gonzalez", "Southern Food");

console.log(myBook)
console.log(bbqBook)


