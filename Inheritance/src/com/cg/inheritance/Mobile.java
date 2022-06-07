package com.cg.inheritance;

public class Mobile 
{
	private String manufacturer;
	protected String model;
	private String OS;
	private double cost;
	public Mobile(String manufacturer, String model, String oS, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		OS = oS;
		this.cost = cost;
	}
	public String getModel()
	{
		return "This is a super class method"+this.model;
	}
	@Override
	public String toString() {
		return "Mobile [manufacturer=" + manufacturer + ", model=" + model + ", OS=" + OS + ", cost=" + cost
				+ ", method=" + cost + "]";
	}
	
	
	
	
	
	

}
