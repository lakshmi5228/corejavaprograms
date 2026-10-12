package com.javaintro;

public class Movie {
	String movieName;
	int releasedYear;
	int ticketPrice;
	
	public static void main(String[] args) {
		System.out.println("*************object-1**********************");
		
		Movie m1=new Movie();
		
		m1.movieName="RRR";
		m1.releasedYear=2025;
		m1.ticketPrice= 300;
		
		System.out.println("Movie Name: "+m1.movieName);
		System.out.println("Released year: "+m1.releasedYear);
		System.out.println("Ticket Price: "+m1.ticketPrice);
		
		
		
	System.out.println("*************object-2**********************");
		
		Movie m2=new Movie();
		
		m2.movieName="Devara";
		m2.releasedYear=2024;
		m2.ticketPrice= 400;
		
		System.out.println("Movie Name: "+m2.movieName);
		System.out.println("Released year: "+m2.releasedYear);
		System.out.println("Ticket Price: "+m2.ticketPrice);
		
		
		
	System.out.println("*************object-3**********************");
		
		Movie m3=new Movie();
		
		m3.movieName="Yamadonga";
		m3.releasedYear=2007;
		m3.ticketPrice= 150;
		
		System.out.println("Movie Name: "+m3.movieName);
		System.out.println("Released year: "+m3.releasedYear);
		System.out.println("Ticket Price: "+m3.ticketPrice);
	}

}
