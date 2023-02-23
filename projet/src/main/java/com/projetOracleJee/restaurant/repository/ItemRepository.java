package com.projetOracleJee.restaurant.repository;

import com.projetOracleJee.restaurant.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}
