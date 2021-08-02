package springcore.assignment.q1.part2;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address ob;
	
	
	public Customer(int customerId, String customerName, long customerContact, Address ob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.ob = ob;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ",  ob=" + ob + "]";
	}
	
}
