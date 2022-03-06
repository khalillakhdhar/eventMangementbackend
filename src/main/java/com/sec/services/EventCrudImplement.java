package com.sec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.Event;
import com.sec.repository.EventRepository;
@Service
public class EventCrudImplement implements EventCrudInterface {
@Autowired 
EventRepository eventRepository;
	@Override
	public List<Event> getEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public Event addEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public Optional<Event> findEvent(int id) {
		// TODO Auto-generated method stub
		return eventRepository.findById((long) id);
	}

	@Override
	public void deleteEvent(int id) {
		// TODO Auto-generated method stub
		eventRepository.deleteById((long) id);
	}

}
