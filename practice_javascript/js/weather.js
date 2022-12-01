function onGeoOk(position) {
    const lat = position.coords.latitude;
    const lon = position.coords.longitude;
    console.log("You live in ", lat, lon);
}

function onGeoError() {
    alert("Can't find you. No Weather for you")
}

navigator.geolocation.getCurrentPosition(onGeoOk, onGeoError);