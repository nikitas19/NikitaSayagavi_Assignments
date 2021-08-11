/* Part a
let value = function (x=5,y=10) {
    console.log(x+y);
    
}
value();
value(15,20)
*/
var __spreadArray = (this && this.__spreadArray) || function (to, from) {
    for (var i = 0, il = from.length, j = to.length; i < il; i++, j++)
        to[j] = from[i];
    return to;
};
/* Part b
let userFriends = function (userName ,...arrayOfFriends) {
    console.log("Username:" + userName);
    console.log("Friends:" + arrayOfFriends);
     
}
userFriends("nikita","shreya","ayushi","dinesh");
*/
var printCityNames = function (message1) {
    var city = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        city[_i - 1] = arguments[_i];
    }
    console.log(message1);
    for (var i in city) {
        console.log(city[i].toUpperCase());
    }
};
var message1 = "List of cities:";
var cityArray = ['pune', 'mumbai', 'delhi', 'bangalore', 'chennai'];
printCityNames.apply(void 0, __spreadArray([message1], cityArray));
//# sourceMappingURL=Ass1-q5.js.map