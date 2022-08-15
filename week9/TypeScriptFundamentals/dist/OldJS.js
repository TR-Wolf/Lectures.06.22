// Hello World in JavaScript!
console.log("Hello World!");


function add(firstNumber, secondNumber) {
  return firstNumber + secondNumber;
}

let result = "Adding 10 and 20! to get... " + add("10", "20");

// Add Quotes to result to make output
let output = "\"" + result + "\"";

// Same as old Javascript
let outputElement = document.getElementById("output");
if (outputElement != null) {
    outputElement.innerHTML = output;
}

