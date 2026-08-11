package com.javaintro;
//Blocks
public class Task1 {
	
	//static data
	static String collegeName;
	static String location;
	
	
	{
		
	}
	
	//instance data with data initialization
	int Rollno= 1;
	String name= "Lakshmi";
	int mobile = 12345;
	String email="gangapatla@145gmail.com";
	String Branch= "CSE";

	public static void main(String[] args) {
		// accessing static data directly will allowed the static method
		//static data initializing
		collegeName="PBR Vits";
		location = "Kavali";
		System.out.println(collegeName);
		System.out.println(location);
		
		//instance data does not allow directly accessing with out object
		
		Task1 obj = new Task1();
		System.out.println(obj.Rollno);
		System.out.println(obj.name);
		System.out.println(obj.mobile);
		System.out.println(obj.email);
		System.out.println(obj.Branch);
		
	}

}
