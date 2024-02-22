package com.example.demo.CustomerManager;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String customerType;
    private Date createdDate;
    private String status;

    public Customer() {
    }

    public Customer(String customerType, Date createdDate, String status) {
        this.customerType = customerType;
        this.createdDate = createdDate;
        this.status = status;
    }

    // Getters dhe setters
    public Integer getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

