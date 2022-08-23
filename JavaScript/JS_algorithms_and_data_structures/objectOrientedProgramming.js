let groceryList = {
  apples: 1,
  oranges: 2,
  "chicken wings": 3,
  numUnique: () => `Grocery list is ${Object.keys(groceryList).length} items long` // method (properties that are functions)
}

console.log(groceryList.apples); // retrieve property
console.log(groceryList["chicken wings"]); // retrieve property
let myString = "chicken wings";
console.log(groceryList.myString); // need to use brackets when using variables to access properties
groceryList.bananas = 4; // add property
groceryList.dairy = {
  milk: "1 carton",
  cheese: "2 serving",
} // add property (nested object)
groceryList.dairy.milk = 1; // edit property
delete groceryList.apples; // delete property
console.log(groceryList.numUnique()); // call object's method

// Check if object has property
console.log(groceryList.hasOwnProperty("apples"));
console.log('oranges' in groceryList);

// Iterate through keys of an object
function objToArr(obj) {
  let arr = [];
  objToArrHelper(obj);
  function objToArrHelper(obj) {
    for (let key in obj) {
      if (typeof obj[key] == "object") {
        objToArrHelper(obj[key]);
      } else {
        arr.push([key, obj[key]]);
      }
    }
  }
  return arr;
}
// console.log(objToArr(groceryList));
let groceryListItems = Object.keys(groceryList); // returns keys of object in an array
let groceryListEntries = Object.entries(groceryList) // returns key-value pairs as an array

/* Constructors
Functions that create new objects (like a blueprint)
Keyword "this" refers to new object the constructor will create (unlike objects where "this" refers to itself)
Constructors define properties and behaviors instead of returning a value as other functions might */
function Animal (species, name) {
  this.species = species;
  this.name = name;
}

let dabao = new Animal("dog", "大宝");
console.log(dabao.name);

console.log(groceryList instanceof Animal); // check if object was created using constructor
console.log(dabao.hasOwnProperty("name")); // check if object has own property (every instance of Animal has its own separate copy of the own property)

// Checks if object type is Animal; better to use instanceOf as constuctor can be overwritten
function isAnimal (animal) {
  if (animal.constructor === Animal) {
    return true;
  } else {
    return false;
  }
}


/* Prototypes
Properties in the prototype are stored in all instances of Animal --> useful for related objects
All objects have a prototype
A prototype is also an object, e.g. prototype of Animal.prototype is Object.prototype
An object is the subtype of a prototype; prototypes of an objects is the supertype */
// Set prototype property individually
Animal.prototype.isLiving = true;

// Own vs prototype properties
let ownProperty = [];
let prototypeProperty = [];
for (let property in dabao) { // iterate through all of the instance's properties
  if (dabao.hasOwnProperty(property)) {
    ownProperty.push(property); // add property to array if it is an own property
  } else {
    prototypeProperty.push(property); // add property to array if it is a prototype property
  }
}
console.log(ownProperty, prototypeProperty);

// Set multiple prototype properties using an object that already contains the properties
Animal.prototype = {
  constructor: Animal, // NOTE: remember to define constructor when using an object to set prototype, else the constructor that created the instance will be overridden (i.e. instance.constructor == Object, not Animal)
  eat: function() {
    console.log("nom nom");
  },
  sayName: function() {
    console.log(`My name is ${this.name}`);
  }
}

// Check instance's prototype; an object inherits its prototype directly from the constructor function that created it
Animal.prototype.isPrototypeOf(dabao);
Object.prototype.isPrototypeOf(Animal.prototype); // prototype of a prototype is Object.prototype

// Inheritance
let animal = Object.create(Animal.prototype); // create an instance using a prototype

function Dog(name) {
  this.name = name;
}
Dog.prototype = Object.create(Animal.prototype); // subtype inherits supertype properties
Dog.prototype.constructor = Dog; // IMPORTANT! need to reset subtype's constructor as it also inherits supertype's constructor in the previous step
Dog.prototype.bark = function() { // adding properties after inheritance is the same as constructor
  console.log("Woof!");
}
Dog.prototype.sayName = function() { // overrides supertype method; JS looks for the method in this order and will stop searching once the method is found: instance (dabao) --> subtype (Dog) --> supertype (Animal) --> Object
  console.log(`Woof! (My name is ${this.name}!)`);
}

dabao = new Dog("Dabao");
dabao.sayName();


/* Mixin
Allows other objects to use a collection of functions */
let runMixin = function(obj) {
  // Takes any object and gives it the run method
  obj.run = function() {
    console.log("Running");
  }
}

runMixin(dabao); // allows objects to access mixin methods
dabao.run();

// Using IIFE to group related functionality into a single object/module
let motionModule = (function () { // IIFE immediately returns an object
  return { // returned object contains all mixin behaviours properties of the object
    runMixin: runMixin, // add existing mixin to object
    flyMixin: function(obj) {
      obj.fly = function() {
        console.log("Flying");
      }
    }
  }
})();

motionModule.flyMixin(dabao);
dabao.fly();


/* Private properties
Creating a variable within the constructor changes the scope to within the constructor only; methods that can access the private variable (as they are declared in the same context) are called privileged methods
Closure is where a function always has access to the context in which it was created */
function Bird() {
  let eggCount = 10; // variable defined at block level (constructor)
  this.getEggCount = function() { // privileged method, able to access eggCount due to closure
    return eggCount;
  }
}