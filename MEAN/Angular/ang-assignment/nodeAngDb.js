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


app.post("/dblogic", (req, res) => {

    console.log(req.body);
    console.log(req.body.empid);
    
    // console.log(inobj);
    let empid = req.body.empid;
    let empname = req.body.empname;
    let mobileno = req.body.empmob;
    let location = req.body.emploc;
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
            if (oper == "blur") {
                // console.log("in edlogic");
                sql = "select * from emp where empid = ?"
                con.query(sql, [empid], (err, result) => {
                    // console.log(result.length);
                    if (err) {
                        console.log("Query eroor");
                    } else {
                        if (result.length > 0) {
                            outobj.status = 1;
                            outobj.ed = result;
                            // console.log(result);
                        } else {
                            console.log("edlogic Something happend");
                        }
                    }
                    // res.send(JSON.stringify(outobj));
                });
            } // EDlogic ends. 

            // Add to db.
            if (oper == "add") {
                // console.log("inside add");
                sql = "insert into emp values (?, ?, ?, ?)";
                con.query(sql, [empid, mobileno, location, empname], (err, result) => {
                    // console.log(result); 
                    if (err) {
                         console.log("Insertion error.");
                     } else if (result.affectedRows > 0) {
                        console.log("1");
                        outobj.status = 1;
                     }
                    //  res.send(JSON.stringify(outobj));
                });
            } // add ends.

            // Modify.
            if (oper == "modify") {
                // console.log("inside modify");
                sql = "update emp set mobileno = ?, location = ?, empname = ? where empid = ?";
                con.query(sql, [mobileno, location, empname, empid], (err, result) => {
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

            // Remove
            if (oper == "remove") {
                // console.log("inside remove");
                sql = "delete from emp where empid = ?";
                con.query(sql, [empid], (err, result) => {
                    if (err) {
                        console.log("Removal error");
                    } else {
                        if (result.affectedRows > 0) {
                            outobj.status = 1;
                        } else {
                            console.log("remove Something happend");
                        }
                    }
                    // res.send(JSON.stringify(outobj));
                });
            }// remove ends.

            sqlsel = "select empid, empname, mobileno, location from emp";
            con.query(sqlsel, (err, result) => {
                // console.log("query result");
                if (err) {
                    console.log("Select error");
                } else {
                    outobj.arr = result;
                }
                console.log(outobj);
                res.send(outobj);
            });

        } // pool else part ends.
    }); // pool ends.

}); // app.post ends.





app.listen(80, () => {
    console.log("Server is listening at port 80");
});