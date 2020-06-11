package exercise;

public class SalariedEmployee extends Employee{
	
	private double WeeklySalary;
	
	public SalariedEmployee(String FirstName,String LastName,String SocialSecurityNo,double WeeklySalary) {
		super(FirstName,LastName,SocialSecurityNo);
		this.WeeklySalary=WeeklySalary;
	}

	
	
	
	@Override
	public double earnings() {
		
		return getWeeklySalary();
	}




	public double getWeeklySalary() {
		return WeeklySalary;
	}



	public void setWeeklySalary(double Salary) {
		WeeklySalary=Salary < 0.0 ? 0.0 : Salary;
	}
	public String toString() {
		return String.format(" Salaried Employee : %s\n%s : $%,.2f ", super.toString(),"Weekly Salary ",getWeeklySalary());
	}

}
