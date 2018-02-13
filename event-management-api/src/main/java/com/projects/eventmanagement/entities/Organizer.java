package com.projects.eventmanagement.entities;

import java.util.Set;

public class Organizer extends AbstractEntity {
	private String name;
	private Set<Event> events;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
}
