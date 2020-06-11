package exercise;

public class CommisionEmployee extends Employee{
	private double GrossSales;
	private double CommisionRate;
	
	
	public CommisionEmployee(String first,String last,String SSN,double rate,double sales) {
		super(first,last,SSN);
		this.CommisionRate=rate;
		this.GrossSales=sales;
	}


	@Override
	public double earnings() {
		
		return getCommisionRate()*getGrossSales();
	}


	public double getGrossSales() {
		return GrossSales;
	}


	public void setGrossSales(double gross) {
		GrossSales=(gross<0.0)? 0.0 :gross;
	}


	public double getCommisionRate() {
		return CommisionRate;
	}


	public void setCommisionRate(double commision) {
		CommisionRate=(commision>1.0 && commision<4.0)? commision : 0.0;
	}
	public String toString() {
		return String.format(" %s: %s\n%s: $%,.2f; %s: %.2f "," Commision Employee ",super.toString(),"Gross sales ",getGrossSales(),"Commision rate",getCommisionRate());
	}

	
	
	
	
	
}
