const express = require('express');
const app = express();


app.get("/hi123", function(req, res) {
    res.send("express is working.");
});


/*
 * Some useful information from previous assignment.
 *
app.get("/", (req, res) => {

    // response to client should be string
    // if int browser understand it as some code.
    res.send(md.add(400, 4));  // browser understand it as 404 Not Found error.
    res.send("The difference using module from another file: " + md.subs(16, 2));
    res.send("The sum using module from another file: " + md.add(6, 2));
    // res.send() can be called only one time.
    res.write("The difference using module from another file: " + md.subs(16, 2));
    res.write("\nThe multiply using module from another file: " + md.multiply(6, 2));
    res.end();
    
});
*/

app.listen(9080, () => {
    console.log("Server is listening at port 9080...");
});