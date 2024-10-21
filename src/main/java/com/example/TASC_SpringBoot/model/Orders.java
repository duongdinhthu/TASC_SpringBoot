package com.example.TASC_SpringBoot.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")  // Tên cột trong database
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)  // Tên cột trong database
    private Customer customer;

    @Column(name = "order_date")  // Tên cột trong database
    private LocalDateTime orderDate = LocalDateTime.now();

    @Column(name = "total_amount")  // Tên cột trong database
    private double totalAmount;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails;

    // Getters và Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public List<OrderDetail> getOrderDetails() { return orderDetails; }
    public void setOrderDetails(List<OrderDetail> orderDetails) { this.orderDetails = orderDetails; }
}
