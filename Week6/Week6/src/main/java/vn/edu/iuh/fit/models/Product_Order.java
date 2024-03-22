package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_order")
@IdClass()
public class Product_Order {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private double quantity;
    private String note;

}
