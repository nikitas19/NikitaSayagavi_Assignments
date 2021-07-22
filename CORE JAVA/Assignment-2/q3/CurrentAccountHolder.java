package q3;

public class CurrentAccountHolder extends Bank {
	double cashCredits = 30000;

	public CurrentAccountHolder(int id, String name, double balance) {
		super(id, name, balance);
		
	}

	@Override
	public double toFindCashInBank() {
		return cashCredits();
	}
	
	public double cashCredits() {
		return cashCredits;
	}

}
