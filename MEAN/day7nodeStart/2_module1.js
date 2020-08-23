// module http is added to this file.
const http = require('http'); 
// Getting user-defined module of another file.
const md = require('./3_exports.js');



const host = "127.0.0.1";
const port = 3000;


// defining a module in same file.
const dateToday = () => {
    return Date();
}


// creating server
const server = http.createServer((req, res) => {
    res.statusCode = 200;
    // accessing module of another file.
    res.write(md.externalModule());
    // accessing dateToday module
    res.write("Current date and time is " + dateToday() +"\n");
    // parameterised module
    res.write(md.myName("Joker"));
    res.end("\nChalo chal gya.!");
});


server.listen(port, host, () => {
    console.log("Server running...");
});

