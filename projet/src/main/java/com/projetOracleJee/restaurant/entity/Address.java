package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @SequenceGenerator(name = "address_sequence",
    sequenceName = "address_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long addressId;
    private String addressNum;
    private Long codePostal;
    private String location;
}
