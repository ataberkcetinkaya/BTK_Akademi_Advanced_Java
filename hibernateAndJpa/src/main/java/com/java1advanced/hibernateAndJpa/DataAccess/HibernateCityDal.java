package com.java1advanced.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java1advanced.hibernateAndJpa.Entities.City;

//JPA - ORM
@Repository //ICityDal implemente hatasi için
public class HibernateCityDal implements ICityDal {

	private EntityManager entityManager; //session kismina karsilik
						//Generate constructor using fields
	@Autowired //EntityManager için gerekli olan hibernate enjeksiyonu yapacak
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	//AOP - Aspect Oriented Programming
	@Override
	@Transactional //getAll'in basinda ve sonunda otomatik session açıp kapatacak
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
