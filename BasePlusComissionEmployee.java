package exercise;

public class BasePlusComissionEmployee extends CommisionEmployee{
	
	double BaseSalary;
	
	public BasePlusComissionEmployee(String first,String last,String SSN,double rate,double sales,double BaseSalary) {
		super(first,last,SSN,rate,sales);
		this.BaseSalary=BaseSalary;	
	}

	public double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(double base) {
		BaseSalary = (base<0.0)? 0.0: base;
	}

	public double earnings() {
		return getBaseSalary()+ super.earnings();
	}
	public String toString() {
		return String.format("%s %s; %s: $%,.2f"," Base Salaried Employee",super.toString(),"Base Salary",getBaseSalary());
	}
	
	
	
}
