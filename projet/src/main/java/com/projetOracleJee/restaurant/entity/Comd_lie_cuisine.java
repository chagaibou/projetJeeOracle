package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comd_lie_cuisine {
    @Id
    @SequenceGenerator(name = "lcmd_sequence",
            sequenceName = "lcmd_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lcmd_sequence")
    private Long idLcmd;
    private String quantiteLcmd;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Item_Lcmd")
    private List<Item> items;
}
