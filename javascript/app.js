const h1 = document.querySelector("div.hello:first-child h1");
  
function handleTitleClick(){
    if(h1.className === "active"){
        h1.className = "";  // className can be changed if you want
    } else {
        h1.className = "active";
    }
}

h1.addEventListener("click", handleTitleClick);