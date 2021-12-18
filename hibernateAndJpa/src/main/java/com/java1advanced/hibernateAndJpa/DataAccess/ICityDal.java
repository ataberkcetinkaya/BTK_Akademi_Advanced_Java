package com.java1advanced.hibernateAndJpa.DataAccess;

import java.util.List;

import com.java1advanced.hibernateAndJpa.Entities.City;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	
	void update(City city);
	
	void delete(City city);
}
