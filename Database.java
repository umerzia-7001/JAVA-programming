package classwork;

import java.util.ArrayList;
public class Database {
	
	// declaring arraylist to store contact database
    private ArrayList<Contacts> db;

    // CONSTRUCTOR  making arraylist object
    
    public Database() {
        db = new ArrayList<>();
    }
    // Methods 
    
   
    public void addContact(String FirstName,String LastName, String Email,long No) throws ExceptionClass {
        Contacts contact1 = new Contacts(FirstName, LastName, Email,No);
        db.add(contact1);	 // Searching for user given variables and adding in arraylist
    }

    public void DeleteContact(long no) {
        for (Contacts c: db) {
            if (c.getNo() == no) {
                db.remove(c);	// Asking user to enter contact's number and using it to delete contact
                System.out.println("Contact Removed!!");
                return;
            }
        }
        System.out.println("Contact with id "+ no + " not found!");
    }
    
    public static void displayDatabase(ArrayList<Contacts> db) {
    	
        for (Contacts c: db){			
        	// Displaying database using toString
            System.out.println(c.toString() +"\n");
            
        }
    }
    public ArrayList<Contacts> getDb() {
        return db;
    }


    public ArrayList<Contacts> searchContact(String searchString) throws IllegalArgumentException{
        ArrayList<Contacts> reqContacts = new ArrayList<>();
        
        
            // searching for contact
        for (Contacts c: db){
            if (c.toString().contains(searchString))
                reqContacts.add(c);
        }
        return reqContacts;
    }

    
	
	
}