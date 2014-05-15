package com.prateek.onetoone;

public class Capital {
	

	private String capitalName;
	
	private long capitalPopulation;
	
	public Capital() {
		// TODO Auto-generated constructor stub
	}
	
	public Capital(String name,long population) {
		super();
		this.capitalName=name;
		this.capitalPopulation=population;
	}
	
	

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public long getCapitalPopulation() {
		return capitalPopulation;
	}

	public void setCapitalPopulation(long capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}


}
