import java.util.*;
public class Q7_Findnum {

	public static void main(String[] args) {
		int a[]=new int[15];
		int val;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value to be searched:");
		val=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(val==a[i])
			{
				System.out.println("Element " +val +" is present in the array");
			}
		}
		
	}

}
