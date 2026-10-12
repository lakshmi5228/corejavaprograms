package com.logicalStatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Your Eligible for vote");
		} else {
			System.out.println("Your not eligible");
		}

	}

}
