package com.logicalStatements;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n=sc.nextInt();
		
		int count =0;
		int temp=n;
		
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		
		temp = n;
		int sum = 0;
		
		while(n>0) {
			int digit = n % 10;
			temp = n / 10;
			sum = sum + (int) Math.pow(digit, count);
			count++;
		}
		if(sum==temp) {
			System.out.println("It is a Disarium Number");
		} else {
			System.out.println("It is Not a Disarium Number");
		}
		
		

	}

}
