package ass4;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Assignment4_6 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("nikita");
		list.add("vinuta");
		list.add("priya");
		list.add("shivani");
		list.add("shreya");
		
		System.out.println(list);
		
		UnaryOperator<String> unaryOperator = a->a.toUpperCase();
		
		list.replaceAll(unaryOperator);
		System.out.println(list);
	}

}
