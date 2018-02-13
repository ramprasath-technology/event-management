package com.projects.eventmanagement.entities;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Event extends AbstractEntity {
	private String name;
	private String description;
	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	private ZoneId zoneId;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Organizer organizer;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Participant> participants;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Venue venue;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ZonedDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
	}
	public ZonedDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
	}
	public ZoneId getZoneId() {
		return zoneId;
	}
	public void setZoneId(ZoneId zoneId) {
		this.zoneId = zoneId;
	}
	public Set<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public Boolean getStarted() {
		return started;
	}
	public void setStarted(Boolean started) {
		this.started = started;
	}
	private Boolean started;
	
}
