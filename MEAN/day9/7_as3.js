// select * from products where id = ?

let id = 1;

const mysql = require('mysql');

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});


con.connect(function(err) {
    if (err) throw err;

    sql = "select * from products where id = ?";

    con.query(sql, [id], function(err, result) {
        if (err) throw err;
        console.log(result);
    });
});