package com.example.demo;

import com.example.demo.CustomerManager.Customer;
import com.example.demo.CustomerManager.CustomerController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class NullApplicationTests {


	@Test
	void contextLoads() {
	}

}

//	CustomerController customerController = new CustomerController();
//
//	// Krijoni një objekt Customer
//	Customer customer = new Customer();
//		customer.setCustomerType("individual");
//		customer.setCreatedDate(new Date());
//		customer.setStatus("Active");

// Thirrja e metodes createCustomer nga CustomerController
//	ResponseEntity<String> response = customerController.createCustomer(customer);
//
//		if (response.getStatusCode() == HttpStatus.CREATED) {
//		System.out.println("Klienti u krijua me sukses!");
//	} else {
//		System.out.println("Ka ndodhur një problem gjatë krijimit të klientit.");
//	}

//	@Test
//	Customer createCustomer(customer);
