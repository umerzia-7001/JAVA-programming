package java123;

public class Current implements Accounts{

	// instance variables
	private String username;
	private long pin;
	private double balance;
	
	// CONSTRUCTORS
	public Current() {
		
	}
	public Current(String username,long pin,double balance) throws IllegalArgumentException{
		setUsername(username);
		setPin(pin);
		setBalance(balance);
	}
	
	// METHODS
	public Object withdraw(double amount)throws IllegalArgumentException {
		if(amount<this.balance) {
			boolean condition=CheckLimit(amount);
			
			if (condition==true) {
				double a=this.balance-=amount-(double)0.25;
				return a;
			}
			else {
				System.out.println("Cannot withdraw more then 10000!");
				return this.DisplayBalance();
			}
		}
		else {
			System.out.println( "Your account does not have this much amount !\n*********************************************");
			return this.DisplayBalance();
		}
		

	}
	
	public boolean  CheckLimit(double amounts) throws IllegalArgumentException{
		if (amounts<10000) {
			return true;
		}
		else {
		return false;
		}
		
	}
	
	public void depositBalance(double Balance) throws IllegalArgumentException{
		
		this.balance+=Balance;
	}

	
	public Object DisplayBalance() {
		return this.balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		
		this.username = username;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	



	

	
	
	
	
	
	
	
	
	
	
	

	
}
