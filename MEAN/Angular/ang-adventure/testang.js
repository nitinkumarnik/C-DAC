const express = require('express');
const app = express();
const cors = require('cors');

const bodyParser = require('body-parser');

app.use(cors());
app.use(bodyParser.urlencoded({ extended: true}));
app.use(bodyParser.json());


app.post('/pocisimportant', (req, res) => {
    // console.log("reading input " + req.body.len + " second input " + req.body.bre);
    
    var xyz = {area:0, perimeter: 0};

    if (req.body.len != 0 || req.body.bre != 0) {
        xyz.area = req.body.len * req.body.bre;
        xyz.perimeter = 2*(parseInt(req.body.len) + parseInt(req.body.bre));
    }

    res.send(xyz);
});

app.post('/domaths', (req, res) => {
    console.log(req.body.v1+ ' '+ req.body.v2+ ' '+ req.body.oper);
    console.log(req.body);
    let v1 = req.body.v1;
    let v2 = req.body.v2;
    let oper = req.body.oper;
    let sendit = {"msg": "failure", "value":0};

    if (v1 >= 0 && v2 >= 0) {
        if (oper == '*')
            sendit = {"msg": "success", "value": v1*v2};
        else if (oper == '-')
            sendit = {"msg": "success", "value": v1-v2};
    }

    res.send(sendit);
});



app.listen(90, ()=> {
    console.log("server is listening at port 90...");
});