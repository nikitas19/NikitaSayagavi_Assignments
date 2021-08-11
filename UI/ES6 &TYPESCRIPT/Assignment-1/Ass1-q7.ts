//Part a
/*let array=["Nikita","shreya","ayushi","dinesh"];
let [n1,n2,n3,n4]=array;
console.log(n3);
*/
//part 2

let organization={
    myName:"nikita",
    address: {
         pincode : 416414,
         state: "Maharashtra",
        country : "India"
        
    }
        
};
let {myName,address } = organization;
console.log(address.pincode);

