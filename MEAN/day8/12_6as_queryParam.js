const express = require('express');
const app = express();


app.get("/", (req, res) => {
    res.send("Express is here, Where are you?");
});

// http://localhost:80/hiqp?num1=3&num2=2
app.get("/hiqp", (req, res) => {
    let num1 = req.query.num1;
    let num2 = req.query.num2;
    res.send("Difference is: " + (num1-num2));
});



app.listen(80, function() {
    console.log("listen at port 80...");
});