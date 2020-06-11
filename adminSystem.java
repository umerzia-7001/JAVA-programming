package work;
import java.util.Scanner;
import java.util.Arrays;
public class adminSystem {
public void adminSystem() {
	//creating scanner object
	Scanner in=new Scanner(System.in);
	System.out.println("Are you admin or user"); //asking whether to login as user or admin 
	String entry=in.nextLine();
	//making array which will be used to compare user name and password
	String []CompName= {"umer","zia","def","ghi","qwe","abc","ali","asd","hjg","lkj"};
	String[] CompPass= {"123","234","345","456","567","789","890","276","386","836"};
	String[] UserName=new String[10]; // creating array for admin entires 
	String[] passwords=new String[10];
	
	if(entry.equals("admin")) {
		
		//asking for names and password from 
	  for(int y=0;y<10;y++) {
		  System.out.println("enter names");
		  UserName[y]=in.nextLine();
		  System.out.println("enter passwords");
		  UserName[y]=in.nextLine();	
		  }
	} //logging as user
	else if(entry.equals("user")) { //logging as user
		int count=0;
		
			System.out.println("Enter username");
			String name=in.nextLine();
			for(String s:CompName) {  //comparing user entered values with currently in system
				if(s.equals(name)) {
					int index=Arrays.asList(CompName).indexOf(name);  //if values match it returns their index respectively
			while(count<3) {	
					System.out.println("enter password"); //asking for user password
					String pass=in.nextLine();
					count++;
					
					if(pass.equals(CompPass[index])) {
						System.out.println("Welcome ! credentials match");//user entered fields matched with database
						count=3;
						
					}
					else {
						System.out.println("Credentials not match");
					}
					}
				}
			
		   }
	 }
		
 }

}