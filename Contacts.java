package classwork;



public class Contacts {
	
	// instance variables
	
	 private String FirstName;
	 private String LastName;
	 private String Email;
	 private long No;
	
	 // CONSTRUCTORS
	 
	public Contacts() {
		
	}
	public Contacts(String FirstName,String LastName,String Email,long No) throws ExceptionClass,IllegalArgumentException{
		setFirstName(FirstName);
		setLastName(LastName);
		setEmail(Email);
		setNo(No);
		
	}
	
	// SETTER GETTERS
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) throws IllegalArgumentException{
		if (firstName==null) {
			
			throw new IllegalArgumentException();
		}
		else {
			FirstName = firstName;
		}
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) throws IllegalArgumentException{
		if(lastName==null) {
			throw new IllegalArgumentException();
		}
		else {
		LastName = lastName;
		}
	}

	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) throws IllegalArgumentException{
		if(email==null) {
			throw new IllegalArgumentException();
		}
	
	else {
		Email = email;
		}
	}

	public long getNo() {
		return No;
	}

	public void setNo(long no) throws ExceptionClass,IllegalArgumentException{
		if(no<=0) {
			System.out.println("number must be positive");
			throw new ExceptionClass("Number");
		}
		
	else {
		this.No = no;
	}
	}
	
	// toString
		public String toString() {
			return "Contacts FirstName=" + getFirstName() + ", LastName=" + getLastName() + ", Email=" + getEmail() + ", no=" + getNo() ;
		}

	
	
	
	
	
	

}
