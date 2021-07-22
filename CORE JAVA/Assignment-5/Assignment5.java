package ass5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5 {

	public static void main(String[] args) {
		ArrayList<Fruit> fruits= new ArrayList<>();
		fruits.add(new Fruit("Apple",150,90,"Red"));
		fruits.add(new Fruit("Mango",135,450,"Yellow"));
		fruits.add(new Fruit("Guava",80,80,"Green"));
		fruits.add(new Fruit("Strawberry",60,100,"Red"));
		fruits.add(new Fruit("Chickoo",75,160,"Brown"));
		
		ArrayList<News> news = new ArrayList<>();
		news.add(new News(101,"nikita","First Video","very nice"));
		news.add(new News(102,"vinuta","Second Video","great"));
		news.add(new News(103,"shreya","Third-Video","very informative"));
		news.add(new News(104,"priya","Fourth","good "));
		news.add(new News(105,"shivani","Fifth..","nicely explained"));
		
		ArrayList<Trader> trader = new ArrayList<>();
		trader.add(new Trader("Ajay","Indore"));
		trader.add(new Trader("Sourabh","Delhi"));
		trader.add(new Trader("Dhruv","Pune"));
		trader.add(new Trader("Prajwal","Pune"));
		
		
		ArrayList<Transaction> transaction = new ArrayList<>();
		transaction.add(new Transaction(new Trader("Ajay","Indore"),2011,1000));
		transaction.add(new Transaction(new Trader("Sourabh","Delhi"),2011,1800));
		transaction.add(new Transaction(new Trader("Dhruv","Pune"),2009,900));
		transaction.add(new Transaction(new Trader("Prajwal","Pune"),2010,500));
		
		//1
		System.out.println("1.Fruits with calories less than 100 in descending order:");
		fruits.stream()
		.filter(a -> a.getCalories()<100)
		.sorted((o1,o2)-> o2.getCalories()-o1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		//2
		System.out.println("2.Color wise list of fruit names:");
		fruits.stream()
		.forEach(a->System.out.println(a.getName()+"\t"+a.getColor()));
		
		//3
		System.out.println("3.Red color fruits in ascending order:");
		fruits.stream()
		.filter(a->a.getColor().equalsIgnoreCase("red"))
		.sorted((o1,o2)-> o1.getPrice()-o2.getPrice())
		.forEach(a-> System.out.println(a.getName()));
		
		//4
		System.out.println("4.NewsId which received maximum comments:");
		News news1=news.stream()
				   .max((o1,o2)-> o1.getComment().length()-o2.getComment().length())
				   .get();
		System.out.println(news1.getNewsId());
		
		//5
		System.out.println("5.The count of word budget mentioned in the comments:");
		long count = news.stream()
	    .filter(a->a.getComment().contains("budget"))
	    .count();
		System.out.println(count);
		
		//6
		System.out.println("6.User who posted maximum comments:");
		News news2=news.stream()
				   .max((o1,o2)-> o1.getCommentByUser().length()-o2.getCommentByUser().length())
				   .get();
		System.out.println(news2.getNewsId());
		
		//7
		System.out.println("7.Comment by user wise number of comments:");
		news.stream()
		.sorted((o1,o2)-> o1.getCommentByUser().length()-o2.getCommentByUser().length())
		.forEach(a-> System.out.println(a.getComment()));
		
		 //8
		System.out.println("8.Transactions in the year 2011:");
		transaction.stream()
		.filter(n->n.getYear()==2011)
		.sorted((o1,o2)->o1.getValue()-o2.getValue())
		.forEach(a->System.out.println(a.trader.getName()));
		
		
		//9
		System.out.println("9.The cities in which traders work:");
		trader.stream()
		.distinct()
        .forEach(a-> System.out.println(a.getCity()));
		
		
		//10
		System.out.println("10.Traders from pune sorted by their name:");
		trader.stream()
		.filter(a-> a.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
		.forEach(a-> System.out.println(a.getName()));
		
		//11
		System.out.println("11.Traders names sorted alphabetically:");
		trader.stream()
		.sorted((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()))
		.forEach(a-> System.out.println(a.getName()));
		
		//12
		System.out.println("12.Traders based in Indore are:");
		trader.stream()
		.filter(a->a.getCity().equalsIgnoreCase("indore"))
		.forEach(a-> System.out.println(a.getName()));
		
		//13
		System.out.println("13.Transaction values of traders living in Delhi");
		transaction.stream()
		.filter(a-> a.trader.getCity().equalsIgnoreCase("delhi"))
		.forEach(a-> System.out.println(a.getValue()));
		
		//14
		System.out.println("14.Highest value of the transaction:");
		Transaction t1=transaction.stream()
					.max((o1,o2)->o1.getValue()-o2.getValue())
					.get();
		System.out.println(t1.getValue());
		
		//15
		System.out.println("15.Smallest value of transaction:");
		Transaction t2=transaction.stream()
				.min((o1,o2)->o1.getValue()-o2.getValue())
				.get();
		System.out.println(t2.getValue());
		
		
	}

}
