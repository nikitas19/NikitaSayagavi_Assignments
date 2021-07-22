package q2;

public class Labour extends Employee{
int overTime,baseSalary;
	
	public Labour(int overTime,int baseSalary) {
		this.overTime=overTime;
		this.baseSalary=baseSalary;
	}
	
	@Override
	 public int totalSalary(){
	    int totalSalary;
	    totalSalary=baseSalary * overTime;
	    return totalSalary;
	 }
}
