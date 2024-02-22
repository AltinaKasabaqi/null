package com.example.demo.Subscription;

import java.util.Date;

public class Subscription {
    private Long sid;
    private String phoneNumber;
    private Date createdDate;
    private String status;
    private Long contractId;

    public Subscription() {
        // Konstruktori bosh
    }

    public Subscription(Long sid, String phoneNumber, Date createdDate, String status, Long contractId) {
        this.sid = sid;
        this.phoneNumber = phoneNumber;
        this.createdDate = createdDate;
        this.status = status;
        this.contractId = contractId;
    }

    // Metodat getter dhe setter për atributet

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "sid=" + sid +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createdDate=" + createdDate +
                ", status='" + status + '\'' +
                ", contractId=" + contractId +
                '}';
    }
}
