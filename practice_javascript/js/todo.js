const toDoForm = document.getElementById("todo-form");
const toDoInput = document.querySelector("#todo-form input");
const toDoList = document.getElementById("todo-list");

const TODOS_KEY = "todos";

let toDos = [];

function saveToDos() {
    localStorage.setItem("todos", JSON.stringify(toDos));
}

function deleteToDo(event) {
    const li = event.target.parentElement;
    li.remove();
    toDos = toDos.filter((toDo) => toDo.id !== parseInt(li.id));
    saveToDos();
}

function paintToDo(newTodo) {
    const li = document.createElement("li")
    const span = document.createElement("span");
    const button = document.createElement("button");
    button.innerText = "❌";
    button.addEventListener("click", deleteToDo);
    li.appendChild(span);
    li.appendChild(button);
    span.innerText = newTodo;
    toDoList.appendChild(li);
}

function handleToDoSubmit(event) {
    event.preventDefault();
    const newTodo = toDoInput.value;
    toDoInput.value = "";
    toDoInput.value = "";
    toDos.push(newTodo);
    paintToDo(newTodo);
    saveToDos();
}

toDoForm.addEventListener("submit", handleToDoSubmit);

function sayHello(item) {
    console.log("this is the turn of ", item);
}

const savedToDos = localStorage.getItem("TODOS_KEY");
console.log(savedToDos);
if (savedToDos !== null) {
    const parsedToDos = JSON.parse(savedToDos);
    parsedToDos.forEach(sayHello);
}