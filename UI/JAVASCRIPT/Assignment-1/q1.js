function sum()
{
    var n;
    var sum = 0;
    var i=0;

    n = document.getElementById("num").value;
    
    for(i=0; i<=n; i++)
    {
        sum +=i;
    }
    document.getElementById("result").innerHTML="Sum of "+n+ " numbers is :"+sum;

}

var submit = document.getElementById("answer");

submit.onclick = function()
{
    sum();
}