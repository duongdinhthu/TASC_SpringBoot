package com.example.TASC_SpringBoot.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")  // Tên cột trong database
    private Long customerId;

    @Column(name = "name")          // Tên cột trong database
    private String name;

    @Column(name = "email")         // Tên cột trong database
    private String email;

    @Column(name = "phone_number")   // Tên cột trong database
    private String phoneNumber;

    @Column(name = "address")        // Tên cột trong database
    private String address;

    @Column(name = "created_at")     // Tên cột trong database
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters và Setters
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
