package languageFundamentals;

import java.util.Scanner;

/* 1.Write a Java Program to complete below Requirements.
Create a class named ATM.

Static Variables
bankName field common for all users

Instance Variables accountNumber balance

Methods: -
deposit()
withdraw()
checkBalance()

->Create 2 ATM account objects.
->Assign appropriate values to the instance variables for each account.
->Perform different deposit and withdrawal operations on both accounts using the given methods.
->Display the balance of each account using the checkbalance () method.*/
public class ATM {
	
	//static variable
	static String bankName="SBI";
	
	//instance variable
	long accountNumber;
    double balance;
   
    // method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("deposited amount: "+amount );
    }

    // Method to withdraw money
    void withdraw(double amount) {
            balance = balance - amount;
            System.out.println("withdrawn amount: "+amount);
        } 
    
 // Method to check balance
    void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: " + balance);
    }

	
	public static void main(String[] args) {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter u r deposit Amount: ");
		double amount = sc.nextDouble();
		
		// Creating 2 ATM account objects
        ATM account1 = new ATM();
        ATM account2 = new ATM();

        // Assigning values to instance variables
        account1.accountNumber = 100001;
        account1.balance = 10000;

        account2.accountNumber = 100002;
        account2.balance = 20000;

        // Operations on Account 1
        System.out.println("----- Account 1 -----");
        account1.deposit(amount);
        account1.withdraw(amount);
        account1.checkBalance();

        // Operations on Account 2
        System.out.println("\n----- Account 2 -----");
        account2.deposit(amount);
        account2.withdraw(amount);
        account2.checkBalance();

	}	

}
