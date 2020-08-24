const express = require('express');
const app = express();

// http://localhost:93/dIT?var1=3
// url with dit also works not case-sensitive.
app.get("/dIT", (req, res) => {
    let num = req.query.var1;
    res.send("The value "+num+" * 2: "+num*2);
});


// http://localhost:93/M3?var2=3
app.get("/M3", (req, res) => {
    let num = req.query.var2;
    res.send("The value "+num+" * 3: "+num*3);
});

// res static files
app.use(express.static('./static'));

app.listen(93, () => {
    console.log("Server is listening at port 93...");
});