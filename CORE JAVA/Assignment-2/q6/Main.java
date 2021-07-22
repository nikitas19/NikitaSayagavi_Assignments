
public class Main {
	public static void getPersistence(Persistence persitent) {
		Persistence p = persitent;
		p.persist();
	}
	
	public static void main(String[] args) {
		FilePersistence filePersistence = new FilePersistence();
		getPersistence(filePersistence);
		
		DatabasePersistence databasePersistence = new DatabasePersistence();
		getPersistence(databasePersistence);

	}

}
