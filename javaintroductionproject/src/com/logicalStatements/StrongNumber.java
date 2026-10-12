package com.logicalStatements;

import java.util.Scanner;

public class StrongNumber {

	    public static void main(String[] args) {

	        System.out.println("Main method started");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number:");
	        int n = sc.nextInt();

	        int original = n;

	        int sum = strongNumber(n);

	        if (sum == original) {
	            System.out.println(original + " is a strong number");
	        } else {
	            System.out.println(original + " is not a strong number");
	        }

	        System.out.println("Main method ended");
	    }

	    static int strongNumber(int n) {

	        int sum = 0;

	        while (n > 0) {

	            int digit = n % 10;

	            int fact = 1;

	            for (int i = 1; i <= digit; i++) {
	                fact = fact * i;
	            }

	            sum = sum + fact;

	            n = n / 10;
	        }

	        return sum;
	    }


}
