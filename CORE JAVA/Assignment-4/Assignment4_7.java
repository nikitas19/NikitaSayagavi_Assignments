package ass4;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class Assignment4_7 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> h = new LinkedHashMap<String,Integer>();
		h.put("nikita", 10);
		h.put("shreya", 20);
		h.put("vinuta", 30);
		h.put("priya", 40);
		h.put("shivani", 50);
		
		StringBuilder result= new StringBuilder();
		for(Entry<String, Integer> entry: h.entrySet())
		{	
			result.append(entry.getKey());
			result.append(entry.getValue());
		}
		
		Consumer<StringBuilder> lamda1=snew->System.out.println(snew);
		lamda1.accept(result);
	}

}
