const loginInput = document.querySelector("#login-form input");
const loginInButton = document.querySelector("#login-form button");

function onLoginBtnClick() {
    console.log("hello", loginInput.value);
}

loginInButton.addEventListener("click", onLoginBtnClick);
