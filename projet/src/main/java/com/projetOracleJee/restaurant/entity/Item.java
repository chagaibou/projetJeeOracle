package com.projetOracleJee.restaurant.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Items",
    uniqueConstraints = @UniqueConstraint(name = "item_unique",columnNames = "itemName")  )
public class Item {
    @Id
    @SequenceGenerator(name = "item_sequence",
    sequenceName = "item_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "item_sequence")
    private Long itemId;
    @Column(name = "itemName")
    private String itemName;
    private String itemDescription;
    private float itemPrice;
    private Boolean available=true;
}
