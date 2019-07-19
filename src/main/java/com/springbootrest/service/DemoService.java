package com.springbootrest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.dao.DemoInterface;
import com.springbootrest.entity.Ticket;

@Service
public class DemoService {

	@Autowired
	private DemoInterface inter;

	public Ticket createTick(Ticket ticket) {
		return inter.save(ticket);
	}

	public Optional<Ticket> getTicket(Integer ticketId) {
		return inter.findById(ticketId);
	}

}
