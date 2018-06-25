package com.dealership;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private Address address;
	private String cardName;
	private String cardNumber;
	private String cardExp;
	private String cardCVV;
	
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String email, String password, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExp() {
		return cardExp;
	}

	public void setCardExp(String cardExp) {
		this.cardExp = cardExp;
	}

	public String getCardCVV() {
		return cardCVV;
	}

	public void setCardCVV(String cardCVV) {
		this.cardCVV = cardCVV;
	}
	
	

}
