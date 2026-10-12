package com.logicalStatements;

import java.util.Scanner;

public class NegativeOrZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		
		if (num<0 ) {
			System.out.println("Negative");
		} else if(num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positive ");
		}
		
	}

}
