package com.java1advanced.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java1advanced.hibernateAndJpa.Business.ICityService;
import com.java1advanced.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	//generate constructor using fields
	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get() {
		return cityService.getAll();
	}
}
