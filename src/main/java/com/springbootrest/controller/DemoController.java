package com.springbootrest.controller;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.entity.Ticket;
import com.springbootrest.service.DemoService;

@RestController
@RequestMapping(value="/api/tickets")
public class DemoController {

	@Autowired
	private DemoService service;
	
	@PostMapping(value="/createticket")
	public Ticket createTicket(Ticket ticket)
	{
		return service.createTick(ticket);
	}
	
	
	@GetMapping(value="/tickets/{ticketId}")
	public Optional<Ticket> getTicket(@PathVariable("ticketId")Integer ticketId) {
		return service.getTicket(ticketId);
	}

}
