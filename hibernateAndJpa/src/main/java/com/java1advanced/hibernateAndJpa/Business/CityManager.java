package com.java1advanced.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java1advanced.hibernateAndJpa.DataAccess.ICityDal;
import com.java1advanced.hibernateAndJpa.Entities.City;

@Service //bu bir iş katmanidir demek için
public class CityManager implements ICityService {

	private ICityDal cityDal;
	
	//generate constructor using fields
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
