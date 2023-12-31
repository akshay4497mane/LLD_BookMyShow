package com.scaler.bookmyshowjun23.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Event extends BaseModel{

	@ManyToOne
	private Auditorium auditorium;

	private Date startTime;
	private Date endTime;

	@ManyToOne
	private Movie movie;

	@Enumerated( EnumType.ORDINAL )
	private Language language;
}