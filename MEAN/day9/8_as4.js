const express = require('express');
const app = express();


app.use(express.static('./static'));


const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: true}));
app.use(bodyParser.json());


app.post("/winteriscoming", function(req, res) {
    let result = {};
    let arr = [2, 3, 4, 6, 7];
    result.status = 0;
    
    let an = req.body.nkey;
    // console.log(an);
    let jobj = JSON.parse(an);
    // console.log(jobj);
    let num = parseInt(jobj.num);
    let newnum = parseInt(jobj.newnum);
    let oper = jobj.fn;
    // console.log(num + " "+ newnum+ " "+ oper);

    if (oper == "edlogic") {
        if (arr.includes(num)) {
            result.status = 1;
            // console.log("edlogic  " + num);
        }
    };
    if (oper == "add") {
        arr.push(num);
        result.status = 1;
    };
    if (oper == "remove") {
        let pos = arr.indexOf(num);
        arr.splice(pos, 1);
        result.status = 1;
    };
    if (oper == "modify") {
        let pos = arr.indexOf(num);
        arr.splice(pos, 1, newnum);
        result.status = 1;
    };

    result.arr = arr;
    let resu = JSON.stringify(result);
    // console.log(resu);
    res.send(resu);
});




app.listen(80, function() {
    console.log("Server listen at port 80...");
});