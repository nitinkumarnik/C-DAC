const express = require('express');
const app = express();

/*
 * To write event handling now,
 * we need details.
 * what will be string used to call the function?
 * what will be mod of http request?
 */

/*
 *   Doing POST.
 * Ensure that below 3 line are present in js code.
 */

const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());



// look for the folder and give to client
// without processing it.
app.use(express.static('./static'));


// get http request
app.get("/gmodreq", (req, res) => {
    let val = req.query.gval;
    res.send("Value recieved by get: " + val);
});



// post http request
app.post("/pmodreq", (req, res) => {
    let val = req.body.pval;
    res.send("Value recieved by post: " + val);
});



// post http request
app.post("/pmodjson", (req, res) => {
    let jsonstr = req.body.jsonstr;
    res.send("Recieved: " + jsonstr);
});





// server setup
app.listen(80, () => {
    console.log("Server is listening at port 80...");
});