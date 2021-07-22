package q1;

public class Singletone {
	private static Singletone single_instance= null;
	
	public String s;
	
	private Singletone() {
		s="This is singleton class and it cannot be inherited";
	}
	
	public static Singletone getInstance() {
		if(single_instance == null)
			single_instance = new Singletone();
		
		return single_instance;
	}

}
