package LAB12_2;
import java.util.Scanner;

public class DOB {
	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter date of birth MM/DD/YYYY");
		
		String dob=input.next().trim();
		
		
		
		int  month=Integer.parseInt(dob.substring(0,2));
		int day=Integer.parseInt(dob.substring(2,4));
		int year=Integer.parseInt(dob.substring(4));
		
		
		
		try {
			DateBirth birth=new DateBirth(day,month,year);
			
			System.out.println("You were born in "+birth.getMonth()+"  month "+" on day "+birth.getDay()+" In year "+birth.getYear());
			

		}
		catch(InvalidDOB e){
			
			System.out.println(e);
			
		}
		
		
		
		
		
		
		
	}

}
