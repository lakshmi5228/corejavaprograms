package languageFundamentals;

import java.math.BigInteger;

public class Student {
	
	String studentName="Lakshmi Gangapatla";
	byte age=21;
	short admissionYear=2022;
	int rollNumber=5228;
	long mobileNumber  = 7093692547l;
	float attendancePercentage= 81.16f;
	int totalfees=50000;
	char grade='A';
	String  status= "Pass";
   BigInteger largestudentID=new BigInteger("22733456789005228");
	boolean feepaid;
	
	void studentdetails() {
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentdetails();
		System.out.println("StudentName: "+s.studentName);
		System.out.println("Age : "+s.age);
		System.out.println("Admission Year : "+s.admissionYear+"Year");
		System.out.println("RollNumber : "+s.rollNumber);
		System.out.println("Mobile Number : "+s.mobileNumber);
		System.out.println("Attendance Percentage : "+s.attendancePercentage+"%");
		System.out.println("Total Fees : "+s.totalfees);
		System.out.println("Grade : "+s.grade);
		System.out.println("Exam Status: "+s.status);
	    System.out.println("Main Roll number : "+s.largestudentID);
	
		System.out.println("fees paid : "+s.feepaid);
		

	}

}
