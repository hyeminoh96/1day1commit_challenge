const title = document.getElementsByTagName("h1"); // an array
console.log(title);
const title2 = document.querySelector(".hello h1"); // search an element by css selector, return only one
console.log(title2);
const title3 = document.querySelectorAll(".hello h1");
console.log(title3);