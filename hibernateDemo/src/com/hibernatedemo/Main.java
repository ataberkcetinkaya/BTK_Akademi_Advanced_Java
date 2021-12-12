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
												//"from City c where c.name LIKE '%ur%'"
												//"from City c ORDER BY c.name DESC"s
			//List<String> countryCodes = session.createQuery("select countryCode from City c GROUP BY c.countryCode").getResultList();
									
			//("from City").getResultList(); > Select * from city ile ayni anlamdadir
					
			//for(String countryCode:countryCodes) {
			//	System.out.println(countryCode);
			//}
			
			City city = new City();
			city.setName("Bursa16");
			city.setCountryCode("TUR");
			city.setDistrict("Marmara");
			city.setPopulation(1616);
			
			session.save(city);
		
			session.getTransaction().commit();
			System.out.println("Data saved.");
			
		}	finally {
			factory.close();
		}
		
	}

}
