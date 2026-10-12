package com.logicalStatements;

import java.util.Scanner;

public class SumOfDig {
	
	static int sumofDigits(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		
		int sumofDigits =sumofDigits(n);
		
		System.out.println("Sum Of all Diogits: "+sumofDigits);
		
		System.out.println("Main method Ended");

	}

}
