const quotes = [
    {
        quote: "Overcooked",
        author: "Steam",
    },
    {
        quote: "Sims",
        author: "Origin",
    },
    {
        quote: "GTA",
        author: "Epic Games",
    },
    {
        quote: "FIFA",
        author: "EA",
    },
    
]

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

console.log(quotes[Math.floor(Math.random() * 10)]);