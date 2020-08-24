// include express module
const express = require('express');
const app = express(); // create object of express


// Registering for an event.
// If somebody comes with http request get then call this.
app.get("/", function(req, res){
    res.send("Yo.!");
    console.log("Hello, Express!");
});



// setting up the server ie http to run
app.listen(8081, function() {
    console.log("Server is listening at 8081");
});
