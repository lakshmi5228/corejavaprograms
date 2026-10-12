package languageFundamentals;

import java.util.Scanner;

public class Banking {
	static double balance = 10000.0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to SBI Bank!");

		showBalance();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your deposit Amount: ");
		double amount = sc.nextDouble();

		depositBalance(amount);

		showBalance();

		System.out.println("!!!!Thank You!!!!");
	}

	static void depositBalance(double amount) {

		balance = balance + amount;
	}

	static void showBalance() {

		System.out.println("Available Balance: " + balance);
		
	}
}