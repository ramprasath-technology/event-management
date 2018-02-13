package com.projects.eventmanagement.entities;

public class Participant extends AbstractEntity {

	private String name;
	private String email;
	private Boolean checkedIn;
	private Event event;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
		
}
