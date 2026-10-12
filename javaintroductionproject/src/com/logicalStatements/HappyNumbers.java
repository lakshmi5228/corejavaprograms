package com.logicalStatements;

import java.util.Scanner;

//1.Write a Java program to check whether the given number is a Happy Number or not.
public class HappyNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		int num =n;
		while (num != 1 && num != 4) { 
			int sum = 0; 
			while (num > 0) { 
				int digit = num % 10; 
				sum = sum + (digit * digit); 
				num = num / 10; } num = sum; 
				} 
		 	if (num == 1) { 
		 		System.out.println(n + " is a Happy Number"); 
		 		} else { 
		 			System.out.println(n + " is not a Happy Number"); 
		 			}

	}

}
/*Example: 19
 1² + 9² = 1 + 81 = 82
8² + 2² = 64 + 4 = 68
6² + 8² = 36 + 64 = 100
1² + 0² + 0² = 1 
*/