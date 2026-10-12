package com.logicalStatements;

import java.util.Scanner;

public class HrCallScenario {

	public static void main(String[] args) {
		System.out.println("Hello we calling from Hr department!");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("your Name please: ");
		String name=sc.nextLine();
		System.out.println("Ok Miss./Mr."+name+" Nice to meet you!");
		
		System.out.println("Are you 2026 Passed out?: ");
		int py=sc.nextInt();
		
		if(py==2026) {
			System.out.println("Ok Great! Can you please tell me about yourself? ");
			
			 System.out.println("Do you have any backlogs? (true/false)");
	            boolean backlog = sc.nextBoolean();
	            if(backlog==true) {
	            	System.out.println("Sorry u r not eligible for this position");
	            } else {
	            	System.out.println("Ok Great can pls tell This ");
	            }
	            if (py < 2025) {
	                System.out.println("Why do you have a gap?");
	            }
	            
	                if (backlog == false) {

	                    System.out.println("Are you willing to relocate?");

	                    boolean ans = sc.nextBoolean();

	                    if (ans == true) {

	                        System.out.println("Okay, great!which location are u preffered :?");
	                    }
	                    	String loc1="Hyd";
	                    	String loc2="Chennai";
	                        String loc3="Banglore";
	                        String str=sc.next();
	                        if(str.equalsIgnoreCase(loc1)|| str.equalsIgnoreCase(loc2) || str.equalsIgnoreCase(loc3)) {
	                        	System.out.println("Congratulations Your selected!!");
	                        }

	   
	                    else {

	                        System.out.println("Okay, we will consider your preference.");
	                    }
	                }
	                else {

	                    System.out.println("Okay, unfortunately you are not eligible for this position.");
	                }
	
	

	            }
		}
}

