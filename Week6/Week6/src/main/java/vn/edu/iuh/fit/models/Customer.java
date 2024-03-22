package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "customer")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;
    @Column(name = "customer_name")
    private String name;
    private String address;
    private String phone;
}
