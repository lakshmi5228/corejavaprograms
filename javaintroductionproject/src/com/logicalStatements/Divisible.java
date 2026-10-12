package com.logicalStatements;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num%5==0) {
			System.out.println("This number is Divisible By 5");
		} else {
			System.out.println("Not dividible");
		}

	}

}
