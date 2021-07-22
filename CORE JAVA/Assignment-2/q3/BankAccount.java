package q3;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fixedDeposits = 20000;
		double cashCredits = 30000;
		
		
		SavingAccountHolder s = new SavingAccountHolder(123,"Nikita",1000);
		CurrentAccountHolder c = new CurrentAccountHolder(456,"Shreya",3000);
		
		double Total=s.toFindCashInBank()+s.balance+c.balance+c.toFindCashInBank();
		
		System.out.println("Bank has Total Cash Rs:" + Total);

	}

}