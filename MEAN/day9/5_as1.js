const express = require('express');
const app = express();


app.use(express.static('./static'));


const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.post("/process", function(req, res) {
    let jsonstr = req.body.xyz;
    let jsobj = JSON.parse(jsonstr);
    let result = {};
    if (jsobj.empno == 3 && (jsobj.loc == "bangalore" || jsobj.loc == "blr")) {
        result.dept = "finance";
        result.branch = "corporate";
    } else {
        result.dept = "admin";
        result.branch = "local";
    }

    res.send(JSON.stringify(result));
});



app.listen(80, function() {
    console.log("listen port 80...");
})