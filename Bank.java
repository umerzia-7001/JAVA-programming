package java123;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		// making two bank accounts for savings and current each
		Savings savings=new Savings("umer",37405,10000);
		
		Current current=new Current("zia",7890,50000);
		
		// creating scanner object
		
		while(true) {
		// depositing balance
		try {
		Scanner input=new Scanner(System.in);
		System.out.println("How much money do you want to deposit");
		double dep=input.nextDouble();
		savings.depositBalance(dep);
		
		// displaying balance
		System.out.println("Balance for savings account is :"+savings.DisplayBalance()+" Rs.");
		System.out.println("Balance for current account is :"+current.DisplayBalance()+" Rs.");
		
		// withdrawing money
		System.out.println("how much do you want to withdraw from current account");
		double w1=input.nextDouble();
		System.out.printf("Remaining amount is %.3f",savings.withdraw(w1));
		System.out.println();
		
		System.out.println("how much do you want to withdraw from savings account");
		double w2=input.nextDouble();
		System.out.printf("Remaining amount is %.3f",current.withdraw(w2));
		System.out.println();
		
		// Zakat and Interest for savings account
		
		System.out.println("Zakat deduction for savings account is :");
		System.out.println(savings.CalculateZakatDeduction()+" Rs.");
		
		System.out.println("Interest for for savings account is :");	
		System.out.println(savings.CalculateTotalInterest()+" Rs.");
		break;
		}
		catch(InputMismatchException e) {
			System.out.println(e);
			System.out.println("Enter digits !");
			continue;
			
		}
		}
	}

}
