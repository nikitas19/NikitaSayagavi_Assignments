package q3;

public class SavingAccountHolder extends Bank {
	
	double fixedDeposits = 20000;

	public SavingAccountHolder(int id, String name, double balance) {
		super(id, name, balance);
		
	}
	
	

	@Override
	public double toFindCashInBank() {
		
		return fixedDeposits();
	}
	
	public double fixedDeposits() {
		return fixedDeposits;
	}
}
