package com.example.demo.ContractManager;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;

    private String contractType;
    private Date createdDate;
    private String status;

    // Constructors
    public Contract() {
    }

    public Contract(Integer contractId, String contractType, Date createdDate, String status) {
        this.contractId = contractId;
        this.contractType = contractType;
        this.createdDate = createdDate;
        this.status = status;
    }

    // Getters and setters
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
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

    // toString method
    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", contractType='" + contractType + '\'' +
                ", createdDate=" + createdDate +
                ", status='" + status + '\'' +
                '}';
    }
}

