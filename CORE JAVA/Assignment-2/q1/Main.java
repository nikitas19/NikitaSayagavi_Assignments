package q1;

public class Main {

	public static void main(String[] args) {
		Singletone x = Singletone.getInstance();
		
		System.out.println("String from x is " + x.s);
		
		Singletone y=Singletone.getInstance();
		
		System.out.println("String from y is " + y.s);
	}

}
