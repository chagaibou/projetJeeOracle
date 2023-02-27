package com.projetOracleJee.restaurant.repository;

import com.projetOracleJee.restaurant.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
