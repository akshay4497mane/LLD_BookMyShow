package com.scaler.bookmyshowjun23.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment extends BaseModel{
	private int amount;
	private PaymentType paymentType;
	private PaymentProvider paymentProvider;
	private Date time;
	private String refId;
	private PaymentStatus paymentStatus;
}
