console.log("Hello World!");

// TypoScript Plugin Warning

// What is TypeScript?
// This File: HelloWorld.ts
//    [   Type Script   ]
//            ||
//            \/
//      [ Java Script ]

// What was the problem with the old java script.





// First Key Difference
function add(firstNumber: number, secondNumber: number) {
   return firstNumber + secondNumber;
}

// Supported Variable Types:
// let decimal: number = 6;
// let hex: number = 0xf00d;
// let binary: number = 0b1010;
// let octal: number = 0o744;
// let big: bigint = 100n;

// Major Observations from the class?
//  - 

function showSpace(string: String) {
string = string + "   ";
}
// let result = add("10" , "20")

let result = showSpace("Hi")
console.log(result);

// Add Quotes to result to make output
let output = "\"" + result + "\"";

// Same as old Javascript
document.getElementById("output").innerHTML = output;