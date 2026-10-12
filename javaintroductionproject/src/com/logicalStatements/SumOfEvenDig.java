package com.logicalStatements;

import java.util.Scanner;
//1.Write a Java program to find the sum of digits at even positions of a given number.
	public class SumOfEvenDig {

	    public static void main(String[] args) {
	        System.out.println("Main method started");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number: ");
	        int n = sc.nextInt();

	        int sumOfDig = sumOfDig(n);

	        System.out.println("Sum of even position digits: " + sumOfDig);

	        System.out.println("Main method ended");
	    }

	    static int sumOfDig(int n) {

	        int sum = 0;
	        int dig = 0;
	        int position = 1;

	        while (n > 0) {

	            dig = n % 10;

	            if (position % 2 == 0) {
	                sum = sum + dig;
	            }

	            n = n / 10;
	            position++;
	        }

	        return sum;
	    }



}
