package ass4;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment4_5 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("nikita");
		list.add("vinuta");
		list.add("priya");
		list.add("shivani");
		list.add("shreya");
	
		StringBuilder s= new StringBuilder();
		for(String str:list) {
			s.append(str.charAt(0));
		}
		
		Consumer<StringBuilder> dispList = s1 ->System.out.println(s1); 
		dispList.accept(s);
		
	}

}
