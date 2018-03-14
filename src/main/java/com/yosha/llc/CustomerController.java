package com.yosha.llc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;

	// Get All Customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		List<Customer> customers = repository.findAll();
		return customers;
		
	}
	
	// Get Customers by first name
	@GetMapping("/customers/firstname/{firstName}")
	public List<Customer> getCustomersByFirstName(@PathVariable String firstName) {

		List<Customer> customers = repository.findByFirstName(firstName);
		return customers;
	}
	
	// Get Customers by last name
		@GetMapping("/customers/lastname/{lastName}")
		public List<Customer> getCustomersBylastName(@PathVariable String lastName) {

			List<Customer> customers = repository.findByLastName(lastName);
			return customers;
		}
	
	// Get Customers by state
	@GetMapping("/customers/state/{state}")
	public List<Customer> getCustomersByState(@PathVariable String state) {

		List<Customer> customers = repository.findByState(state);
		return customers;
	}
	
	// Get Customers by county
		@GetMapping("/customers/county/{county}")
		public List<Customer> getCustomersByCounty(@PathVariable String county) {

			List<Customer> customers = repository.findByCounty(county);
			return customers;
		}

	// Add Customer
	@PostMapping(path = "/customer", consumes = "application/json", produces = "application/text")
	public String addCustomer(@RequestBody Customer customer) {
			
		customer =  repository.save(customer);
		
		if(null != customer) {
			 return  "Insert was successful";
		} 
		
		return "	Insert failed";
	}
	
	
	//Delete Customer
	@DeleteMapping(path = "/customer/{firstName}/{lastName}")
	public void deleteCustomer(@PathVariable String firstName ,@PathVariable String lastName ) {
	    
		Customer customer = repository.findByFirstNameAndLastName(firstName,lastName);		
		repository.delete(customer);
		
	}
}
