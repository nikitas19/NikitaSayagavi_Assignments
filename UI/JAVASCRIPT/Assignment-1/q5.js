function leapYear(){
    var i=2021;
    var count=0;
    document.write("The next 20 leap years are:<br>");
    for(i=2021;count<=20;i++)
    {
        
        if((i%4==0 || i%400==0) && (i%100 !=0))
        {
            
            document.write( i + "<br>");
            count++;
        }

    }
}
var submit = document.getElementById("answer");

submit.onclick = function()
{
    leapYear();
}