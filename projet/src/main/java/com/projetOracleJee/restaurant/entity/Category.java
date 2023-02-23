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
@Table(name = "category",
        uniqueConstraints = @UniqueConstraint(name = "name_unique",columnNames = "categoryName"))
public class Category {
    @Id
    @SequenceGenerator(name = "category_sequence",
        sequenceName = "category_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "category_sequence"
    )
    private Long categoryId;
    @Column(name = "categoryName")
    private String categoryName;


    // other fields and methods


    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )

    @JoinColumn(
            name = "category_id",
            referencedColumnName = "categoryId"
    )
    @Column(name = "items",nullable = true)

    private List<Item>  items;

}
