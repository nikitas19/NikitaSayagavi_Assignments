package ass5;

public class Transaction {
	Trader trader;
	int year,value;
	
	public Transaction(Trader trader,int year, int value) {
		this.trader=trader;
		this.year=year;
		this.value=value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}