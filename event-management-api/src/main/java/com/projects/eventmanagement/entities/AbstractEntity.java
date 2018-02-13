package com.projects.eventmanagement.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
public abstract class AbstractEntity {
	@Id
	@Column(nullable=false,updatable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	@CreationTimestamp
	@Column(updatable=false)
	protected Instant created;
}
