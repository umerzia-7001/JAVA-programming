package LAB12_2;

public class InvalidDOB extends Exception {
	
	InvalidDOB(String message){
		super("\n"+message+" is not correct ");
	}

}
