/* Functional programming
Functional programming is a style of programming where solutions are simple, isolated functions, without any side effects outside of the function scope, i.e. INPUT -> PROCESS -> OUTPUT

Functional programming is about:
	1. Isolated functions - there is no dependence on the state of the program, which includes global variables that are subject to change
	2. Pure functions - the same input always gives the same output
	3. Functions with limited side effects - any changes, or mutations, to the state of the program outside the function are carefully controlled

Callbacks are functions passed as an argument into another function (to decide the invocation of that function)

First class objects can be assigned to a variable, passed into another function, or returned from another function 
In JavaScript, all functions are first class objects

Higher order functions are functions that take a function as an argument, or return a function as a return value

Lambda functions are functions passed in to or returned from another function

Principles of Functional Programming
	1. A function should ideally be a pure function, i.e. should not change or alter anything (called a mutation; its outcome(s) are called side effect(s))
	2. Always declare dependencies explicitly, i.e. if a function depends on another (global) variable or object being present, then pass that variable or object directly into the function as an argument

The arity of a function is the number of arguments it requires
Currying a function means converting a function of N arity into N functions of arity 1; useful when unable to supply all the arguments to a function at once
Partial application can be described as applying a few arguments to a function at a time and returning another function that is applied to more arguments
 */

 // Currying a function
 function unCurried(x, y) {
  return x + y;
}

function curried(x) {
  return function(y) {
    return x + y;
  }
}

curried = x => y => x + y;

const funcForY = curried(1);
console.log(funcForY(2));

// Partial application
function impartial(x, y, z) {
  return x + y + z;
}

const partialFn = impartial.bind(this, 1, 2);
partialFn(10); // 13