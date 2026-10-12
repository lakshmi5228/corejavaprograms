package languageFundamentals;
/*
 * 1.Write a Java program to:
Create an int primitive variables
Convert it into an Integer object using autoboxing.
Convert the Integer object back into an int using autounboxing.
Display both values.
 */
public class AutoBoxingUnBoxingIntegers {

	public static void main(String[] args) {
		//Create an int primitive variable
		int a =4440;
		//Convert it into an Integer object using autoboxing.
		Integer b= a;
		//Convert the Integer object back into an int using autounboxing.
		int c= b;
		
		System.out.println(b);
		System.out.println(c);
		

	}

}
