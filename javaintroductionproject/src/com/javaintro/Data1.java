package com.javaintro;

public class Data1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
         System.out.println("Lakshmi main method started !");
         // execute with the help of Bootstrap class loader
         System.out.println(Class.forName("java.lang.System"));
         System.out.println(Class.forName("java.lang.String"));
         
         
         // Application class loader sub system will be execute this
         //Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}

}
