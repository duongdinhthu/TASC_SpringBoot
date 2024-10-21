package com.example.TASC_SpringBoot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity    //đây là annotation của JPA
public class Customer {
    @Id //đây là annotation của JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY) //đây là annotation của JPA
    @Column(name = "customer_id")  // Tên cột trong database . đây là annotation của JPA
    private Long customerId;

    @NotBlank //annotation  Java Bean Validation quan li (validate input)
    @Column(name = "name")          // Tên cột trong database //đây là annotation của JPA
    private String name;

    @Email//annotation  Java Bean Validation quan li (validate input)
    @Column(name = "email")         // Tên cột trong database //đây là annotation của JPA
    private String email;

    @Size(min = 2, max = 10)//annotation  Java Bean Validation quan li (validate input)
    @Column(name = "phone_number")   // Tên cột trong database //đây là annotation của JPA
    private String phoneNumber;

    @Column(name = "address")        // Tên cột trong database //đây là annotation của JPA
    private String address;

    @Column(name = "created_at")     // Tên cột trong database //đây là annotation của JPA
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
