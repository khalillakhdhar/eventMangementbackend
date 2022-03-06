package com.sec.services;

import java.util.List;
import java.util.Optional;

import com.sec.model.Event;

public interface EventCrudInterface {
List<Event> getEvents();
Event addEvent(Event event);
Optional<Event> findEvent(int id);
void deleteEvent(int id);

}
