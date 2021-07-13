

/**
 * @author NIKITA
 *
 */
import java.util.Scanner;
public class Armstrong2 {

	
	public static void main(String[] args) {
		int num = 100,rem,sum,temp;
		System.out.println("The Armstrong numbers falling in the range 100-999 are:");
		while(num<=999) {
			sum=0;
			temp=num;
			while(temp!=0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(sum==num) {
				System.out.println(num);
			}
			num++;
			
		}
		
	}

}
