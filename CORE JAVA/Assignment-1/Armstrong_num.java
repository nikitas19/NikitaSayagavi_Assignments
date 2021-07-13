/**
 * 
 */

/**
 * @author NIKITA
 *
 */
import java.util.Scanner;
public class Armstrong_num {

	public static void main(String[] args) {
		int num,temp,rem,sum = 0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("Entered number is Armstrong number");
		}
		else
		{
			System.out.println("Entered number is not Armstrong number");
		}
		
		

	}

}
