import java.util.*;
public class Q9_avg {
	public static void main(String[] args) {
		int totalA=0,totalB=0,totalC=0,avgA = 0,avgB=0,avgC=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the marks for subject A for student "+ (i+1) +" :");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Enter the marks for subject B:");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Enter the marks for subject C:");
			c[i]=sc.nextInt();
		}
		
		for(int i=0;i<3;i++) {
			totalA=totalA+a[i];
			totalB=totalB+b[i];
			totalC=totalC+c[i];
			avgA=totalA/3;
			avgB=totalA/3;
			avgC=totalA/3;
			
		}
		System.out.println("Total score in subject A:"+totalA +" Average:"+avgA);
		System.out.println("Total score in subject B:"+totalB +" Average:"+avgB);
		System.out.println("Total score in subject C:"+totalC +" Average:"+avgC);
		
		int stu[]=new int[3]; 
		for(int i=0;i<3;i++) {
			stu[i]=a[i]+b[i]+c[i];
		}
		for(int i=0;i<3;i++) {
			System.out.println("Student "+(i+1)+" :");
			System.out.println("Total : "+stu[i]+" Average : "+stu[i]/3);
		}

}
}