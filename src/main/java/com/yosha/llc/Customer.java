package com.yosha.llc;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "customers")
public class Customer {

    @Id
    public String id;
    public String firstName; 
    public String lastName;
    public String address;
    public String county;
    public String state;
    public String city;
    

    public Customer() {}

    public Customer(String firstName, String lastName, String address, String county, String state,
			String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.county = county;
		this.state = state;
		this.city = city;
	}



    @Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", county="
				+ county + ", state=" + state + ", city=" + city + "]";
	}

}
