package com.example.demo.airline.model;

public class Ticket {
	static public int bookingNumber=123;
	private String passengerName;
	private String flightNumber;
	private int fare;
	private int numberOfPersonsTravelling;
	private String destinationPoint;
	private String startingPoint;
	private int seatType;

	public Ticket( String passengerName, String flightNumber, int fare, int numberOfPersonsTravelling,
			String destinationPoint, String startingPoit, int seatType) {
		super();
		this.passengerName = passengerName;
		this.flightNumber = flightNumber;
		this.fare = fare;
		this.numberOfPersonsTravelling = numberOfPersonsTravelling;
		this.destinationPoint = destinationPoint;
		this.startingPoint = startingPoit;
		this.setSeatType(seatType);
		bookingNumber++;
	}

	public int getBookingNumber() {
		return bookingNumber;
	}


	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getNumberOfPersonsTravelling() {
		return numberOfPersonsTravelling;
	}

	public void setNumberOfPersonsTravelling(int numberOfPersonsTravelling) {
		this.numberOfPersonsTravelling = numberOfPersonsTravelling;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getSeatType() {
		return seatType;
	}

	public void setSeatType(int seatType) {
		this.seatType = seatType;
	}

}
