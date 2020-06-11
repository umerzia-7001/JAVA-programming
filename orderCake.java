
package HomeAssignment;


	public class orderCake extends Cake implements Cloneable{
		
	// instance field
	private double weight;
			
	// constructors
	public orderCake() {
				
		}
	public orderCake(String name,double rate,double weight) {
		super(name,rate);
		this.weight=weight;
		}
	
	public double calcPrice() {
		
		return getRate()*weight;
	}
	
	// clone method to make copy of objects
	public Object clone() {
		return new orderCake(this.getName(),this.getRate(),this.weight);
	}
	// toString method overridden
	public String toString() {
		return"Highest price cake :"+getName()+" \nRate is : "+getRate()+" \nweight is :"+weight;
	}

}
