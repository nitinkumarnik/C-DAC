var mod = require('./4_customModuleDefine'); // include the custom modules in this file


// calling the module named hey and printing it to console
console.log(mod.hey());

// calling module with arguments.
console.log(mod.addNum(2, 6));