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
function add(firstNumber, secondNumber) {
    return firstNumber + secondNumber;
}
function showSpace(string) {
    string = string + "   ";
}
// let result = add("10" , "20")
var result = showSpace("Hi");
console.log(result);
// Add Quotes to result to make output
var output = "\"" + result + "\"";
// Same as old Javascript
document.getElementById("output").innerHTML = output;
