package com.project.makemytrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.makemytrip.request.Passenger;
import com.project.makemytrip.response.Ticket;
import com.project.makemytrip.service.PassengerServiceI;

@RestController
public class PassengerController {
	@Autowired
	private PassengerServiceI serviceI;
	
	@PostMapping(value="/bookTicket",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg) {		
		Ticket bookTicket = serviceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
		
	}
	
	@PostMapping(value="/bookTicketbyWebClient",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Ticket> bookTicketbyWebClient(@RequestBody Passenger psg) {		
		Ticket bookTicket = serviceI.bookTicketwebClient(psg);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
		
	}
}
