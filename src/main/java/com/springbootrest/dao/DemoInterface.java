package com.springbootrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.entity.Ticket;

public interface DemoInterface extends CrudRepository<Ticket, Integer> {

}
