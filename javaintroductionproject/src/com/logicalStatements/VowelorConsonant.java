package com.logicalStatements;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the letter: ");
		char c = sc.next().charAt(0);
		
		
		if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u' ) {
			System.out.println("Vowel");
			
		} else {
			System.out.println("Constant");
		}

	}

}
