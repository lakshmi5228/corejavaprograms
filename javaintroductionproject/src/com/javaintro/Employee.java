package com.javaintro;

public class Employee {
	
	
	//instance variables
	int employeeID;
	String employeename;
	int salary;
	int experience;
	char grade;
	String permanentstatus;
	
	//static block
	static {
		System.out.println("Our Company Employee Details");
		System.out.println("--------------****------------------");
	}
	
	//creating void method
	void  showdetails() {
		System.out.println("Employee Id: "+employeeID);
		System.out.println("Employee Name: "+employeename);
		System.out.println("Salary: "+salary);
		System.out.println("Experience: "+experience+" Years");
		System.out.println("Grade: "+grade);
		System.out.println("Permanent status: "+permanentstatus);
		System.out.println("______________________________");
	}

	public static void main(String[] args) {
		//object1
		Employee emp = new Employee();
		
		emp.employeeID = 1;
		emp.employeename ="Lakshmi";
		emp.salary = 60000;
		emp.experience = 2;
		emp.grade ='A';
		emp.permanentstatus ="Temparary";
		 
		emp.showdetails();
		
		// object2
        Employee emp1 = new Employee();
		
		emp1.employeeID = 2;
		emp1.employeename ="Aswini";
		emp1.salary = 85000;
		emp1.experience = 5;
		emp1.grade ='A';
		emp1.permanentstatus ="Temparary";
		 
		emp1.showdetails();
		
		//object3
        Employee emp2 = new Employee();
		
		emp2.employeeID = 3;
		emp2.employeename ="Janu";
		emp2.salary = 50000;
		emp2.experience = 2;
		emp2.grade ='A';
		emp2.permanentstatus ="Temparary";
		 
		emp2.showdetails();
		

	}

}
