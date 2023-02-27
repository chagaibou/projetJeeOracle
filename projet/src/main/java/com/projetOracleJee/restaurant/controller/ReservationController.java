package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Reservation;
import com.projetOracleJee.restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationService service;
    @GetMapping("/")
    public List<Reservation> findAllReservation(){
        return this.service.findAllReservation();
    }
    @GetMapping("/{id}")
    public Reservation findById(@PathVariable(name = "id") Long id){
        return this.service.findById(id);
    }
    @PostMapping("/")
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return this.service.saveReservation(reservation);
    }
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable(name = "id") Long id,@RequestBody Reservation reservation){
        return this.service.saveReservation(reservation);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") Long id){
        this.service.deleteById(id);
    }
}
