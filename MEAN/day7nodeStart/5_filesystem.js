// include http
const http = require('http');
// include filesystem
const fs = require('fs');
/*
 * Some 'fs' methods
 * fs.readFile([filename], [typelike: utf8]optional, [callback fn])
 * fs.appendFile([filename], [data to append], [callback fn])
 * fs.open([filename], [flag like w,r], [callback fn])
 * fs.writeFile([filename], [data to write], [callback fn])
 * fs.unlink([filename], [callback fn]) - to delete file
 * fs.rename([oldfilename], [newfilename], [callback fn])
 */

const hostname = '127.0.0.1';
const port = 3000;


const server = http.createServer((req, res) => {
    res.write("Control at: 1\n");
    
    // read file.
    fs.readFile('./5_read.txt', 'utf8', (err, data) =>{
        if (err) throw err; // if have to handle it, if we won't write res.end();
        res.write("Control at: 3\n");
        res.write(data);
        console.log("res data to client.");
    });

    // append file, 
    fs.appendFile('./appendf.txt', 'data to append in file\n', (err) => {
        res.write("Control at: 4\n");
        if (err) throw err;
        console.log("Data appended to file.");   
    });

    res.write("Control at: 2\n");


    /*  Above are Async functions so it doesn't wait
     * for one method to finish the, it fire up the next
     * while one is still running. like that control reaches to
     * res.end() method and it give the error.
     */
    // return res.end("\nControl End.");
});

server.listen(port, hostname, () => {
    console.log("Server is running...");
});