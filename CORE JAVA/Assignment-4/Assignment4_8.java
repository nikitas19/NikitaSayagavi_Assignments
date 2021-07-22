package ass4;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment4_8 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList();
		list.add(10);
		list.add(5);
		list.add(36);
		list.add(18);
		list.add(25);
		
		Consumer<ArrayList> numbers= (i)->{
			System.out.println(i);
		};
		print(list,numbers);
		}
		
		private static void print(ArrayList<Integer> list, Consumer<ArrayList> numbers) {
			Thread thread=new Thread(()->{
				numbers.accept(list);
				});
			thread.run();
		
	}

}
