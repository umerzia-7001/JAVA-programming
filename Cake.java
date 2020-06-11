package HomeAssignment;
public abstract class Cake {
	
	// instance variables 
	private String name;
	private double rate;
	
	//constructors
	
	public Cake() {
		
	}
	
	public Cake(String name,double rate) {
		this.name=name;
		this.rate=rate;
	}
	// **methods**
	
	// abstract method to be implemented in subclass
	public abstract double calcPrice();
	
	public String toString() {
		return String.format("Name of cake is ",this.name,"\n rate is ",this.rate);
	}
	// abstract method to be implemented in subclass
	public abstract Object clone();
	
	// getter setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	
}
