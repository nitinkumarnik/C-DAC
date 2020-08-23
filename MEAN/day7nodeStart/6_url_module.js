const url = require('url');

const adr = 'http://localhost:8080/default.htm?year=2017&month=february';

// url.parse() method return a url object with each part url as properties.
let uobj = url.parse(adr, true);

console.log(uobj.host); //returns 'localhost:8080'
console.log(uobj.pathname); //returns '/default.htm'
console.log(uobj.search); //returns '?year=2017&month=february'
let urldata = uobj.query; //returns an object: { year: 2017, month: 'february' }
console.log(urldata); // [Object: null prototype] { year: '2017', month: 'february' }
console.log(urldata.month); //returns 'february'





