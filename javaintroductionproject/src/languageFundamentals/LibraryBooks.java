package languageFundamentals;



public class LibraryBooks {
	int bookId;
	String booktitle;
	String authorName;
	int availableCopis;

	
	static String libraryName;
	static String librarianName;
	
	void displayBookdetails() {
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Name: "+booktitle);
		System.out.println("Author: "+authorName);
		System.out.println("Available Books: "+availableCopis);
	}
	
	void displaylibdetails() {
		System.out.println("Library Name: "+libraryName);
		System.out.println("Librarien Name: "+librarianName);
	
		
	}
	void changelibrariannName(String Name) {
		librarianName= Name;
		System.out.println("After change librarian name is " + librarianName);
		
	}
	void issuesBook() {
	       
	        	availableCopis = availableCopis - 1;
	            System.out.println("After Book Buys: "+ availableCopis);
	       
	      
	}
	public static void main(String[] args) {
		System.out.println("*************Object1 details**************************");
		
		LibraryBooks l1=new LibraryBooks();
		
		libraryName= "coforge";
		librarianName="Aswini";
		
		l1.bookId=100;
		l1.booktitle="Java Programming langunage";
		l1.authorName="james Gosling";
		l1.availableCopis=16;
		
		l1.displayBookdetails();
		l1.issuesBook();
		l1.displaylibdetails();
		l1.changelibrariannName("Lakshmi");
		
		
		System.out.println("**************Object2 details**************************");
		
		LibraryBooks l2=new LibraryBooks();
		l2.bookId=101;
		l2.booktitle="DSA";
		l2.authorName="supercalifaologist";
		l2.availableCopis=45;
		
		l2.displayBookdetails();
		l2.issuesBook();
		l2.displaylibdetails();
		l2.changelibrariannName("Paramesh");
		
		

	}

}
	