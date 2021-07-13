import java.util.*;
public class Q3_SI_CI {

	public static void main(String[] args) {
		double p,n,r,SI,CI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle value:");
		p=sc.nextDouble();
		System.out.println("Enter the rate of interest:");
		r=sc.nextDouble();
		System.out.println("Enter the time:");
		n=sc.nextDouble();
		
		
		SI=(p*n*r)/100;
		System.out.println("The simple interest is:" +SI);
		CI=p*Math.pow(1+r/100,n)-p;
		System.out.println("The compound interest is:" +CI);
	}

}
