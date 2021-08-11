function currencyConvert(){
    var c = document.getElementById("currency").value;

    var rupee = c * 74.28;
    var yen=  c * 109.14;
    var euro=  c * 0.84;
    var sterling=  c * 0.72;

    document.write( c +" Dollar is:<br>");
    document.write( rupee +" INR (Indian Rupee)<br>");
    document.write( yen +" Yen (Japanese Yen)<br>");
    document.write( euro +" Euro (Euro)<br>");
    document.write( sterling +" Pound (Pound Sterling)<br>");


}

var submit = document.getElementById("money");

submit.onclick = function()
{
    currencyConvert();
}