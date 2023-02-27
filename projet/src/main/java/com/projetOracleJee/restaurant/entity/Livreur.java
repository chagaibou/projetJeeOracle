package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Livreur {
    @Id
    @SequenceGenerator(name = "livreur_sequence",
            sequenceName = "livreur_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "livreur_sequence")
    private Long livreurId;
    private String nomLivreur;
    private String prenomLivreur;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sac_Livreur")
    private List<Item> items;
}
