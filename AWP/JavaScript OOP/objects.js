/*********************************************************
 * 
 * *********** Objects
 * 
// creating a object.
var userOne = {
    // properties of object
    email: 'nik@billionaire.com',
    name: 'NiK',
    // methods of object
    login(){
        // this keyword refer to current object.
        console.log(this.name, 'has logged in');
    },
    logout(){
        console.log(this.name, 'has logged out');
    }
};

userOne.email; // accessing property - dot notation
userOne['email']; // accessing propertry - bracket.


var sigma = 'email';
userOne[sigma]; // this works;
userOne.sigma; // this doesn't work;
userOne['sigma']; // this doen't work;

userOne.age = 25; // adding new property to object.

console.log(userOne);

*/

/******************************************
 * 
 * *********** Class
 */

class User {

    constructor(email, name) {
        this.email = email;
        this.name = name;
        this.score = 0;
    }
    login(){
        console.log(this.email, 'just logged in');
        return this; // return the object instance, used for method chaining
    }
    logout(){
        console.log(this.email, 'just logged out');
        return this; 
    }
    updateScore(){
        this.score++;
        console.log(this.score, 'is the score of', this.name);
        return this;
    }
}


class Admin extends User {
    deleteUser(user){
        users = users.filter(u => {
            return u.email != user.email;
        });
    }
}

/**************************
 * 
 * ******* classes under the hood.
 * 
 
function User(email, name) {
    this.email = email;
    this.name = name;
    this.online = false;
}

*********** Function prototype

User.prototype.login = function() {
    this.online = true;
    console.log(this.email, 'has logged in.');
}

User.prototype.logout = function() {
    this.online = false;
    console.log(this.email, 'has logged out.');
}
*
*/


userOne = new User('nik@billionaire.com', 'NiK');
userTwo = new User('ironman@stark.com', 'Tony Stark');

console.log(userOne);
console.log(userTwo);

userOne.login();
userTwo.logout();

userOne.login().updateScore().updateScore().logout(); // this method chaining.

admin = new Admin('admin@power.com', 'Rango');

users = [userOne, userTwo, admin];

admin.deleteUser(userTwo);

console.log(users);


// -- the 'new' keyword
// ---- creates a new empty object {}
// ---- sets the value of 'this' to be the new empty object
// ---- calls the constructor method