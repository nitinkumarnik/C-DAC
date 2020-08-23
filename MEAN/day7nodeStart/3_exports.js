// module can be exported by exports keyword.
exports.externalModule = () => {
    return "Comming from different file.\n";
};

// module with parameter
exports.myName = (name) => {
    return "Your name is: " + name + "\n";
};