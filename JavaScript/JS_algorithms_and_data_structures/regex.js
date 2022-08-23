/* Literal match
i.e. returns true if string contains regex */
let myRegex = /Hello/;
let myString = "Hello world!";
let test = myRegex.test(myString);
console.log(test);

// OR operator, |
myRegex = /Hello|hello|Bye|bye/;
console.log(myRegex.test(myString));

// Ignore case flag, i
myRegex = /hello/i;
console.log(myRegex.test(myString));

/* Extract match
Note: .match syntax is opposite of .test */
myString = "bye hello hElLo hELLO!";
console.log(myString.match(myRegex));
console.log(myString.match(myRegex).index);

// Flag to extract multiple patterns, g
myRegex = /hello/gi;
console.log(myString.match(myRegex));

/* Wildcard character, . */
myRegex = /.og/gi;
myString = "cog dog fog bog";
console.log(myString.match(myRegex));

/* Character classes, []
Matches any character within the square bracekts */
myRegex = /[aeiou]/gi;
myString = "The quick brown fox jumps over the lazy dog.";
console.log(myString.match(myRegex));

/* Character sets, -
Define a range of characters to match */
myRegex = /[b-d]og/gi;
myString = "cog dog fog bog zog";
console.log(myString.match(myRegex));

/* Negated character sets, ^
Define a range of characters to exclude
Using ^ for exclusion only applies within character sets */
myRegex = /[^b-d]og/gi;
myString = "cog dog fog bog zog";
console.log(myString.match(myRegex));

/* Repeating pattern wildcard (≥1), +
Checks pattern that occurs at least once */
myRegex = /s+/gi;
myString = "Mississipis";
console.log(myString.match(myRegex));

/* Repeating pattern wildcard (≥0), *
Checks pattern that occurs 0 or more times */
myRegex = /go*/gi;
myString = "goooooal gg hello";
console.log(myString.match(myRegex));

/* Lazy matching, ?
Greedy matching (default) finds the longest part of a string that matches the regex
Lazy matching finds the shortest part of a string that matches the regex */
myRegex = /".*?"/gi;
myString = "\"Hello\", then \"Goodbye\"";
console.log(myString.match(myRegex));

myRegex = /".*"/gi;
myString = "\"Hello\", then \"Goodbye\"";
console.log(myString.match(myRegex));

/* Search start, ^
Searches for pattern at the start */
myRegex = /^fox/gi;
myString = "The quick brown fox jumps over the lazy dog.";
console.log(myString.match(myRegex));

/* Search end, $
Searches for pattern at the end */
myRegex = /fox$/gi;
myString = "The quick brown fox jumps over the lazy dog.";
console.log(myString.match(myRegex));

// Shorthand character classes
/* Shortcut for all alphanumeric characters plus _, \w
Equivalent to [A-Za-z0-9_] */
myRegex = /\w/g;
myString = "The quick brown fox jumps over the !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} alphanumeric characters`);

/* Shortcut for non-alphanumeric characters and _, \W
Equivalent to [^A-Za-z0-9_] */
myRegex = /\W/g;
myString = "The quick brown fox jumps over the !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} non-alphanumeric characters`);

/* Shortcut for numeric characters, \d
Equivalent to [0-9] */
myRegex = /\d/g;
myString = "The 10 quick brown foxes jumps over the 1 !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} numeric characters`);

/* Shortcut for non-digits, \D
Equivalent to [^0-9] */
myRegex = /\D/g;
myString = "The 10 quick brown foxes jumps over the 1 !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} non-numeric characters`);

/* Whitespace, \s
Equivalent to [ \r\t\f\n\v] */
myRegex = /\s/g;
myString = "The 10 quick brown foxes jumps over the 1 !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} whitespace characters`);

/* Non-whitespace, \S
Equivalent to [^ \r\t\f\n\v] */
myRegex = /\S/g;
myString = "The 10 quick brown foxes jumps over the 1 !@#$% lazy dog.";
console.log(`myString has ${myString.match(myRegex).length} non-whitespace characters`);

/* Quantity specifiers, {}
{lower,upper} number of patterns (inclusive)
{n,} appears at least n times
{n} exactly n times */
myRegex = /go{2,4}al!/g;
myString = "goooooal! goal! goooal!";
console.log(myString.match(myRegex));

/* Optional, ? */
myRegex = /favou?rite/g;
myString = "My favorite food is chicken";
console.log(myRegex.test(myString));

/* Postiive lookaheads, ?=
Returns match if pattern found */
myRegex = /(?=b)/g;
myString = "The quick brown fox jumps over the lazy dog.";
if (myRegex.test(myString) == true) {
	console.log("String contains \"b\"");
} else {
	console.log("String does not contain \"b\"");
}

/* Negative lookaheads, ?!
Returns match if pattern not found */
myRegex = /(?!b)/g;
myString = "The quick brown fox jumps over the lazy dog.";
if (myRegex.test(myString) == true) {
	console.log("String contains \"b\"");
} else {
	console.log("String does not contain \"b\"");
}

/* Grouping characters, () */
myRegex = /b(el|oo)l/g;
myString = "boolean bell";
console.log(myString.match(myRegex));

/* Capture groups, \n
Capture groups are automatically numbered (left to right), starting at 1
Can use $n to access object's nth group outside the regex */
myRegex = /(row) \1 \1/g;
myString = "row row row your boat";
console.log(myString.match(myRegex));

/* Replace
.replace(regex_pattern, string_to_replace) */
myString = "one two three";
myRegex = /(one) (two) (three)/; // Change this line
let newText = "$3 $2 $1"; // Change this line
let result = myString.replace(myRegex, newText);
console.log(result);