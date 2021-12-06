const calculator = {
    add: function(a, b){
        console.log("add", a + b);
    },
    minus: function(a, b){
        console.log("minus", a - b);
    },
    multi: function(a, b){
        console.log("multi", a * b);
    },
    div: function(a, b){
        console.log("div", a / b);
    },
    power: function(a, b){
        console.log("power", a ** b);
    },
};

console.log(calculator.add(5, 6));
console.log(calculator.minus(5, 6))
console.log(calculator.multi(5, 6))
console.log(calculator.div(5, 6))
console.log(calculator.power(5, 6))