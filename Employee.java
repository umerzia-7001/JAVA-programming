package exercise;

public abstract class Employee {
	private String FirstName;
	private String LastName;
	private String SocialSecurityNo;
	
	public Employee(String FirstName,String LastName,String SocialSecurityNo) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.SocialSecurityNo=SocialSecurityNo;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSocialSecurityNo() {
		return SocialSecurityNo;
	}

	public void setSocialSecurityNo(String socialSecurityNo) {
		SocialSecurityNo = socialSecurityNo;
	}
	
	public String toString() {
		return String.format(" %s %s\n Social Security No : %s",getFirstName(),getLastName(),getSocialSecurityNo());
	}
	public abstract double earnings();
	

}
