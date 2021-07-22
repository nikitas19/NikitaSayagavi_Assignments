package ass4;

import java.util.ArrayList;

public class Assignment4_4 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("nikita");
		list.add("vinuta");
		list.add("priya");
		list.add("shivani");
		list.add("shreya");
	
		System.out.println(list);
		
		list.removeIf(s -> (s.length() % 2) != 0);
		
		System.out.println(list);
	
	}

}
