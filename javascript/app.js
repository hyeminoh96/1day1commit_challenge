const player = {
    name: "Hyemin",
    sayHello: function(otherPersonsName){
        console.log("Hello " + otherPersonsName + " nice to meet you!");
    },
};

console.log(player.name);
player.sayHello("Mimi");
player.sayHello("Juho")