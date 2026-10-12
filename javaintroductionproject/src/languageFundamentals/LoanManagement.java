package languageFundamentals;
/* 1.Create a Class Named as LoanManagement with following 
variables 
customerName, LoanAmount, interestRate, Loantenure - in years

Methods
calculateInterest()
Accept loanAmount and interestRate as arguments.
Calculate and return the simple interest.

calculateTotalAmount ()
Accept the calculated
interest as an argument.
Return the total amount payable.

calculateMonthlyEMI():-
Accept the total payable amount and loan tenure as arguments.
Return the monthly EMI.

displayLoanSummary():-
Accept the interest,
total amount, and EMI as arguments.

Display the complete loan details.
create atleast 2 different objects and different type of data and with every object call the method print the total in main with proper readability
*/
public class LoanManagement {
	
	//instance variables
	
		String customerName;
		double loanAmount;
		double interestrate;
		int loantenure; 
		
	//method display calculate Interest
		double calculateInterest(double loanamount, double interestrate) {
			double interest=(loanamount*interestrate*loantenure)/100;
			return interest;
			
		}
		//method display calculateTotalAmount
		double calculateTotalAmount (double interest) {
			double totalamount= loanAmount+ interest;
			return totalamount;
			
		}
		//method display calculateMonthlyEMI
		double calculateMonthlyEMI(double totalamount, int loantensure) {
			int months= loantenure*12;
			double emi = totalamount / months;
			return emi;
			
		}
		//method display displayLoanSummary
		void displayLoanSummary(double interest, double emi, double totalamount) {
			System.out.println("----------------Loan Summary-------------");
			System.out.println("Customer Name: "+customerName);
			System.out.println("Loan Amount: "+loanAmount);
			System.out.println("Instance Amount: "+interestrate);
			System.out.println("Loantensure: "+loantenure);
			System.out.println("Interest: "+interest);
			System.out.println("Monthly EMI: "+emi);
			System.out.println("Total Amount: "+totalamount);
		}
		
	public static void main(String[] args) {
		LoanManagement l1=new LoanManagement();
		
		l1.customerName="Lakshmi";
		l1.loanAmount=5000.0;
		l1.interestrate=2;
		l1.loantenure=5;
		
		double interest1 = l1.calculateInterest(l1.loanAmount, l1.interestrate);
		
		double totalamount1= l1.calculateTotalAmount(interest1);
		
		double emi1=l1.calculateMonthlyEMI(totalamount1, l1.loantenure);
		
		l1.displayLoanSummary(interest1, emi1, totalamount1);
		
		
		
		
		
		}

}
