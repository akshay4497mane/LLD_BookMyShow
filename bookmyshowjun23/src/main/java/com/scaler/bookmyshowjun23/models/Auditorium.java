package com.scaler.bookmyshowjun23.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
	private String name;
	@OneToMany
	private List<Seat> seats;
	
	@Enumerated( EnumType.ORDINAL )
	@ElementCollection
	private List<Feature> features;
	//EnumType.ORDINAL : 0,1,2 in DB
	//EnumType.STRING : stores strings in DB("AVAILABLE", "BOOKED", "LOCKED")
	//or Create MApping table
	
	/*
	 * @OneToMany private List<Show> shows;
	 * 
	 * @OneToOne private Show currShow;
	 */
}
