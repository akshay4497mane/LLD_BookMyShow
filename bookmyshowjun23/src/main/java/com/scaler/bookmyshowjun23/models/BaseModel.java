package com.scaler.bookmyshowjun23.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass //Don't create separate table,insert attributes in every child 
public class BaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date lastModifiedAt;
}
