package com.scaler.bookmyshowjun23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{
	@ManyToOne
	private Event show;
	@ManyToOne
	private SeatType seatType;
	private int price;
}
