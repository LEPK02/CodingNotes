/* Arrays */
const myArray = [1, 2, 3]; // can edit array because the pointer is not re-assigned
export { myArray }

// Push (append to end)
myArray.push(4, 5, "BOOM!");

// Pop (remove from end)
const BOOM = myArray.pop();

// Unshift (append to start)
myArray.unshift(myArray[0]);

// Shfit (remove from start)
myArray.shift(1);

// Combine array (does not modify original)
let concatArray = myArray.concat([6, 7, 8]);
console.log(concatArray);

// Splice (edits specified range)
myArray.splice(0, 2); // removes 1 elements, starting from index 0
myArray.splice(myArray.length - 1, 2, 9, 10) // removes 2 items from second-last index, adds remaining arguments as items

// Slice (extracts specified range; returns entire array if no arguments provided)
let slicedArray = myArray.slice(0, 1); // extraction starts at index 0, stops before 1
console.log(slicedArray);

// Spread operator (copies array)
let copiedArray = [...myArray];
let insertArray = [1, 2, ...myArray, 3];

// indexOf
myArray.indexOf(1); // returns index of argument, returns -1 if not found

// Includes (search)
myArray.includes(3, 1); // searches for 3 in myArray starting at index 1

// Map (creates a new array populated with the results of calling a provided function (callback function) on every element in the calling array)
let timesTwo = copiedArray.map(element => element * 2);
console.log(timesTwo);
// Implementing map
Array.prototype.myMap = function(callback) { // uses prototype of Array, thus can access the array using "this"
  // Create new array to prevent editing the original
  const newArray = [];

  // Apply the callback function on each element
  for (let i = 0; i < this.length; i++) {
    newArray.push(callback(this[i]));
  }

  return newArray;
};
timesTwo = copiedArray.myMap(element => element * 2);
console.log(timesTwo);

// forEach (applies function to each item in the array, does not return anything (unlike map))
timesTwo = copiedArray.forEach(element => element * 2);
console.log(timesTwo);

// Filter (calls a provided function on each element of an array and returns a new array containing only the elements for which that function returns true)
let largerThanFive = copiedArray.filter(item => item >= 5);
console.log(largerThanFive);

// Every (returns true if all values meet the criteria)
console.log(copiedArray.every(num => num > 0));

// Some (returns true if any value meets the criteria)
console.log(copiedArray.some(num => num < 0));

// Reduce (reduce method iterates over each item in an array and returns a single value, using a callback function that is called on each iteration (e.g. sum). callback function gets passed an accumulator (previous function(item)'s return value) which is returned at the end)
let sumOf = copiedArray.reduce((sum, current) => sum + current, 0); // second argument is the initial value of the accumulator

// Sort (sorts the elements of an array according to the callback function)
let ascending = copiedArray.sort((a, b) => a - b);
console.log(ascending);
let descending = copiedArray.sort((a, b) => a === b ? 0 : (a < b ? 1 : -1)); // 1 means b comes before a, 0 means a and b remains unchanged, -1 means a comes before b
console.log(descending);

// Split (splits a string into an array of strings according to a delimiter)
console.log("hello world!".split(/\s/));

// Join (joins a string into an array of strings according to a delimiter)
console.log(["hello", "world!"].join("\t"));

// "Range" (generates array from 1 to n)
let range = [...Array(5).keys()].map(num => num + 1);