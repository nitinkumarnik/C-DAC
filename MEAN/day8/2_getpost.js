const express = require('express'); // include module
const app = express(); // create express module object

// Anonymous/callback functions called by system


// register event... get http request root call this
app.get("/", function(req, res) {
    res.send("World is here, Where are you?");
    console.log("http get req");
});


app.get("/one", function(req, res) {
    res.send("Look at the url.");
    console.log("/one");
});


/*
 * default http request method is get
 * get comes via http header
 * post comes with html body
 */

 // register event... post http request
app.post("/", function(req, res) {
    res.send("http post method: here");
    console.log("http post req");
});



// setting up server
app.listen(8081, function() {
    console.log("server is listening at 8081...");
});