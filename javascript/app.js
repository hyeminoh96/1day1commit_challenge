const h1 = document.querySelector("div.hello:first-child h1");
  
function handleTitleClick(){
    h1.classList.toggle("clicked");  // if classlist contains "clicked", remove "clicked"
                                    // if classlist doesn't contains "clicked", add "clicked"
                                    // calling like "clicked" as a token
}

h1.addEventListener("click", handleTitleClick);