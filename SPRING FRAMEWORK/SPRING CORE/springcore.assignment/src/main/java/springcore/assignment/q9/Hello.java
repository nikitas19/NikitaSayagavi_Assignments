package springcore.assignment.q9;

public class Hello {
	
	
	public void init() throws Exception
    {
        System.out.println( "Bean World has been " + "instantiated and I'm "
            + "the init() method");
    }
 
    public void destroy() throws Exception
    {
        System.out.println("Conatiner has been closed "+ "and I'm the destroy() method");
    }

}
