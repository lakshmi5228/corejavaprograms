package com.logicalStatements;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks= sc.nextInt();
		
		if(marks>=35) {
			System.out.println("pass");
		} else {
			System.out.println("Falied");
		}
	}

}
