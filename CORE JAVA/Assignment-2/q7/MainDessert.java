package q7;
import java.util.*;

public class MainDessert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String role,item,addItem,Candy,Cookie,IceCream;
		int quantity;
		double CandyCost=0,CookieCost=0,IceCreamCost=0;
		
		System.out.println("What is your role? \nowner \ncustomer");
		role=sc.next();
		if(role.equals("owner"))
		{
			List<String> newItem=new ArrayList<>();
			System.out.println("No. of items to be added in Dessert Shop : ");
			int scan = sc.nextInt();
			for(int i = 0; i < scan; i++) {
				System.out.println("Add item  " +(i+1) );
				addItem=sc.next();
				newItem.add(addItem);
					
			}
			System.out.println(newItem);

			
		}
		else
		{	
			System.out.println("Enter the item you want to order and quantity :");
			item=sc.next();
			quantity=sc.nextInt();
			
			if(item.equals("Candy"))
			{
				Candy c=new Candy();
				CandyCost=c.getCost(quantity);
				System.out.println("Total Cost of Candy is "+ CandyCost + " Rs.");
			}
			else if(item.equals("Cookie"))
			{
				Cookie co=new Cookie();
				CookieCost=co.getCost(quantity);
				System.out.println("Total Cost of Cookie is "+ CookieCost + " Rs.");
			}
			else if(item.equals("IceCream"))
			{		
				IceCream ic=new IceCream();
				IceCreamCost=ic.getCost(quantity);
				System.out.println("Total Cost of IceCream is "+ IceCreamCost + " Rs.");
			}
			else 
				System.out.println("Wrong choice,exiting from the shop ");
		
		}

	}

}
