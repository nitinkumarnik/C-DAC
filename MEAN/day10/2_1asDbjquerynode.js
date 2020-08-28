const express = require('express');
const app = express();
const mysql = require('mysql');
const bodyParser = require('body-parser');


app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());

app.use(express.static('./static'));

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});




app.post("/dbprocess", (req, res) => {
    let keyid = JSON.parse(req.body.keyid);
    let resobj = {};
    resobj.status = 0;
/*
    con.connect((err) => {
        if (err) {
            
            console.log("Error Tumbad: Db failed.");
        } else {
*/

            sql = "select * from emp where empid = ?";
            con.query(sql, [keyid.empid], (err, result) => {
                if (err) {
                    res.res1 = "Error: Query falied..";
                    
                } else {
                    if (result.length > 0) {
                        resobj.res1 = result[0];
                        resobj.status = 1;
                        
                    } else {
                        resobj.res1 = "Not in Db.";
                    }
                }
                res.send(JSON.stringify(resobj));

            }); 
/*
        }
        
    });
*/
    
});




app.listen(80, () => {
    console.log("Server is listening at port 80");
});