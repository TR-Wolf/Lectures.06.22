console.log("Hello World!");

// TypoScript Plugin Warning

// What is TypeScript?
// This File: HelloWorld.ts
//    [   Type Script   ]
//            ||
//            \/
//      [ Java Script ]

// What was the problem with the old java script.




//
// First Key Difference


// Supported Variable Types: (using const var or let) (var is global)
let variable1: string = "";
let variable2: number = 1.0;
let variable3: boolean = true;
let variable4: any; // Default for JS and TS

variable4 = "string";
variable4 = 1.0;
variable4 = true;

// Student Observations.
//  -

// Functions (Methods)
// Input with types
function name1(inputName:number){
}
// Output with types
function name2():number {
    return 1;
}
// Or putting them both together
function name3(inputName:number):number {
    return 1;
}
// Variable Types Data Source : https://www.typescriptlang.org/docs/handbook/2/everyday-types.html

// Canvas Example
function add(firstNumber: number, secondNumber: number) {
   return firstNumber + secondNumber;
}
function sayHello(name: string) : string {
    return "Hello ~" + name + "!";
}
// type script compile - tsc
// t"tsc HelloWorld.ts"
// let result = add("10" , "20")

let result = sayHello("World")

// Add Quotes to result to make output
let output = "\"" + result + "\"";

// Same as old Javascript
let outputElement = document.getElementById("output");
if (outputElement != null) {
    outputElement.innerHTML = output;
}

// tsc --init
// tsconfig.json


// Advanced ~

// Loops are the same as Java

// for
// for (let x = 0; x < 4; x++) {
//     console.log("We are looping " + x + " times!")
// }

// While condition
// let condition : boolean = true;
// while (condition) {
//     console.log("Just loop once");
//     condition = false;
// }

// Complex Variables
// (Similar but not the same as java classes)

// Let person be of type ...
// let person: {
//     name: string;
//     age: number;
//     isStudent: boolean;
// }
// person = {
//     name: "Thomas Wolf",
//     age: 24,
//     isStudent: false
// }
//
// console.log (person.name);

// Interfaces for Complex Types
// interface Person {
//     name: string;
//     age: number;
//     isStudent: boolean;
// }
//
// let person:Person;
// person = {
//     name: "Thomas Wolf",
//     age: 24,
//     isStudent: false
// }

// Classes! Even more similar to Java classes

// class Person {
//     private name: string;
//     private age: number;
//     private isStudent: boolean;
//
//     constructor(name: string, age: number, isStudent: boolean) {
//         this.name = name;
//         this.age = age;
//         this.isStudent = isStudent;
//     }
//
//     isAdult(): boolean {
//         return this.age >= 18;
//     }
// }