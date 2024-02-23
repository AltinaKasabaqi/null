package com.example.demo;


import com.example.demo.ContractManager.Contract;
import com.example.demo.ContractManager.ContractController;
import com.example.demo.ContractManager.ContractService;
import com.example.demo.CustomerManager.CustomerController;
import com.example.demo.CustomerManager.Customer;
import com.example.demo.CustomerManager.CustomerService;
import com.example.demo.ServiceManager.Service;
import com.example.demo.ServiceManager.ServiceController;
import com.example.demo.ServiceManager.ServiceState;
import com.example.demo.ServiceManager.ServiceType;
import com.example.demo.Subscription.Subscription;
import com.example.demo.Subscription.SubscriptionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    private CustomerController customerController;

    @Autowired
    ContractController contractController;

    @Autowired
    SubscriptionController subscriptionController;

    @Autowired
    ServiceController serviceController;

    @Autowired
    CustomerService customerService;

    @Autowired
    ContractService contractService;

    @Test
    public void testCreateCustomer() {
        // Krijo një objekt CustomerDTO për testim
        Customer customerDTO = new Customer();
        customerDTO.setCustomerType("individual");
        // Set other properties as needed...

        // Thirr metoden createCustomer nga CustomerController
        ResponseEntity<String> response = customerController.createCustomer(customerDTO);

        // Testo përgjigjen e kthyer
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Përgjigja e pritur nuk është e drejtë");
    }

    @Test
    public void testCreateContract() {

        Contract contract = new Contract();
        contract.setContractType("type");
        contract.setCreatedDate(new Date());
        contract.setStatus("Active");

        // Thirr metoden createContract nga ContractController
        ResponseEntity<Contract> response = contractController.createContract(contract);

        // Testo përgjigjen e kthyer
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Përgjigja e pritur nuk është e drejtë");
    }

    @Test
    public void testCreateSubscription() {
        // Krijo një objekt Subscription për testim
        Subscription subscription = new Subscription();
        subscription.setPhoneNumber("123456789");
        subscription.setCreatedDate(new Date());
        subscription.setStatus("Active");
        subscription.setContractId(1L); // Vendosni një ID të kontratës ekzistuese për abonimin

        // Thirr metoden createSubscription nga SubscriptionController
        ResponseEntity<Subscription> response = subscriptionController.createSubscription(subscription);

        // Testo përgjigjen e kthyer
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Përgjigja e pritur nuk është e drejtë");

        // Për saktësi të shtuar, kontrollo përmbajtjen e objektit të abonimit në përgjigje
        Subscription createdSubscription = response.getBody();
        assertNotNull(createdSubscription, "Abonimi nuk u krijua siç pritej");
        assertEquals("123456789", createdSubscription.getPhoneNumber(), "Numri i telefonit nuk është i drejtë");
        // Shtoni kontrollin e të dhënave të tjera të abonimit nëse është e nevojshme
    }

    @Test
    public void testCreateService() {
        // Krijo një objekt Service për testim
        Service service = new Service();
        service.setServiceType(ServiceType.SimCard);
        service.setCreatedDate(new Date());
        service.setState(ServiceState.ACTIVE);

        // Thirr metoden createService nga ServiceController
        ResponseEntity<Service> response = serviceController.createService(service);

        // Testo përgjigjen e kthyer
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Përgjigja e pritur nuk është e drejtë");

        // Për saktësi të shtuar, kontrollo përmbajtjen e objektit të shërbimit në përgjigje
        Service createdService = response.getBody();
        assertNotNull(createdService, "Shërbimi nuk u krijua siç pritej");
        assertEquals(ServiceType.SimCard, createdService.getServiceType(), "Lloji i shërbimit nuk është i drejtë");
        // Shtoni kontrollin e të dhënave të tjera të shërbimit nëse është e nevojshme
    }



    @SpringBootTest
    public class ContractControllerTest {

        @Autowired
        private ContractController contractController;

        @Test
        public void testCreateContract() {
            Contract contract = new Contract();
            contract.setContractType("type");
            contract.setCreatedDate(new Date());
            contract.setStatus("Active");

            ResponseEntity<Contract> response = contractController.createContract(contract);

            assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Përgjigja e pritur nuk është e drejtë");

            Contract createdContract = response.getBody();
            assertNotNull(createdContract, "Kontrata nuk u krijua siç pritej");
        }
    }

    }







