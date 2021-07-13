import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		double tax=0,inc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the income:");
		inc=sc.nextDouble();
		if(inc<=180000)
			System.out.println("No income taxes");
		if(inc<180000 & inc<=300000) {
			tax=(10*inc)/100;
			System.out.println("Income tax:"+tax);
		}
		if(inc>300000 & inc<=500000) {
			tax=(20*inc)/100;
			System.out.println(" income tax:"+tax);
		}
		if(inc>500000 & inc<=1000000) {
			tax=(30*inc)/100;
			System.out.println(" income tax:"+tax);
		}
	}

}
