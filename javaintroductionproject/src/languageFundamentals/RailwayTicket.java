package languageFundamentals;
import java.util.Scanner;

public class RailwayTicket {
	
	    String passengerName;
	    int age;
	    String source;
	    String destination;

	    RailwayTicket(String passengerName, int age, String source, String destination) {
	        this.passengerName = passengerName;
	        this.age = age;
	        this.source = source;
	        this.destination = destination;
	    }
	}

	class Ticket extends RailwayTicket {
	    int numberOfTickets;
	    int price = 500;

	    // Constructor chaining using this()
	    Ticket() {
	        this("Unknown", 0, "Unknown", "Unknown", 0);
	    }

	    // Main constructor
	    Ticket(String passengerName, int age, String source,
	           String destination, int numberOfTickets) {

	        super(passengerName, age, source, destination);

	        this.numberOfTickets = numberOfTickets;
	    }

	    void bookTicket() {
	        int amount = numberOfTickets * price;
	        System.out.println("Booking Successful");
	        System.out.println("Total Amount: " + amount);
	    }

	    void displayBookingDetails() {
	        System.out.println("Passenger Name: " + passengerName);
	        System.out.println("Age: " + age);
	        System.out.println("Source: " + source);
	        System.out.println("Destination: " + destination);
	        System.out.println("Number of Tickets: " + numberOfTickets);
	        System.out.println("Price: " + price);
	    }
	

	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Passenger Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Source: ");
	        String source = sc.nextLine();

	        System.out.print("Enter Destination: ");
	        String destination = sc.nextLine();

	        System.out.print("Enter Number of Tickets: ");
	        int tickets = sc.nextInt();

	        Ticket t = new Ticket(name, age, source, destination, tickets);

	        t.bookTicket();
	        t.displayBookingDetails();
	    }
	}


