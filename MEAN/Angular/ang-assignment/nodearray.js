const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();

app.use(bodyParser.urlencoded({ extended:true}));
app.use(bodyParser.json());
app.use(cors());


app.post('/arraylogic', (req, res) => {
    // console.log(req.body.numval + ' '+ req.body.updval + ' ' + req.body.oper);
    let arr = [3, 5, 6, 7, 8];
    let numval = parseInt(req.body.numval);
    let updval = parseInt(req.body.updval);
    let oper = req.body.oper;
    let result = {};
    result.status = 0;


    if (oper == 'blur') {
        if (arr.includes(numval))
            result.status = 1;
    }

    if (oper == 'add') {
        arr.push(numval);
        result.status = 1;
    }

    if (oper == 'remove') {
        arr.splice(arr.indexOf(numval), 1);
        result.status = 1;
    }

    if (oper == 'modify') {
        arr.splice(arr.indexOf(numval), 1, updval);
        result.status = 1;
    }

    result.arrayvalues = arr;
    // console.log(result);
    res.send(result);
});






app.listen(80, () => {
    console.log("Server listen at port 80...");
});