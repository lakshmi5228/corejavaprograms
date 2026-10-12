package com.logicalStatements;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		
		if (num>100) {
			System.out.println("Greatest Number");
		} else {
			System.out.println("Lowest Number");
		}
		

	}

}
