package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Livreur;
import com.projetOracleJee.restaurant.service.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liveur")
public class LivreurController {
    @Autowired
    private LivreurService service;

    @GetMapping("/")
    public List<Livreur> findAllLivreur(){
        return this.service.findAllLivreur();
    }
    @GetMapping("/{id}")
    public Livreur findByIdLivreur(@PathVariable(name = "id") Long id){
        return this.service.findByIdLivreur(id);
    }
    @PostMapping("/")
    public Livreur saveLivreur(@RequestBody Livreur livreur){
        return this.service.saveLivreur(livreur);
    }
    @PutMapping("/{id}")
    public Livreur saveLivreur(@PathVariable(name = "id") Long id, @RequestBody Livreur livreur){
        livreur.setLivreurId(id);
        return this.service.saveLivreur(livreur);
    }
    @DeleteMapping("/{id}")
    public void deleteLivreur(@PathVariable(name = "id") Long id){
        this.service.deleteLivreur(id);
    }
}
