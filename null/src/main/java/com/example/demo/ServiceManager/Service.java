package com.example.demo.ServiceManager;


import jakarta.persistence.*;
import java.util.Date;



@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ServiceType serviceType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @Enumerated(EnumType.STRING)
    private ServiceState state;

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    // Metoda getter për serviceType
    public ServiceType getServiceType() {
        return serviceType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }



    public ServiceState getState() {
        return state;
    }

    public void setState(ServiceState state) {
        this.state = state;
    }

    // Constructor, getters, setters, and other methods
}

