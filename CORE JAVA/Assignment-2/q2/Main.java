package q2;

public class Main {

	public static void main(String[] args) {
			Manager nikita=new Manager(10000,100);
			int calcSalary = nikita.totalSalary();
			System.out.println("Total Salary:" + calcSalary);
			
			Labour sujata=new Labour(3000,5);
			calcSalary = sujata.totalSalary();
			System.out.println("Total Salary:" + calcSalary);
			
			
			
		}

	}


