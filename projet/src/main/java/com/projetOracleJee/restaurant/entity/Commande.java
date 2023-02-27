package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commande {
    @Id
    @SequenceGenerator(name = "commande_sequence",
            sequenceName = "commande_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commande_sequence")
    private Long idCmd;
    private Date date_cmd;
    private float prix_total;
    @ManyToMany(mappedBy = "commandes",cascade = CascadeType.ALL)
    private List<Item> items;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
