function fibonacci(number)
{

    var first = 0;
    var second = 1;
    var sum= 0;

    document.write(first+"<br>");
    document.write(second+"<br>");
    for(i=0; i<number; i++)
    {
            sum = first+second;
            first = second;
            second = sum;
            document.write(sum+"<br>");
    
    }
}

var submit = document.getElementById("submit");

submit.onclick = function()
{

    var number = parseInt(document.getElementById("number").value);
    fibonacci(number);
};