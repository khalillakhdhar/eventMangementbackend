package com.sec.services.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.Event;
import com.sec.services.EventCrudImplement;

@RestController
@RequestMapping("event")
@Transactional
@CrossOrigin(origins = "localhost", maxAge = 3600)
public class EventController {
	@Autowired
	EventCrudImplement eventapi;
	@GetMapping
	public List<Event> findEvents()
	{
		return eventapi.getEvents();
	}
	@PostMapping
	public Event addEvent(@RequestBody @Valid Event event)
	{
		return eventapi.addEvent(event);
	}
	@DeleteMapping("/{id}")
	public void deleteEvent(@PathVariable int id)
	{
		eventapi.deleteEvent(id);
		
	}
	@GetMapping("/{id}")
	public Optional<Event> findOneEvent(@PathVariable int id)
	{
		return eventapi.findEvent(id);
	}
	

}
