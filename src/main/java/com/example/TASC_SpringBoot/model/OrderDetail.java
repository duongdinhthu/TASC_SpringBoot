package com.example.TASC_SpringBoot.model;

import jakarta.persistence.*;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")  // Tên cột trong database
    private Long orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)  // Tên cột trong database
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)  // Tên cột trong database
    private Product product;

    @Column(name = "quantity")  // Tên cột trong database
    private int quantity;

    // Getters và Setters
    public Long getOrderDetailId() { return orderDetailId; }
    public void setOrderDetailId(Long orderDetailId) { this.orderDetailId = orderDetailId; }

    public Orders getOrders() { return orders; }
    public void setOrders(Orders orders) { this.orders = orders; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
