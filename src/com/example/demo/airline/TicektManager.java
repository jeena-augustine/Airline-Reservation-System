package com.example.demo.airline;

import java.util.List;

import com.example.demo.airline.model.Flight;

public interface TicektManager {
	public void buyTicket(List<Flight> flights);
	public void cancelTicket() ;
}
