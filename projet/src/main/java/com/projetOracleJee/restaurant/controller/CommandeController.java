package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projetOracleJee.restaurant.entity.Commande;
import java.util.List;
@RestController
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    private CommandeService service;
    @GetMapping("/")
    public List<Commande> listCmd(){
        return this.service.findAllCmd();
    }
    @PostMapping("/")
    public Commande saveCmd(@RequestBody Commande commande){
        return this.service.saveCmd(commande);
    }

    @PutMapping("/{id}")
    public Commande editCmd(@PathVariable(name="id")Long id,@RequestBody Commande commande){
        commande.setIdCmd(id);
        return this.service.saveCmd(commande);
    }
    @DeleteMapping("/{id}")
    public void deleteCmd(@PathVariable(name="id")Long id,@RequestBody Commande commande){
        this.service.deleteCmd(id);
    }
}
