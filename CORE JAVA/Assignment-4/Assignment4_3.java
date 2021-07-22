package ass4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4_3 {

	public static void main(String[] args) {
		String name = "Nikita";
		   
			//Supplier
	       	Supplier<Boolean> boolSupplier = () -> name.length() == 10;
	        Supplier<Integer> intSupplier = () -> name.length() - 2;
	        Supplier<String> supplier = () -> name.toUpperCase();
	        
	        System.out.println("Using Supplier:");
	        System.out.println(boolSupplier.get());
	        System.out.println(intSupplier.get());
	        System.out.println(supplier.get());
	        
	        //Consumer
	        System.out.println("Using consumer:");
	        Consumer<Integer> display = a -> System.out.println(a);
	        display.accept(10);
	        
	        //Predicate
	        System.out.println("Using Predicate:");
	        Predicate<Integer> lesserthan = i -> (i < 18); 
	        System.out.println(lesserthan.test(10)); 
	        
	        //Function
	        System.out.println("Using Function:");
	        Function<Integer,Integer> f=a->a*a;
	        System.out.println(f.apply(10));
	        
	}
	}
