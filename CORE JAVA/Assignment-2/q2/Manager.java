package q2;

public class Manager extends Employee {
int incentive,baseSalary;
    
	public Manager( int baseSalary, int incentive) {
    	this.baseSalary=baseSalary;
    	this.incentive=incentive;
    }
    
	@Override
	public int totalSalary(){
    	int totalSalary;
    	totalSalary=baseSalary + incentive;
    	return totalSalary;
    }
}
