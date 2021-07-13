import java.util.*;
public class Q4 {

	public static void main(String[] args) {
	
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the marks of subject1:");
	      int a=s.nextInt();
	      System.out.println("Enter the marks of subject2:");
	      int b=s.nextInt();
	      System.out.println("Enter the marks of subject3:");
	      int c=s.nextInt();
	      if(a>60&&b>60&&c>60)
	      {
	    	  System.out.println("Result:Passed");
	      }
	      else if((a>60&&b>60)||(b>60&&c>60)||(c>60&&a>60))
	      {
	    	  System.out.println("Promoted");
	      }
	      else if((a>60||b>60||c>60)||(a<60&&b<60&&c<60))
	      {
	    	  System.out.println("Failed");
	      }
		}
	
	
	
	
	
	
	
	
	
	
	}
	
