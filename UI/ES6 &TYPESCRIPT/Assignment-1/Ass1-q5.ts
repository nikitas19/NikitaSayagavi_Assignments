/* Part a
let value = function (x=5,y=10) {
    console.log(x+y);
    
}
value();
value(15,20)
*/

/* Part b
let userFriends = function (userName ,...arrayOfFriends) {
    console.log("Username:" + userName);
    console.log("Friends:" + arrayOfFriends);
     
}
userFriends("nikita","shreya","ayushi","dinesh");
*/

let printCityNames = function (message1, ...city) {

    console.log(message1);
    
    for (let i in city) {
        console.log(city[i].toUpperCase());
    }
    
}

let message1 = "List of cities:";
let cityArray = ['pune', 'mumbai', 'delhi','bangalore','chennai'];
printCityNames(message1,...cityArray);