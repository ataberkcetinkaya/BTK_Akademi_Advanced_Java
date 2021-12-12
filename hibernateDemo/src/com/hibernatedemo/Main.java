package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration() //mantik olarak configuration diye bir class oluþuyor ve sessionfactory'e atiyor
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession(); //fabrikadan ürettiðimiz bu session'i kullanarak artik sorgu gönderebiliriz
	
		try {
			session.beginTransaction();
			
												//"from City c where c.countryCode='TUR' AND c.district='Marmara'"
			List<City> cities = session.createQuery("from City c where c.name LIKE '%ur%'").getResultList();
									//Select * from city ile ayni anlamdadir
					
			for(City city:cities) {
				System.out.println(city.getName());
			}
			
			session.getTransaction().commit();
			
		}	finally {
			factory.close();
		}
		
	}

}
