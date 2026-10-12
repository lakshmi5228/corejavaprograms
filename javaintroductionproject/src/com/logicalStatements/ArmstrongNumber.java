package com.logicalStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("main method staretd");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		boolean isArmstrong = isArmstrong(n);
		
		if (isArmstrong) { 
			System.out.println(n + " is an Armstrong number"); 
			} else { 
				System.out.println(n + " is not an Armstrong number"); 
		}

	}
	static boolean isArmstrong(int n) {
		boolean status=false;
		int r=0;
		int sum=0;
		int temp=n;
		String str=Integer.toString(n);
		int digcount=str.length();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum+=Math.pow(r, digcount);
		}
		if(sum==temp) {
			status = true;
		}
		return status;
	
	}
	
}
