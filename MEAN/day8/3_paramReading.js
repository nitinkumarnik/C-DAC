const express = require('express'); // include express module
const app = express(); // create object of express of module.


// this is used for static file
// means the files are not processed by express or event handling code
// instead they are directly given to client
// can access these file by link
// http://localhost/one.html without writing the folder name
app.use(express.static("./static"));


// http get request
app.get("/", (req, res) => {
    res.send("Yo.! It's magical express.");
});


// setting up the server
app.listen(80, () => {
    console.log("Server is listening at port 80...");
});