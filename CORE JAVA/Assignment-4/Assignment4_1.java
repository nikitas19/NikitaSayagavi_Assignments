package ass4;

@FunctionalInterface
interface arithmetic{
	int operation(int a,int b);
}

public class Assignment4_1 {

	public static void main(String[] args) {
		arithmetic addition = (a,b) -> (a + b);
		System.out.println("Addition:" + addition.operation(10,20));
		
		arithmetic subtraction = (a,b) -> (a - b);
		System.out.println("Subtraction:" + subtraction.operation(15,5));
		
		arithmetic multiplication = (a,b) -> (a * b);
		System.out.println("Multiplication:" + multiplication.operation(10,2));
		
		arithmetic division = (a,b) -> (a / b);
		System.out.println("Division:" + division.operation(50,2));

	}

}
