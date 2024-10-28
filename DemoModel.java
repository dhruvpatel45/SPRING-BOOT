package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DemoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(String rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	private String Brand;
	private String Model;
	private String rentalPricePerDay;
	
}
