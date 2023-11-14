package com.scaler.bookmyshowjun23.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
class Ticket extends BaseModel{
	private int amount;
	private Date timeOfBooking;

	@ManyToMany //1 seat may have many TicketS(failed, refund, success)
	private List<Seat> seats;

	@ManyToOne
	private User bookedBy;

	@ManyToOne
	private Event show;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ticket")
	private List<Payment> payments;
	
	@Enumerated( EnumType.ORDINAL )
	private TicketStatus status;
}