
public  class DatabasePersistence extends Persistence {
	
	@Override
	public void persist() {
		System.out.println("Persisted by Database ");
	}

}
