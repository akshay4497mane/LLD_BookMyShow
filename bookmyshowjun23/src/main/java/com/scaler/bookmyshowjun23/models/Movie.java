package com.scaler.bookmyshowjun23.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Movie extends BaseModel{

	@Enumerated( EnumType.ORDINAL )
	@ElementCollection
	private List<Language> language;
}
