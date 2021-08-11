var circle = {
    printMessage: function () {
        console.log("This is a circle");
    }
};
var employee = {
    printMessage: function () {
        console.log("I am an employee");
    }
};
function printAll() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    for (var _a = 0, args_1 = args; _a < args_1.length; _a++) {
        var a = args_1[_a];
        a.printMessage();
    }
}
printAll(circle, employee);
//# sourceMappingURL=Ass3-q3.js.map