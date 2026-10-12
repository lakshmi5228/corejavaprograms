package com.logicalStatements;

import java.util.Scanner;

public class Reverse {

	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		 
		 int reverse=reverse(n);
		 System.out.println("Reverse number: " + reverse);
		 if(n==reverse) {
				System.out.println("Its a Plaindrome");
			} else {
				System.out.println("Its Not a Palindrome");
			}
		 System.out.println("Main method Ended");

	}
	

	 static int reverse(int n) {
		int rev=0;
		int r=0;
		int temp =0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10 + r;
		}
		if(rev==temp){
			boolean status=true;
		}
		return rev;
	} 
	 
}


