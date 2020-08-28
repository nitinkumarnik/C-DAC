// update products set price = ? where id = ?
let x=1;
let y=44;

const mysql = require('mysql');

let con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});


con.connect(function(err) {
    console.log("This is the first function callback.");
    
    let sql = "update products set price = ? where id = ?";

    con.query(sql, [y, x], function(err, result) {
        if (err) throw err;
        console.log("This is the second function callback.");

        console.log(result.affectedRows + " row(s) affected.");
    });
});