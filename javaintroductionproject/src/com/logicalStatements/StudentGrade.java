package com.logicalStatements;

import java.util.Scanner;

/* Today’s Assignment:- 10-09-26

Java
1.Create a Java program to calculate a Student Grade based on marks.
Requirements
Ask the user to enter marks.
Calculate the grade using if-else 
90–100 → A
75–89 → B
60–74 → C
40–59 → D
Below 40 → Fail
Output
Display the marks and corresponding grade.
Note: Handle invalid marks (below 0 or above 100).
*/
public class StudentGrade {

	public static void main(String[] args) {
		System.out.println("Check Student Grade...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks = sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Invalid Marks");
		}
		else if(marks>=90) {
			System.out.println("Grade: A Congrats!!!! ");
		} else if(marks>=89) {
			System.out.println("Grade: B Congrats!!!! ");
		} else if(marks>=75) {
			System.out.println("Grade: c Congrats!!!! ");
		} else if(marks>=60) {
			System.out.println("Grade: D Congrats!!!! ");
		} else if(marks>=40) {
			System.out.println("Just Pass need to more concentrate...");
		}else {
			System.out.println("Falied");
		}
		

	}

}
