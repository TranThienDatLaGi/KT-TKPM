package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "product_name")
    private String name;
    private String description;
    private String image;
    private double quantity;
}
