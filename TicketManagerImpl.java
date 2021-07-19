package com.example.demo.airline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.example.demo.airline.model.Flight;
import com.example.demo.airline.model.Ticket;

public class TicketManagerImpl implements TicektManager{
	static int bookingNumber = 124;
	static List<Ticket> tickets = new ArrayList<>();

	
	public  void buyTicket(List<Flight> flights) {
		boolean flag = false;
		Flight destFlight = null;
		int updatedAvailableSet;
		int fare = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter Your name");
		String passengerName = in.next();
		System.out.println(" Please enter the flight number to buy ticket");
		String flightNumber = in.next();
		System.out.println(" Number of persons travelling");
		int numberOfTickets = in.nextInt();
		System.out.println("Please enter");
		System.out.println("1.First class booking");
		System.out.println("2.Economy class booking");
		int seatType = in.nextInt();
		
		
		for (Flight flight : flights) {
			if (flight.getFlightNumber().equals(flightNumber))
				destFlight = flight;
		}
		if (destFlight == null) {
			System.out.println(" Please enter a valid flight number");
			return;
		}
		int availableSeatEconomy = destFlight.getAvailableSeatsInEconomy();
		int availableSeatFirstClass = destFlight.getAvailableSeatsInFirstClass();
		if (seatType == 1) {
			if (availableSeatFirstClass == 0)
				System.out.println("Sorry No  seats are available ");
			else if (numberOfTickets > availableSeatFirstClass && availableSeatEconomy > numberOfTickets)
				System.out.println("Sorry the seats are full in FirstClass !!Please try to book in Economy");
			else if (numberOfTickets > availableSeatFirstClass && numberOfTickets > availableSeatEconomy)
				System.out.println("Sorry the seats are booked full ");

			else {
				fare = destFlight.getFirstClassFare() * numberOfTickets;
				updatedAvailableSet = destFlight.getAvailableSeatsInFirstClass() - numberOfTickets;
				destFlight.setAvailableSeatsInFirstClass(updatedAvailableSet);
				flag = true;

			}
		} else if (seatType == 2) {
			if (availableSeatEconomy == 0)
				System.out.println("Sorry No  seats are available ");

			else if (numberOfTickets > availableSeatEconomy && availableSeatFirstClass > numberOfTickets)
				System.out.println("Sorry the seats are full in Economy !!Please try to book in FirstClass");
			else if (numberOfTickets > availableSeatFirstClass && numberOfTickets > availableSeatEconomy)
				System.out.println("Sorry the seats are booked full ");
			else {
				fare = destFlight.getEconomicFare() * numberOfTickets;
				updatedAvailableSet = destFlight.getAvailableSeatsInEconomy() - numberOfTickets;
				destFlight.setAvailableSeatsInEconomy(updatedAvailableSet);
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Please wait!!!!!ticket is being purchased");
			Ticket ticket = new Ticket(passengerName, destFlight.getFlightNumber(), fare, numberOfTickets,
					destFlight.getDestination(), destFlight.getStart(), seatType);
			tickets.add(ticket);
			System.out.println("Ticket purchased successfully");
			showTicket(ticket);
		}
	}

	public  void cancelTicket() {
		Scanner sp = new Scanner(System.in);
		System.out.println("Please enter the booking id you wish to cancel");
		int bookingId = sp.nextInt();
		String flightNumber = " ";
		int numberOfPassengers = 0;
		int seatType = 0;
		Flight flights;
		int indexOf = 0;
		Iterator<Ticket> i = tickets.iterator();
		while (i.hasNext()) {
			Ticket ticket = i.next();
			if (ticket.getBookingNumber() == bookingId) {
				i.remove();
				flightNumber = ticket.getFlightNumber();
				numberOfPassengers = ticket.getNumberOfPersonsTravelling();
				seatType = ticket.getSeatType();
			}
		}
		if (seatType == 0 || numberOfPassengers == 0) {
			System.out.println("Please check the booking id");
		}
		for (Flight flight : Main.flightList) {
			if (flight.getFlightNumber() == flightNumber) {
				flights = flight;
				indexOf = Main.flightList.indexOf(flights);

			}

		}
		if (seatType == 1) {
			int curretAvailableSeat = Main.flightList.get(indexOf).getAvailableSeatsInFirstClass();
			Main.flightList.get(indexOf).setAvailableSeatsInFirstClass(curretAvailableSeat + numberOfPassengers);
			System.out.println("Ticket cancelled successfully");
		} else if (seatType == 2) {
			int curretAvailableSeat = Main.flightList.get(indexOf).getAvailableSeatsInEconomy();
			Main.flightList.get(indexOf).setAvailableSeatsInEconomy(curretAvailableSeat + numberOfPassengers);
			System.out.println("Ticket cancelled successfully");
		}

	}

	public static void showTicket(Ticket ticket) {
		String seatType = "";
		if (ticket.getSeatType() == 1)
			seatType = "FirstClass";
		else if (ticket.getSeatType() == 2)
			seatType = "Economy";
		System.out.println("--------------------------------------Ticket-----------------------------------------");
		System.out.println("| Booking Number :\t" + ticket.getBookingNumber());
		System.out.println("| Flight Number :\t" + ticket.getFlightNumber());
		System.out.println("| Passenger Name :\t" + ticket.getPassengerName());
		System.out.println("| Destination Point :\t" + ticket.getDestinationPoint());
		System.out.println("| Starting Point :\t" + ticket.getStartingPoint());
		System.out.println("| Number of passengers :  " + ticket.getNumberOfPersonsTravelling());
		System.out.println("| Fare :\t\t" + ticket.getFare());
		System.out.println("| Class:\t\t" + seatType);

	}


}
