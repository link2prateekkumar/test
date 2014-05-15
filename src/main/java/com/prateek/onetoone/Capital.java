package com.prateek.onetoone;

public class Capital {
	
	private String country_name;
	
	private Capital capital;
	
	private long country_population;

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
