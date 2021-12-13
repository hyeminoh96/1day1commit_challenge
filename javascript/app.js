const h1 = document.querySelector("div.hello:first-child h1");
  
function handleTitleClick(){
    const clickedClass = "clicked";
    if(h1.classList.contains(clickedClass)){ // check class list contains clickedclass
        h1.classList.remove(clickedClass);  // className can be changed if you want
    } else {
        h1.classList.add(clickedClass);
    }
}

h1.addEventListener("click", handleTitleClick);