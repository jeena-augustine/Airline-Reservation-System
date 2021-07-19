package com.example.demo.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.airline.model.Flight;

public class Main {
	static List<Flight> flightList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FlightManger manager = new FlightManagerImpl();
		TicektManager managerTicket=new TicketManagerImpl();
		flightList.add(new Flight(1, "AC1", "Tokyo", "Edison", "12/07/2021", 5000, 10000, 30, 10));
		flightList.add(new Flight(2, "NZ1", "London", "Cannada", "14/07/2021", 6000, 12000, 40, 15));
		flightList.add(new Flight(3, "DZ1", "India", "NewYork", "12/07/2021", 7000, 14000, 13, 2));
		flightList.add(new Flight(4, "AM1", "Mexico", "Madird", "13/08/2021", 5600, 11200, 23, 10));

		while (true) {
			System.out.println();
			System.out.println(
					"*************************** Welcome to the flight ticket purchase system!*************************");
			System.out.println(" 1. List all flights");
			System.out.println(" 2. Inquire by departure date");
			System.out.println(" 3. Inquire by destination");
			System.out.println(" 4. Buy Ticket");
			System.out.println(" 5. Cancel Ticket");
			System.out.println(" 6. Exit");
			System.out.println();
			System.out.println(" Please enter your choice");

			switch (sc.nextInt()) {
			case 1: {
				manager.listAllFlights(flightList);
				break;
			}
			case 2: {
				manager.inquireByDate(flightList);
				break;
			}
			case 3: {
				manager.inquireByDestination(flightList);
				break;
			}

			case 4: {
				managerTicket.buyTicket(flightList);
				break;
			}

			case 5: {
				managerTicket.cancelTicket();
				break;
			}

			case 6: {
				System.exit(0);
				break;
			}
			}
		}
	}
}
