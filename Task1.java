package classwork;


import java.util.Scanner;
import java.util.InputMismatchException;
public class Task1 {
	public static void main(String[] args) throws ExceptionClass,InputMismatchException{
		
		
		
		
		//creating object
		Database db = new Database();
		Contacts contact= new Contacts();
		
		// using
		db.addContact("umer","zia","umer@gmail",8928374);		
		db.addContact("ali","zubair","ali@gmail",8098374);
		db.addContact("hussan","abdullah","hussan@gmail",89894);
		
		// making Scanner object for user entry
		Scanner input = new Scanner(System.in) ;
			
			// displaying Menu
		
			System.out.println("Welcome !");
			System.out.println("What do you want to do ? \n1)Add a contact \n2)Display all contacts \n3)search for a contact\n4)Exit\n");
		try {
			int option=input.nextInt();
			
			// using switch for different options
				switch(option) {
				case 1:
			
						// takign user input for filling contact database
						System.out.println(" enter First Name");
						String entry1=input.next();
						contact.setFirstName(entry1);
						System.out.println("enter Last Name");
						String entry2=input.next();
						contact.setLastName(entry2);
						System.out.println("enter Email");
						String entry3=input.next();
						contact.setEmail(entry3);
						System.out.println("enter number");
						long entry4=input.nextLong();
						contact.setNo(entry4);
						
						// saving contact in database
						db.addContact(entry1,entry2,entry3,entry4);
						
						System.out.printf("Contact Saved !\n"+contact.toString());
							
						break;
	
						 
			case 2:
				// displaying contact 
				Database.displayDatabase(db.getDb());
                break;			
			
			
			
			case 3:
				// user input to search for a contact
			System.out.println("Enter item which you want to search");
			String searchString = input.next();
			
            var result = db.searchContact(searchString);
            
            Database.displayDatabase(result);
            
            System.out.println("Delete a Contact Y/N ");
            String delete = input.next();
            
            if (delete.equals("Y")) {
            	
            	 System.out.println("Enter number ");
            	 
            	 // deleting contact
                long no = input.nextLong();
                db.DeleteContact(no);
                break;
            }
            else {
            	System.out.println("Thank you ");
            	break;	
            }
				
			default:
				System.out.println("Thank you ");
				break;
				}
		
		}
		
		
		
	
		catch(ExceptionClass e){
			System.out.println(e);
		
		}
		catch(InputMismatchException e) {
			
			System.out.println(e);
		}
		
		}
}
