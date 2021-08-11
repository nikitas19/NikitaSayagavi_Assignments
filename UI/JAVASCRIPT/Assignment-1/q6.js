function list(){
    var list=["Hello", "world","in", "a","frame"];

    document.write("*********");
    document.writeln("<br>");
    for( i=0;i<list.length;i++){
        document.writeln("* " + list[i] + " * <br>");
    }
    document.write("*********");

}

list();