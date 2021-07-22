package q3;

public abstract class Bank {
	int id;
	String name;
	double balance;
	
	public Bank(int id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	

	public abstract double toFindCashInBank();
	

}
