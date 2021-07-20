package com.example.demo.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.airline.model.Flight;
import com.example.demo.airline.model.Ticket;

public class FlightManagerImpl implements FlightManger{

	public void listAllFlights(List<Flight> flights) {
		System.out.println(
				"-----------------------------------------Flight Chart----------------------------------------------");
		System.out.print(
				"Number\tFlight Number\tStarting Point\tDestination\tDepartureDate\tEconomic Fare\tFirstclass Fare\t AvailableSeats(Economy)  AvailableSeats(FirstClass)");
		System.out.println();
		for (Flight flight : flights)
			System.out.println(flight.getId() + "\t " + flight.getFlightNumber() + "\t\t " + flight.getStart() + "\t\t"
					+ flight.getDestination() + "\t\t " + flight.getDepartureDate() + "\t " + flight.getEconomicFare()
					+ "\t\t " + flight.getFirstClassFare() + "\t\t\t  " + flight.getAvailableSeatsInEconomy() + "\t\t\t"
					+ flight.getAvailableSeatsInFirstClass());
	}

	public void inquireByDate(List<Flight> flights) {
		Scanner in = new Scanner(System.in);
		List<Flight> destFlight = new ArrayList<>();
		System.out.println(" Please enter the date(date should be in(DD/MM/YYYY)format)");
		String date = in.next();

		for (Flight flight : flights) {
			if (flight.getDepartureDate().equals(date)) {
				destFlight.add(flight);
			}
		}

		if (destFlight.isEmpty()) {
			System.out.println("No flights available");
		} else {
			System.out.print(
					"Number\tFlight Number\tStarting Point\tDestination\tDepartureDate\tEconomic Fare\tFirstclass Fare\t AvailableSeats(Economy)  AvailableSeats(FirstClass)");
			System.out.println();

			for (Flight flight : destFlight) {
				System.out.println(flight.getId() + "\t " + flight.getFlightNumber() + "\t\t " + flight.getStart()
						+ "\t\t" + flight.getDestination() + "\t\t " + flight.getDepartureDate() + "\t "
						+ flight.getEconomicFare() + "\t\t " + flight.getFirstClassFare() + "\t\t\t  "
						+ flight.getAvailableSeatsInEconomy() + "\t\t\t" + flight.getAvailableSeatsInFirstClass());
			}
		}
	}

	public void inquireByDestination(List<Flight> flights) {
		Scanner in = new Scanner(System.in);
		List<Flight> destFlight = new ArrayList<>();
		System.out.println(" Please enter your destination");
		String destination = in.next();

		for (Flight flight : flights) {
			if (flight.getDestination().equals(destination)) {
				destFlight.add(flight);
			}
		}
		if (destFlight.isEmpty()) {
			System.out.println("No flights available");
		} else {
			System.out.print(
					"Number\tFlight Number\tStarting Point\tDestination\tDepartureDate\tEconomic Fare\tFirstclass Fare\t AvailableSeats(Economy)  AvailableSeats(FirstClass)");
			System.out.println();

			for (Flight flight : destFlight) {
				System.out.println(flight.getId() + "\t " + flight.getFlightNumber() + "\t\t " + flight.getStart()
						+ "\t\t" + flight.getDestination() + "\t\t " + flight.getDepartureDate() + "\t "
						+ flight.getEconomicFare() + "\t\t " + flight.getFirstClassFare() + "\t\t\t  "
						+ flight.getAvailableSeatsInEconomy() + "\t\t\t" + flight.getAvailableSeatsInFirstClass());
			}
		}

	}

	
	

	

}
