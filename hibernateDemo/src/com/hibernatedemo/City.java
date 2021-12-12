package com.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	@Id
	@Column(name= "ID") //buradaki column değerleri vermesekte
	private int id;     //BU SATIRDAKİ isim ile veritabanında arar. (db ile burada isimler farklılık gösteriyorsa kullanılabilir)
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "countryCode")
	private String countryCode;
	
	@Column(name= "district")
	private String district;
	
	@Column(name= "population")
	private int population;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
