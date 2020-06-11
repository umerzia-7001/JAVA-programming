package exercise;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String First,String Last, String SSN,double wage,double hours) {
		super(First,Last,SSN);
		this.wage=wage;
		this.hours=hours;
	}

	@Override
	public double earnings() {
		if (getHours()<=40) {
			return getWage()* getHours();
		}
		else 
			return 40*getWage() +(getHours()-40)* getWage()*1.5;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double hourwage) {
		wage=(hourwage <0.0 )? 0.0 : hourwage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double workhours) {
		hours=((workhours >=0.0)&&(workhours <=168.00))?workhours:0.0;
	
	}
	public String toString() {
		return String.format("\n Hourly Employyee : %s\n%s : $%,.2f ; %s: %,.2f",super.toString()," Hourly wage",getWage() ," Hours worked",getHours());
	}
	


}
