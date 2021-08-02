package springcore.assignment.q7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {
	@Value("12345")
    private int id;
     
    @Value("Java Programing")
    private String title;

    @Value("R.D.Sharma")
    private String Authorname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorname() {
		return Authorname;
	}

	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}

	public SpelDemo(int id, String title, String authorname) {
		super();
		this.id =  id;
		this.title = title;
		Authorname = authorname;
	}

	@Override
	public String toString() {
		return "SpelDemo [id=" + id + ", title=" + title + ", Authorname=" + Authorname + "]";
	}
	
}
