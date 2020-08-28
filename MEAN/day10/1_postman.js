// learning the postman tool.
const express = require('express');
const app = express();

// these two lines are used for post http method
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: true}));
// this handle ths json// directly supply json as part of body.
app.use(bodyParser.json());


app.post("/postmod", (req, res) => {
    let val = req.body.someval;
    console.log(val);
    res.send(val);
});

app.post("/processreq", (req, res) => {
    let jobj = {};
    let empno = req.body.empno;

    if (empno == 1) {
        jobj.dept = "finance";
        jobj.branch = "blr";
    } else {
        jobj.dept = "admin";
        jobj.branch = "local";
    }

    res.send(JSON.stringify(jobj));
});




app.get("/getmod", (req, res) => {
    let val = req.query.here;
    res.send(val);
    console.log(val);
});



app.listen(80, () => {
    console.log("Server is listening at port 80...");
});