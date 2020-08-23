// include http module
const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

// createServer() method of http creates a new HTTP server and returns it.
// when new request is received, the request event is called.
// request event provides two objects.
// ---- a request (an http.IncomingMessage object) - provides request details
// ---- and, a response (an http.ServerResponse object) - used to return data to caller.
const server = http.createServer((req, res) => {
  res.statusCode = 200; // set statusCode property to 200, to indicate successful response.
  console.log("Dikh rha h kya?"); // show message to console.
  res.write("Hello, World!"); // write response to client.
  res.end(); // close the response, adding content as and argument to end().
});


// ther server is set to listen on specified port and hostname.
// When it is ready, the callback fn is called. 
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});


// ctrl + C, to terminate the programme
// some more- process.exit() , stdout or stderr terminate right away.
// above we can also pass exit code as arguments.
// we can also set exit code as process.exitCode = value;