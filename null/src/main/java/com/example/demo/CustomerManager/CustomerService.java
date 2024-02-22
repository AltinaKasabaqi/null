package com.example.demo.CustomerManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CustomerService {
    Customer saveCustomer(Customer customer);


    Optional<Customer> findById(Integer i);
}


