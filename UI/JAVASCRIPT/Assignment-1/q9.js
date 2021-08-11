function newArray(){
    var a1= ["a","b","c"];
    var a2= ["1","2","3"];
    var n=[];

    var l= a1.length + a2.length;
    var j=0, k=0;
    for(i =0 ; i<l ;i++){
        if(i % 2 == 0){
            n[i]=a1[j++];
        }else{
            n[i]=a2[k++];
        }
    }
    document.write(n);
}
newArray();