package com.libertymutual.goforcode.ViciousValet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.libertymutual.goforcode.ViciousValet.models.Car;
import com.libertymutual.goforcode.ViciousValet.models.Lot;

@Controller

public class HomeController {

	private Lot carLot;
	
	public HomeController() {
		carLot=new Lot();
	} 

	@RequestMapping("/")
	public ModelAndView showApp(String color,String vin,String license, String make,String model ) {
		//if liscense is not null and liscense is greater then 0
			// Create a new instance of the car class from the values submitted.
		if (license != null && license.length()>0) {
			Car car = new Car(color, vin, license, make, model);
			carLot.addCar(car);
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("lot", carLot);
		
		mv.setViewName("app");
		return mv;
	}

	@RequestMapping("/remove_car")
	public ModelAndView removeCar(int carIndex) {

		carLot.removeCar(carIndex);
		
		 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

}
