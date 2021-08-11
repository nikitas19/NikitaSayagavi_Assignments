class Account{
    public id: number;
    public accountName: String;
    public accountBal:number;
    static  totalBalance:number;
    constructor(  id:number,  accountName:String,accountBal:number) {
        this.id=id;
        this.accountName=accountName;
        this.accountBal=accountBal;
    }
    getBalance(){
        return this.accountBal;
    }
};
class savingAccount extends Account{
    interest:number;
    constructor(id:number,  accountName:String,accountBal:number,interest:number){
        super(id,accountName,accountBal);
        this.interest=interest;
        Account.totalBalance = this.accountBal *(this.interest)/100;
    }
    total(){
        return this.getBalance() + Account.totalBalance;
    }
}
class currentAccount extends Account{
    cash_credit:number;
    constructor(id:number,  accountName:String,accountBal:number,cash_credit:number){
        super(id,accountName,accountBal);
        this.cash_credit=cash_credit;
    }
    total(){
        return this.getBalance() + this.cash_credit;
    }
}
var acc1 = new savingAccount(101,"Nikita",5000,5);
var acc2 = new currentAccount(102,"shreya",7000,500);
console.log(`Account-Id: ${acc1.id} Account-Name: ${acc1.accountName} Account-Balance: ${acc1.total()}`);
console.log(`Account-Id: ${acc2.id} Account-Name: ${acc2.accountName} Account-Balance: ${acc2.total()}`);

