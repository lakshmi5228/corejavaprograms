package com.javaintro;

public class Employe {
	 
	//static data declaration
	static String dept;
	static String location;
	
	
	// instance data declaration
	int empId ;
	String empName;
	int mobile;
	String email;
	
	//values initialization
	
	
	

	public static void main(String[] args) {
		System.out.println("Employe data");
		
	     
		  
		System.out.println("************object1***********");
		//static data will execute directs in stack area 
		System.out.println("Department:"+dept);
		System.out.println("Location:"+ location);
		//instance cls doesnot execute ditectly in stack area, so we will create object reference
		Employe emp= new Employe();
		
		System.out.println("empId:"+emp.empId);
		System.out.println("empName:"+ emp.empName);
		System.out.println("mobile:"+ emp.mobile);
		System.out.println("email:"+ emp.email);
		
		
		System.out.println("************object1***********");
		
		
	
		Employe emp1= new Employe();
		
		// instance data declaration
		
		
		System.out.println("empId:"+emp1.empId);
		System.out.println("empName:"+ emp1.empName);
		System.out.println("mobile:"+ emp1.mobile);
		System.out.println("email:"+ emp1.email);
		
	}

}
