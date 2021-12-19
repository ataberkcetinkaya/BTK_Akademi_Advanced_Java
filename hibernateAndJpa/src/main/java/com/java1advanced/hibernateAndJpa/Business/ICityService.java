package com.java1advanced.hibernateAndJpa.Business;

import java.util.List;

import com.java1advanced.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	
	void update(City city);
	
	void delete(City city);
}
