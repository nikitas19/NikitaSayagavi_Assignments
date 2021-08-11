interface Printable{
    printMessage():any;

}
let circle:Printable={
    printMessage(){
        console.log("This is a circle" );
    }
}
let employee:Printable={
    printMessage(){
        console.log("I am an employee");
    }
}
function printAll(...args: Printable[]){
    for(let a of args)
    a.printMessage();

}
printAll(circle,employee);
