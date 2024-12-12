package com.project.makemytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.makemytrip.repository.PassengerRepository;
import com.project.makemytrip.request.Passenger;
import com.project.makemytrip.response.Ticket;

@Service
public class PassengerServiceImpl implements PassengerServiceI {
	@Autowired
	private PassengerRepository repository;
	
	@Override
	public Ticket bookTicket(Passenger psg) {
		Passenger passenger = repository.save(psg);

		String url = "http://localhost:9090/bookTicket";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, psg, Ticket.class);
		Ticket ticket = postForEntity.getBody();
		return ticket;
	}

	@Override
	public Ticket bookTicketwebClient(Passenger psg) {
		String url = "http://localhost:9090/bookTicket";
		
		WebClient webClient = WebClient.create();
		
		   Ticket ticket = webClient.post()
			         .uri(url)
			         .contentType(MediaType.APPLICATION_JSON)
			         .accept(MediaType.APPLICATION_JSON)
			         .body(BodyInserters.fromValue(psg))
			         .retrieve()
		             .bodyToMono(Ticket.class)
		             .block();
		
			return ticket;
		
		
	}
}
