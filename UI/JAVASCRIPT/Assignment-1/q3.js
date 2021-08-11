function parity(){
    n = document.getElementById("num").value; 

    if(n % 2 == 0){
        document.getElementById("result").innerHTML="Number is even";
    }else{
        document.getElementById("result").innerHTML="Number is odd";
    }
}
var submit = document.getElementById("answer");

submit.onclick = function()
{
    parity();
}