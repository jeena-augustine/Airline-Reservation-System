package com.example.demo.airline.model;

public class Flight {
	private int id;
	private int economicFare;
	private int firstClassFare;
	private int availableSeatsInEconomy;
	private int availableSeatsInFirstClass;
	private String flightNumber;
	private String startingPoint;
	private String destinationPoint;
	private String departureDate;

	public Flight(int id, String flightNumber, String startingPoint, String destination, String departureDate, int economicFare,
			int firstClassFare, int availableSeatsInEconomy, int availableSeatsInFirstClass) {
		super();
		this.setId(id);
		this.flightNumber = flightNumber;
		this.startingPoint = startingPoint;
		this.destinationPoint = destination;
		this.departureDate = departureDate;
		this.economicFare = economicFare;
		this.firstClassFare = firstClassFare;
		this.setAvailableSeatsInEconomy(availableSeatsInEconomy);
		this.setAvailableSeatsInFirstClass(availableSeatsInFirstClass);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getStart() {
		return startingPoint;
	}

	public void setStart(String start) {
		startingPoint = start;
	}

	public String getDestination() {
		return destinationPoint;
	}

	public void setDestination(String destination) {
		this.destinationPoint = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEconomicFare() {
		return economicFare;
	}

	public void setEconomicFare(int economicFare) {
		this.economicFare = economicFare;
	}

	public int getFirstClassFare() {
		return firstClassFare;
	}

	public void setFirstClassFare(int firstClassFare) {
		this.firstClassFare = firstClassFare;
	}

	public int getAvailableSeatsInEconomy() {
		return availableSeatsInEconomy;
	}

	public void setAvailableSeatsInEconomy(int availableSeatsInEconomy) {
		this.availableSeatsInEconomy = availableSeatsInEconomy;
	}

	public int getAvailableSeatsInFirstClass() {
		return availableSeatsInFirstClass;
	}

	public void setAvailableSeatsInFirstClass(int availableSeatsInFirstClass) {
		this.availableSeatsInFirstClass = availableSeatsInFirstClass;
	}
}
