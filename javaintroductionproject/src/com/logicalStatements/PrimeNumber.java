package com.logicalStatements;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isprime(int n) {

		boolean status = true;

		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers u want:  ");
		
		int n=sc.nextInt();
		int count=0;
		
		for(int i=0;i<=n;i++) {
			
		if(isprime(i)) {
			System.out.println(i);
			count++;
			
		}
		
		}
		System.out.println("main method ended!!");

	}

}
