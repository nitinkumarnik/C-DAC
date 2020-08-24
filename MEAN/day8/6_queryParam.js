const express = require('express');
const app = express();


app.get("/", (req, res) => {
    res.send("Lazy coder.");
    console.log("Now you see me.");
});


// by request object we can read the param.
// http://localhost/hitman?x=47&y=43
app.get("/hitman", (req, res) => {
    let codea = req.query.x;
    let codeb = req.query.y;
    res.send("Hitman is Agent "+ codea);
    // res.send(codeb);
});




app.listen(80, () => {
    console.log("Server listening at 80...");
});