package com.scaler.bookmyshowjun23.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie extends BaseModel{
	private List<Language> language;
}
