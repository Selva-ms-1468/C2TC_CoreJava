package com.cg.inheritance;

public class Blackberry extends Mobile
{
        public Blackberry(String manufacturer, String model, String oS, double cost) {
		super(manufacturer, model, oS, cost);
		// TODO Auto-generated constructor stub
}

public String getModel()
{
	return "This is a super class method"+this.getModel();
}
}