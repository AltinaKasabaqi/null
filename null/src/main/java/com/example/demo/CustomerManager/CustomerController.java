package com.example.demo.CustomerManager;
import com.example.demo.CustomerManager.Customer;
import com.example.demo.CustomerManager.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public <CustomerDTO> ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerDTO) {
        // Krijojini një objekt Customer nga të dhënat e pranuara nga klienti
        Customer customer = new Customer();
        customer.setCustomerType("Aktive");
        customer.setCreatedDate(new Date());
        customer.setStatus(customer.getStatus());


        // Ruajeni klientin në bazën e të dhënave përmes shërbimit të duhur
        Customer createdCustomer = customerService.saveCustomer(customer);

        // Kthejeni një përgjigje HTTP për të treguar nëse krijimi ishte i suksesshëm ose jo
        if (createdCustomer != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Klienti u krijua me sukses");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ka ndodhur një problem gjatë krijimit të klientit");
        }
    }
}

