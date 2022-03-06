package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
