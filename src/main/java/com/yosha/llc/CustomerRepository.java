package com.yosha.llc;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByState(String state);
    public List<Customer> findByCounty(String county);
    public Customer findByFirstNameAndLastName(String firstName , String lastName);
    
}