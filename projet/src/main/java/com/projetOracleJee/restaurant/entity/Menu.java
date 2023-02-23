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
public class Menu {
    @Id
    @SequenceGenerator(name = "menu_sequence",
            sequenceName = "menu_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "menu_sequence")
    private Long menuId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "menu_id",
            referencedColumnName = "MenuId"
    )
    @Column(name = "categories",nullable = true)
    private List<Category> categories;


}
