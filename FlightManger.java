package com.example.demo.airline;

import java.util.List;

import com.example.demo.airline.model.Flight;

public interface FlightManger {
	public void listAllFlights(List<Flight> flights);

	public void inquireByDate(List<Flight> flights);

	public void inquireByDestination(List<Flight> flights);

}
