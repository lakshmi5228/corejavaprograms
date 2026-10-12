package com.arrays;

////3.Write a Java program to find the sum of all elements in an array
public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int[] arr=new int[10];
		int sum=0;
		
		arr[0]= 21;
		arr[1]= 67;
		arr[2]= 89;
		arr[3]= 23;
		arr[4]= 67;
		arr[5]= 76;
		arr[6]= 13;
		arr[7]= 17;
		arr[8]= 21;
		arr[9]= 19;
		
		for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

		
		System.out.println("Main method Ended");

	}

}


