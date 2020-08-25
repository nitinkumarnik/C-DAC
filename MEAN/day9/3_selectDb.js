let z = 8; // id for table. later i get it from user.

const mysql = require('mysql'); // include mysql module

// Create connection
let con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "test"
});

// obj by this we sent the json str
let result = {};
result.status = 0;
result.content = "";


// connect to Db.
con.connect(function(err) {
    if (err) {
         throw err;
    } else {
        console.log("Connected.");
        // Query excute on Db.
        con.query("select * from products where id = ?", [z], function(err, result1) {
            if (err) {
                result.status = -1;
                result.content = "Error";
            } else {
                result.status = 1;
                result.content = result1;
            }

                console.log(JSON.stringify(result));
                // {"status":1,"content":[{"id":1,"name":"rog strix","price":56000,"brand":"asus"}]}
        });
    }

});