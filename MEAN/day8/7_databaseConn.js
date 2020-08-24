// make sure mysql package is installed for mysql db
const mysql = require('mysql'); // include mysql


// connection object using mysql.createConnection
// Create
const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});

// connecting to database.
con.connect(function(err) {
    if (err) throw err;
    console.log("Connected.");
});