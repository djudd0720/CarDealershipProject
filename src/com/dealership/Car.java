package com.dealership;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Car {
	private String year;
	private String make;
	private String model;
	private int carId;
	private String description;
	private String condition;
	private double price;
	private String image;
	private String invdate;
	private String status;
	private String soldDate;
	
	//int carId;
	Date inventoryDate;
	//Date dateNow=new Date();
	//formart date from string to date
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



	public void setInventoryDate(String inventoryDate) {
		

			try {
				this.inventoryDate = sdf.parse(inventoryDate);
			} catch (java.text.ParseException e) {
				
				e.printStackTrace();
			}
		
	}
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	public Car(String year, String make, String model, int carId, String description, String condition, double price,
			String image, String invdate, String status) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.carId = carId;
		this.description = description;
		this.condition = condition;
		this.price = price;
		this.image = image;
		this.invdate= invdate;
		this.status=status;
		
		

		try {
			this.inventoryDate = sdf.parse(invdate);
		} catch (java.text.ParseException e) {
			
			e.printStackTrace();
		}
		
		
	}


	

	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

		
	public int getcarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getCarId() {
		return carId;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	



	public String getInvdate() {
		return invdate;
	}


	public void setInvdate(String invdate) {
		this.invdate = invdate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSoldDate() {
		return soldDate;
	}


	public void setSoldDate(String soldDate) {
		this.soldDate = soldDate;
	}


	

	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + ", description=" + description
				+ ", condition=" + condition + ", price=" + price + ", image=" + image + "]";
	}
	
	public boolean getcarAge() {


		//Minus the max days the car can be idle on the lot from todays day
		LocalDateTime date =  LocalDateTime.now().minusDays(120);
		//Converting the inventory date to a localDateTime so both data type are the same
		LocalDateTime convertedInventoryDate = LocalDateTime.ofInstant(inventoryDate.toInstant(), ZoneId.systemDefault());

		//Checking to see if the cut off date is after the inventory day
		// if the cut off date is after the inventory date then this car is within the cut off limit
		// if the date is not after the inventory date then this car is over 120 days from the inventory date.
		return date.isAfter(convertedInventoryDate);

		 
		}
	
}
