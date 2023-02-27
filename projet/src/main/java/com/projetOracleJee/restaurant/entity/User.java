package com.projetOracleJee.restaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60)
    private String password;
    private String role;
    private boolean enable = false;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "address_id",
            referencedColumnName = "addressId"
    )
    private Address address;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Commande> commandes;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Reservation> reservations ;
}
