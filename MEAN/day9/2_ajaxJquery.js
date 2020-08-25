const express = require('express');
const app = express();

// static files.
app.use(express.static('./static'));


// for post http req
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());



// post http req, event register
app.post("/domaths", function(req, res) {
    let jsonstrRcvd = req.body.xyz;
    // console.log(jsonstrRcvd); // {"t1":"8","t2":"7","oper":"*"}
    let jsobj = JSON.parse(jsonstrRcvd);
    // console.log(jsobj); // { t1: '8', t2: '7', oper: '*' }
    // console.log(jsobj.t1+ " "+ jsobj.t2); // 8 7
    let result = {};
    if (jsobj.oper == "*")
        result.multi = jsobj.t1 * jsobj.t2;
    else if (jsobj.oper == "-")
        result.minus = jsobj.t1 - jsobj.t2;
    // console.log(JSON.stringify(result)); // {"multi":56}
    res.send(JSON.stringify(result));

});





// server setup
app.listen(80, function() {
    console.log("Server is running at 80...");
});