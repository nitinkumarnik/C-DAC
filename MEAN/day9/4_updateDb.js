// variables, using for querying the Db. (update)
let price = 3453;
let id = 102; 

const mysql = require('mysql');


let con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});


let res = {};
res.status = 0;
res.content = "";

con.connect(function(err) {
    if (err) {
        res.status = -1;
        res.content = "Error: Db not connected.";
    } else {
        con.query("update products set price = ? where id = ?", [price, id], function(err, result) {
            if (err) {
                res.status = -1;
                res.content = "Error: updating in Db";
            } else {
                res.status = 1;
                res.content = result;
            }
            console.log(JSON.stringify(res));
            // {"status":1,"content":{"fieldCount":0,"affectedRows":1,"insertId":0,"serverStatus":2,"warningCount":0,"message":"(Rows matched: 1, Changed: 1  Warnings: 0","protocol41":true,"changedRows":1}}
        });
    }
});