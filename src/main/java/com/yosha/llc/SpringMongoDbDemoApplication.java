package com.yosha.llc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDbDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbDemoApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository repository;

	
	@Override
	public void run(String... args) throws Exception {
	} 
/*	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		// save a couple of customers
		//repository.save(new Customer("Nilesh", "Patel"));
		//repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirst_name('James'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Nilesh"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
}*/
	
	
}
