package ass4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Orders{
	double price;
	String status;
	Orders(double price, String status){
		this.price=price;
		this.status=status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "order [price=" + price + ", status=" + status + "]";
	}
	
	
}

public class Assignment4_2 {

	public static void main(String[] args) {
		List<Orders> list= Arrays.asList(
				new Orders(1500,"ACCEPTED"),
				new Orders(120000,"REJECTED"),
				new Orders(8500,"COMPLETED"),
				new Orders(7540,"ACCPETED"),
				new Orders(10500,"COMPLETED"),
				new Orders(9090,"COMPLETED")
				);
		
		System.out.println("Orders having price more than 10000:");
		printConditionally(list, o -> o.getPrice() > 10000);
		
		System.out.println("Order status is:");
		printConditionally(list,o -> o.getStatus().equalsIgnoreCase("accepted")
				|| o.getStatus().equalsIgnoreCase("completed"));
	}
	
	private static void printConditionally(List<Orders> list,Predicate<Orders> predicate) {
		for(Orders o: list) {
			if(predicate.test(o)) {
				System.out.println(o);
			}
		}
	}

}
