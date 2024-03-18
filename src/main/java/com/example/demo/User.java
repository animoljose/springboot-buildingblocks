package com.example.demo;

public class User {

	public String FirstName;
	public String LastName;
	public String City;
	
	public User(String firstName, String lastName, String city) {
		FirstName = firstName;
		LastName = lastName;
		City = city;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
