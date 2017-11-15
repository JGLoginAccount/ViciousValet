package com.libertymutual.goforcode.ViciousValet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList;
	private int capacity = 5;

	public Lot() {
		carList = new ArrayList<Car>();
	}

	public void removeCar(int index) {
		carList.remove(index - 1); 
	}

	public void addCar(Car car) {
		
		if (isFull()==false) {
		carList.add(car);
	}
	}

	public boolean isFull() {

		if (carList.size() < capacity) {
			return false;
		} else {
			return true;

		}

	}


	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	public int size() {
		return carList.size();
	}
}
