var myName = "Bob"; // global-scope, can re-assign reference/pointer and re-declare
let greeting = "Hello"; // block-scope, can re-assign reference/pointer, cannot re-declare
const exclamation = "!"; // block-scope, cannot re-assign reference/pointer or re-declare
const EXCLAMATION = "!!";
Object.freeze(EXCLAMATION); // constant
console.log(myName.length);
console.log(myName[myName.length - 1]);


/* String */
let str = "10100111";
let radix = 2;
console.log(parseInt(str, radix)); // radix is the base of the number in the string; can parseFloat

console.log(`${greeting} ${myName}${EXCLAMATION} bye`); // template literals/formatted strings (note: uses backticks ``)


/* Function */
function hello(name="Bob", ...args) {
	console.log("Hello " + name + "!");
	for (let i = 0; i < args.length; i++) {
		if (typeof args[i] === "string") {
			console.log("Hello " + args[i] + "!");
		}
	}
	return;
}
// Destructuring arrays
let nameArray = ["Bob", "Tom", "Jerry", "Barney"];
hello(...nameArray); // ... operator spreads/unpacks the array
let [bob, tom,, barney] = nameArray; // destructuring array
console.log(bob);
let others;
[bob, ...others] = nameArray; // destructuring array with Rest parameter
console.log(others);

// Arrow function
const hi = (name) => (name == "Bob") ? console.log("Hi Bob")
: console.log("You're not Bob..."); // does not support variable hoisting unlike <function> declaration
hi("Bob");
hi("Bobby");

// Immediately Invoked Function Expression (IIFE) --> anonymous function
(function() {
	console.log("Hello world!");
})();


/* 
Equality operators
3 == "3" // true, equality operator
3 === "3" // false, strict equality operator
3 != "3" // false, inequality operator
3 !== "3" // true, strict inequality operator

// && and
// || or
*/


// var num;
// switch(num) {
// 	case 1:
// 		return "A";
// 		break;
// 	case 2:
// 		return "B";
// 		break;
// 	case 3:
// 		return "C";
// 		break;
// 	default:
// 		return "no alphabet";
// 		break;
// }


// Objects
const obj = {
	"prop1": 1,
	"prop2": 2,
	"prop3": "3",
	"propChainTernary": (9 + 10 == 21) ? "21"
		: (21 === "21") ? true
		: false,
	"propNested": {
		"propNested1": 11,
		"propNested2": 22
	}
};

console.log(obj.prop2);
delete obj.prop2;
console.log(obj.hasOwnProperty("prop2"));
console.log(obj["propChainTernary"]);
const { prop1: objProp1, prop2: objProp2, propNested: { propNested1: objNested1, propNested2: objNested2} } = obj; // destructuring objects
console.log(objProp1, objProp2, objNested1, objNested2);

const sum = ({ prop1, prop3 }) => prop1 + parseInt(prop3);
console.log(sum(obj));

const createObj = (name, age, gender) => {
	return { name, age, gender };
} // function for defining object literals

Math.random(); // generates random decimal between 0 and 1
let max = 10;
let min = 1;
Math.floor(Math.random() * (max - min + 1)) + min; // generate within a range, inclusive of endpoints


// Creating a class
export class Animal {
	constructor(species) {
		this._species = species; // underscore to indicate private variable
	}

	get species() {
		return this._species;
	}

	set species(updatedSpecies) {
		this._species = updatedSpecies;
	}
}

const cliffordBigRedDog = new Animal("dog");


/* Promise
If resolved, then takes resolve's argument (result) and executes the containing code
If rejected, then takes reject's argument (error) and executes the containing code */
const babyReveal = new Promise((resolve, reject) => {
	let isBoy;

	if (isBoy == "yes") {
		resolve("It's a boy!");
	} else {
		reject("It's a girl!");
	}
});

babyReveal.then((result) => {
	console.log(result);
}) .catch((error) => {
	console.log(error);
});

/* Allow JS to import modules
<script type="module" src="filename.js"></script> */
export { hello, hi }
// <export default> is used to create a fallback value for a file/module, only one per file

import { myArray } from "./dataStructures.js";
console.log(myArray);
// import myArray from "./dataStructures.js"; --> without {}, will import the default export of the file
// import * as structures from "./dataStructures.js";