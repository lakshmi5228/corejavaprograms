package com.arrays;
//2.Write a Java program to read and print array elements.


public class Array1 {

	public static void main(String[] args) {
		
		System.out.println("Main method started ");
		int[] a= new int [10];
		
		a[0]= 21;
		a[1]= 67;
		a[2]= 89;
		a[3]= 23;
		a[4]= 67;
		a[5]= 76;
		a[6]= 13;
		a[7]= 17;
		a[8]= 21;
		a[9]= 19;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		System.out.println("Main method ended ");
		

	}

}
