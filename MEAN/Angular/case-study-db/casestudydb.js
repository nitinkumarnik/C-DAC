const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const mysql = require('mysql');
const cors = require('cors');

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(cors());


var pool = mysql.createPool({
    connectionLimit: 30,
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'test'
});

app.post("/login", (req, res) => {
    let userid = req.body.userid;
    let password = req.body.password;
    // console.log(userid+ '  '+ password);
    let sendLog = {isLogin: false};
    pool.getConnection( (err, con) => {
        // console.log("pool");
        if (err) {
            console.log("Db/Login failed.");
        } else {
            sql = "select * from users where userid = ?"
                con.query(sql, [userid], (err, result) => {
                    // console.log(result);
                    if (err) {
                        console.log("Query eroor");
                    } else {
                        if (result.length > 0) {
                            console.log(result[0].password);
                            if (password == result[0].password) {
                                sendLog.isLogin = true;
                            }
                            
                        } else {
                            console.log("login Something happend");
                        }
                    }
                    res.send(sendLog);
                });

        }

    });

});


app.post("/dblogic", (req, res) => {

    console.log(req.body);
    // console.log(req.body.empid);
    // console.log(inobj);
    let empid = req.body.empid;
    let firstName = req.body.firstName;
    let lastName = req.body.lastName;
    let dob = req.body.dob;
    let doj = req.body.doj;
    let grade = req.body.grade;
    let oper = req.body.oper;
    // if db failed, default send this.
    let outobj = {
        status: 0,
        arr: "",
        ed: ""
    };
    

    pool.getConnection( (err, con) => {
        // console.log("pool");
        if (err) {
            console.log("Db failed.");
        } else {

            // EDlogic
            if (oper == "srchfn") {
                // console.log("in edlogic");
                sql = "select * from employees where empid = ?"
                con.query(sql, [empid], (err, result) => {
                    // console.log(result.length);
                    if (err) {
                        console.log("Query error");
                    } else {
                        if (result.length > 0) {
                            outobj.status = 1;
                            outobj.ed = result;
                            // console.log(result);
                        } else {
                            console.log("srchfn Something happend");
                        }
                    }
                    // res.send(JSON.stringify(outobj));
                });
            } // EDlogic ends. 

            
            // Modify.
            if (oper == "modify") {
                // console.log("inside modify");
                sql = "update employees set firstName = ?, lastName = ?, dob = ?, doj = ?, grade = ? where empid = ?";
                con.query(sql, [firstName, lastName, dob, doj, grade, empid], (err, result) => {
                    // console.log(result);
                    if (err) {
                        console.log("Modifying error.");
                    } else {
                        if (result.affectedRows > 0) {
                            outobj.status = 1;
                        } else {
                            console.log("Something happend");
                        }
                    }
                    // res.send(JSON.stringify(outobj));
                });
            } // modify ends.

            
            sqlsel = "select * from employees";
            con.query(sqlsel, (err, result) => {
                // console.log("query result");
                if (err) {
                    console.log("Select error");
                } else {
                    outobj.arr = result;
                }
                // console.log(outobj);
                res.send(outobj);
            });

        } // pool else part ends.
    }); // pool ends.

}); // app.post ends.





app.listen(80, () => {
    console.log("Server is listening at port 80");
});