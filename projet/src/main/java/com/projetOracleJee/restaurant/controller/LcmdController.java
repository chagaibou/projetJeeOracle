package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Comd_lie_cuisine;
import com.projetOracleJee.restaurant.service.LcmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ligne_commande")
public class LcmdController {
    @Autowired
    private LcmdService service;
    @GetMapping("/")
    public List<Comd_lie_cuisine> findAllLcmd(){
        return this.service.findAllLcmd();
    }
    @GetMapping("/{id}")
    public Comd_lie_cuisine findById(@PathVariable(name = "id") Long id){
        return this.service.findById(id);
    }
    @PostMapping("/")
    public Comd_lie_cuisine saveLcmd(@RequestBody Comd_lie_cuisine commande){
        return this.service.saveLcmd(commande);
    }
    @PutMapping ("/{id}")
    public Comd_lie_cuisine saveLcmd(@PathVariable(name = "id") Long id,@RequestBody Comd_lie_cuisine commande){
        commande.setIdLcmd(id);
        return this.service.saveLcmd(commande);
    }
    @DeleteMapping("/{id}")
    public void deleteLcmd(@PathVariable(name = "id") Long id){
        this.service.deleteLcmd(id);
    }
}
