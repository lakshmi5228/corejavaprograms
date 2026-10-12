package com.logicalStatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		System.out.println("****Welcome to the Voting portal****");
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter your Age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Your  Not Eligible for voting");
		} else {
			System.out.println("your eligible lets continue...");
		}
		
		
		System.out.println("Enter Your Gender: ");
		String gen=sc.next();
		String gender1="M";
		String gender2="F";
		
		if (gen.equalsIgnoreCase(gender1 )|| gen.equalsIgnoreCase(gender2 )) {
			System.out.println("Ok lets continue...");
		} else {
			System.out.println("Entered Gender is not Eligible");
		}
		
		System.out.println("Enter Your Voter ID: ");
		int vid= sc.nextInt();
		
		System.out.println("Choose to vote whos to win");
		
		int party = sc.nextInt();
		
		
		switch(party) {
		case 1->{
			System.out.println("Party Name: TDP");
			System.out.println("CM: Chandra Babu Naidu");
			System.out.println("Your Vote Goes to : CBN garu");
			break;
		}
		case 2 -> {
			System.out.println("Party Name : JanaSena ");
		    System.out.println("CM: Pawan Kalyan");
		    System.out.println("Your Vote Goes to: PSPK ");
		}
		case 3 -> {
			System.out.println("Party Name : YCP ");
		    System.out.println("CM: Jagan Muhan Reddy");
		    System.out.println("Your Vote Goes to: YCP ");
		}
		default->{
			System.out.println("Thanks for Voting to Nota!!!");
		}
		
		}
		

	}

}
