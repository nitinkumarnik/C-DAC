const express = require('express');
const app = express();
const session = require('express-session');

// session object
app.use(session({
    secret: 'mrrobot',
    saveUninitialized: false,
    resave: false,
    cookie: {secure: false}
}));


app.get('/firstNum', (req, res) => {
    req.session.data = {};
    req.session.data.k1 = req.query.v1;
    res.send("req1 processed got parameter "+ req.query.v1);
});


app.get('/secNum', (req, res) => {
    req.session.data.k2 = req.query.v2;
    res.send("req2 processed v1 "+ req.session.data.k1);
});


app.get('/sessionpoc', (req, res) => {
    res.send("Result is "+ req.session.data.k1 * req.session.data.k2);
});



app.listen(90, () => {
    console.log("Server listening at port 90...");
});