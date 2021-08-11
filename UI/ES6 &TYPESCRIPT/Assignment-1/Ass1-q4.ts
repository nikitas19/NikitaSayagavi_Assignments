let names=['Tom','Ivan','Jerry'];

/*let names2=[];
for(let n of names){
   names2.push("{ "+n+": "+n.length +"}");
   //names2.push("Name:" + n + ":" + "Length:" + n.length);
}
console.log(names2);*/

let res = names.map((name) => 
({ Name: name, size: name.length}));
console.log(res);