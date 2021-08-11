var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, accountName, accountBal) {
        this.id = id;
        this.accountName = accountName;
        this.accountBal = accountBal;
    }
    Account.prototype.getBalance = function () {
        return this.accountBal;
    };
    return Account;
}());
;
var savingAccount = /** @class */ (function (_super) {
    __extends(savingAccount, _super);
    function savingAccount(id, accountName, accountBal, interest) {
        var _this = _super.call(this, id, accountName, accountBal) || this;
        _this.interest = interest;
        Account.totalBalance = _this.accountBal * (_this.interest) / 100;
        return _this;
    }
    savingAccount.prototype.total = function () {
        return this.getBalance() + Account.totalBalance;
    };
    return savingAccount;
}(Account));
var currentAccount = /** @class */ (function (_super) {
    __extends(currentAccount, _super);
    function currentAccount(id, accountName, accountBal, cash_credit) {
        var _this = _super.call(this, id, accountName, accountBal) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    currentAccount.prototype.total = function () {
        return this.getBalance() + this.cash_credit;
    };
    return currentAccount;
}(Account));
var acc1 = new savingAccount(101, "Nikita", 5000, 5);
var acc2 = new currentAccount(102, "shreya", 7000, 500);
console.log("Account-Id: " + acc1.id + " Account-Name: " + acc1.accountName + " Account-Balance: " + acc1.total());
console.log("Account-Id: " + acc2.id + " Account-Name: " + acc2.accountName + " Account-Balance: " + acc2.total());
//# sourceMappingURL=Ass3-q2.js.map