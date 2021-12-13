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
									//List<City> cities = session.createQuery("from City c ORDER BY c.name DESC") > GROUPBY'DAN ONCESI
			
			//List<String> countryCodes = session.createQuery("select countryCode from City c GROUP BY c.countryCode").getResultList();
															//bu kisimdaki sorgu degistirilip update, delete vs. yazilabilir
															//ve getResultList() yerine executeUpdate vs. kullanilabilir.
			
			//("from City").getResultList(); > Select * from city ile ayni anlamdadir
					
			//for(String countryCode:countryCodes) {   //for (City city:cities) {        > GROUPBY'DAN ONCESI
			//	System.out.println(countryCode);		Sys.out.println(city.getName()); > GROUPBY'DAN ONCESI
			//}
			
			//INSERT
//			City city = new City();
//			city.setName("Bursa16");
//			city.setCountryCode("TUR");
//			city.setDistrict("Marmara");
//			city.setPopulation(1616);
//			session.save(city);
			
			//UPDATE
//			City city = session.get(City.class, 4091);
//			city.setName("BursaBudo");
//			session.save(city); //session save ile yapilan islemleri kaydet.
			
			//DELETE
			City city = session.get(City.class, 4091);
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("Data deleted.");
			
		}	finally {
			factory.close();
		}
		
	}

}
