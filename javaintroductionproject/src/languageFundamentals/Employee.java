package languageFundamentals;

public class Employee {
/* 1.Create a Java class Employee for a company.
Create separate methods to print each employee detail.
Display the following details:
Employee name
Employee ID
Department
Salary
Experience
Company name
Call all the methods from the main() method.*/
	
	
	 public static void main(String[] args) {
		
		System.out.println("_____Employee Detailss____");
		
		
		
		Employee e= new Employee();
	
		
		e.name();
		e.id();
		e.department();
		e.salary();
		e.experience();
		e.companyName();
	}
	void name() {
		String  name="Lakshmi";
		System.out.println("Employee Name: "+name);
	}
	void id() {
		int id=100;
		System.out.println("Employee ID: " +id);
	}
	void department() {
		String department="CSE";
		System.out.println("Department: "+department);
	}
	void salary() {
		double salary=50000.0;
		System.out.println("Salary: "+salary);
	}
	void experience() {
		String experience="FRESHER";
		System.out.println("Experience: "+experience);
	}
	void companyName() {
		String companyName="EPAM";
		System.out.println("Company name: "+companyName);
	}
}
