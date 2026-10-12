package com.javaintro;

public class Mobile {
	//static variables
	static String company="Smart Mobiles";
	
	//instance variable
	String brand;
	String model;
	double price;
	int ram;
	
	//static Block
	static {
		System.out.println("static block executed");
	}
	//instance block
	{
		System.out.println("Instance block executed");
	}
	
	//static method

    static void showCompany() {
        System.out.println("Company: " + company);
    }

    // Instance method
    void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("-------------------");
    }

	public static void main(String[] args) {
		//static method calling
		showCompany();
		
		Mobile m1=new Mobile();
		  m1.brand="Vivo";
		  m1.model="VovoT4x";
		  m1.price=25000;
		  m1.ram=16;
		  
		//instance method calling
		  m1.displayMobile();
		  
		  
		  showCompany();
		  Mobile m2=new Mobile();
		  m2.brand="Vivo";
		  m2.model="VovoT5x";
		  m2.price=30000;
		  m2.ram=16;
		  
		//instance method calling
		  m2.displayMobile();
		  
		  showCompany();
		  Mobile m3 = new Mobile();
	        m3.brand = "OnePlus";
	        m3.model = "OnePlus 12";
	        m3.price = 60000;
	        m3.ram = 12;
	        
	        m3.displayMobile();
		  
		
		

	}

}
