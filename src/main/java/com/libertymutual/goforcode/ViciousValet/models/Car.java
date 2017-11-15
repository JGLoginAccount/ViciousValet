package com.libertymutual.goforcode.ViciousValet.models;

public class Car {

	private String vin;
	private String license;
	private String color;
	private String make;
	private String model;

	public Car(String color, String vin, String license, String make, String model) {
		this.color = color;
		this.vin = vin;
		this.license = license;
		this.make = make;
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public String getLiscenseState() {
		return license;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

}
