package com.scaler.bookmyshowjun23.models;

import java.util.Date;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Payment extends BaseModel{
	private int amount;
	
	@Enumerated( EnumType.ORDINAL )
	private PaymentProvider paymentProvider;
	
	private Date time;
	private String refId;
	
	@Enumerated( EnumType.ORDINAL )
	private PaymentStatus paymentStatus;

	@Enumerated( EnumType.ORDINAL )
	private PaymentType paymentType;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", referencedColumnName = "id")
    private Ticket ticket;
    //https://www.baeldung.com/jpa-joincolumn-vs-mappedby    
}