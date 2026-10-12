package languageFundamentals;
/*1.Write a Java Program to complete below requirements 

a) Take variables as studentId, studentName, gender, branchName,collegeName 
with corresponding data types 

b) Take a Method To display the student Details 

c) Try to add atleast two student data 


Note :-  Dont Take Primitive Data Types*/

public class StudentDetails {
	
	String collegeName = "PBR VITS";
	String branchName= "CSE";
	
	
	Integer studentID;
	String studentName;
	Character gender;
	
	void displayDetails() {
		System.out.println("College name: "+collegeName);
		System.out.println("Branch name: "+branchName);
		
		System.out.println("Student ID: "+studentID);
		System.out.println("Student Name: "+studentName);
		System.out.println("Gender: "+gender);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StudentDetails s= new StudentDetails();
			
			s.studentID=100;
			s.studentName="LAKSHMI";
			s.gender='F';
			
			s.displayDetails();
			
			System.out.println("________secod student Details___________");
			StudentDetails s1= new StudentDetails();
			
			s1.studentID=101;
			s1.studentName="Bhavana";
			s1.gender='F';
			
			s1.displayDetails();
	}

}
