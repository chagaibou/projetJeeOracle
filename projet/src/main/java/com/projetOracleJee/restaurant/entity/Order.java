package com.projetOracleJee.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @SequenceGenerator(name = "order_sequence",
    sequenceName = "order_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long orderId;
    private Date orderDate;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "user_id",referencedColumnName = "userId")
    private User user;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "order_line",
            joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "item_id",referencedColumnName = "itemId")
    )
    private List<Item> items;

}
