package com.logicalStatements;

import java.util.Scanner;

//Calculate discount based on shopping amount.
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter Your Complete Bill");
		
		double cost=sc.nextDouble();
		
		if(cost>=10000.0) {
			System.out.println("you get 5% Discount on ur shopping ");
		}else if(cost>=50000.0) {
			System.out.println("you get 10% Discount on ur shopping ");
		} else if (cost >=750000) {
			System.out.println("you get 20% Discount on ur shopping ");
		} else if (cost>=100000.0) {
			System.out.println("you get 35% Discount on ur shopping ");
		}else {
			System.out.println("pay Your Complete Bill ");
		}
		

	}

}
