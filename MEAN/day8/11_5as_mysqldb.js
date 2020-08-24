// include mysql
const mysql = require('mysql'); 


// Create ob
const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});


// Connect
con.connect(function (err) {
    if (err) throw err;
    console.log("connected.");
    // insert
    // let sql = "insert into products values (102, 'earphone', '999', 'jbl')";

    // select
    // let sql = "select * from products";

    // update
    let sql = "update products set price='8483' where id=101";
    con.query(sql, function(err, result) {
        if (err) throw err;
        // insert
        // console.log("Number of rows inserted: " + result.affectedRows);

        // select
        // console.log(result);
        
        // update
        console.log(result.affectedRows + " row(s) affected.");
    });
});