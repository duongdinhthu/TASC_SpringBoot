package com.example.TASC_SpringBoot.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")  // Tên cột trong database
    private Long productId;

    @Column(name = "product_name") // Tên cột trong database
    private String productName;

    @Column(name = "price")         // Tên cột trong database
    private double price;

    @Column(name = "stock")         // Tên cột trong database
    private int stock;

    @Column(name = "created_at")    // Tên cột trong database
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters và Setters
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
