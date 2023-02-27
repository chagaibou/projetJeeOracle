package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @SequenceGenerator(name = "reservation_sequence",
            sequenceName = "reservation_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_sequence")
    private Long idReservation;
    private String type;
    private Long nbrPerso;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
