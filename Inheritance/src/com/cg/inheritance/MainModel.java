package com.cg.inheritance;

public class MainModel {

	public static void main(String[] args) {
		Mobile mobileobject = new Mobile("windows","windows","recent",16000.00);
		System.out.println(mobileobject.getModel());
		System.out.println(mobileobject);
		
		Blackberry obj = new Blackberry("Blackberry","Blackberry","Key1",15000.00);
		System.out.println(mobileobject.getModel());
		System.out.println(obj);
	}

}
