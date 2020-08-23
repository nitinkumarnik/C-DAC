// include http module
const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;


// create server object
const server = http.createServer((req, res) => {
    // res.statusCode = 200; // status, 200 means OK
    // writeHead method, two arguments is passed.
    // first is status and second is type of response sent to client.
    res.writeHead(200, {'Content-type': 'text/html'});
    res.write("There is no place like 127.0.0.1\n"); // write to client.
    res.write("<h1>Test the html</h1>"); // write html to client, writeHead must be text/html
    res.write(req.url); // req, http.IncomingMessage object, request from the client.
    // console.log(req.url); // write to the console.
    res.end(); // end/close the response
});

// server listen
server.listen(port, hostname, () => {
    console.log("Server is running...");
});

