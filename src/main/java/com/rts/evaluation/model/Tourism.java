package com.rts.evaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tourism {

	@Id
	private int custId;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	public Tourism(int custId, String firstName, String lastName, int age, String city) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Tourism [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", city=" + city + "]";
	}
	
	
}
