package com.javaintro;

public class LibraryBook {
	int bookId;
	String booktitle;
	String authorName;
	int availableCopys;
	
	static String libraryName;
	static String librarianName;
	
	void displayBookdetails() {
		System.out.println(bookId);
		System.out.println(booktitle);
		System.out.println(authorName);
		System.out.println(availableCopys);
	}
	
	void displaylibdetails() {
		System.out.println(libraryName);
		System.out.println(librarianName);
	
		
	}
	void changelibrariannName(String Name) {
		librarianName= Name;
		System.out.println("After change librarian name " + librarianName);
		
	}
	public static void main(String[] args) {
		System.out.println("*************Object1 details**************************");
		LibraryBook l1=new LibraryBook();
		
		libraryName= "coforge";
		librarianName="Aswini";
		
		l1.bookId=100;
		l1.booktitle="Java Programming langunage";
		l1.authorName="james Gosling";
		l1.availableCopys=16;
		
		l1.displayBookdetails();
		
		l1.displaylibdetails();
		l1.changelibrariannName("Lakshmi");
		
		
		System.out.println("**************Object2 details**************************");
		
		LibraryBook l2=new LibraryBook();
		l2.bookId=101;
		l2.booktitle="DSA";
		l2.authorName="supercalifaologist";
		l2.availableCopys=45;
		
		l2.displayBookdetails();
		
		l2.displaylibdetails();
		l2.changelibrariannName("Paramesh");
		
		

	}

}
