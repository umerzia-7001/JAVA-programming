package HomeAssignment;

public class readymadeCake extends Cake implements Cloneable{
	
	// instance variables
	private int quantity;
	
	// constructors
	public readymadeCake() {
		
	}
	public readymadeCake(String name,int quantity,double rate) {
		super(name,rate);
		this.quantity=quantity;
	}
	
	// ** methods **
	// implementing abstract methods 
	public double calcPrice() {
		
		return getRate()*quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// clone method to make copy of objects
	public Object clone() {
		return new readymadeCake(this.getName(),this.quantity,this.getRate());
	}
	@Override
	public String toString() {
		return"Highest price cake :"+getName()+" \nRate is : "+getRate()+" \nQuantity is : " + quantity ;
	}
	

}
