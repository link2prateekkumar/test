package com.prateek.onetoone;

public class Country {
private String country_name;
	
	private Capital capital;
	
	private long country_population;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	public Country(String name,long population) {
		this.country_name=name;
		this.country_population=population;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public long getCountry_population() {
		return country_population;
	}

	public void setCountry_population(long country_population) {
		this.country_population = country_population;
	}
	
}
