package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Reservation;
import com.projetOracleJee.restaurant.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repo;

    public List<Reservation> findAllReservation(){
        return this.repo.findAll();
    }
    public Reservation findById(Long id){
        return this.repo.findById(id).orElse(null);
    }
    public Reservation saveReservation(Reservation reservation){
        return this.repo.save(reservation);
    }
    public void deleteById(Long id){
        this.repo.deleteById(id);
    }

}
