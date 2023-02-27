package com.projetOracleJee.restaurant.repository;

import com.projetOracleJee.restaurant.entity.Comd_lie_cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LcmdReposiory extends JpaRepository<Comd_lie_cuisine,Long> {
}
