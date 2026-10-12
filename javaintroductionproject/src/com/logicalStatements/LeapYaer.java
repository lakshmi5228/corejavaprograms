package com.logicalStatements;

import java.util.Scanner;

public class LeapYaer {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		
		if (num%4==0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Normal Year");
		}
		

	}

}
