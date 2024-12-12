package com.project.makemytrip.service;

import com.project.makemytrip.request.Passenger;
import com.project.makemytrip.response.Ticket;

public interface PassengerServiceI {
public Ticket bookTicket(Passenger psg);
	
	public Ticket bookTicketwebClient(Passenger psg);
}
