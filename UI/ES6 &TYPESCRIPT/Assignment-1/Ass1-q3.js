var item = {
    id: "101",
    title: "Mobile",
    price: "15000",
    printOrder: function () {
        console.log("id:" + this.id);
        console.log("title:" + this.title);
        console.log("price:" + this.price);
    },
    getPrice: function () {
        return this.price;
    }
};
(item.printOrder());
console.log(item.getPrice());
var item2 = Object.assign({}, item);
item2.printOrder();
console.log(item2.getPrice());
//# sourceMappingURL=Ass1-q3.js.map