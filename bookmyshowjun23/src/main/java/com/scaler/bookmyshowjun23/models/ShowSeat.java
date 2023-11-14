package com.scaler.bookmyshowjun23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
	@ManyToOne
	private Event show;

	@ManyToOne
	private Seat seat;

	@Enumerated( EnumType.ORDINAL )
	private ShowSeatStatus showSeatStatus;
}
