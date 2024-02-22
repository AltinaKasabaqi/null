package com.example.demo.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        // Përdor repository për të gjetur një klient nga ID-ja
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        // Kthej klientin nëse gjendet, në të kundërt null
        return optionalCustomer;
    }
}
