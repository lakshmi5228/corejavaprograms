package com.logicalStatements;

import java.util.Scanner;

//Calculate salary bonus based on years of experience.
public class SalaryBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter your Experience: ");
		int exp =sc.nextInt();
		
		double bonus;
		
		if(exp<1) {
			bonus=0;
		} else if(exp<=2) {
			bonus=5;
		} else if(exp<=4) {
			bonus=10;
		} else if(exp<=5) {
			bonus=15;
		} else {
			bonus=20;
		}
		
		 double bonusAmount = salary * bonus / 100;
	     double finalSalary = salary + bonusAmount;

	     System.out.println("Salary: " + salary);
	        System.out.println("Experience: " + exp + " years");
	        System.out.println("Bonus: " + bonus + "%");
	        System.out.println("Bonus Amount: " + bonusAmount);
	        System.out.println("Final Salary: " + finalSalary);
	    }
}
