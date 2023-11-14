package com.scaler.bookmyshowjun23.models;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Chair") // Choose a suitable name for the table
public class Seat extends BaseModel {
	private String seatNumber;
	private int rowz;
	private int colz;

	@ManyToOne
	private SeatType seatType;
}
