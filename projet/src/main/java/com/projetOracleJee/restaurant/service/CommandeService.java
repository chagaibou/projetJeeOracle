package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetOracleJee.restaurant.entity.Commande;
import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository repo;

    public List<Commande> findAllCmd(){
        return this.repo.findAll();
    }

    public Commande findById(Long id){
        return this.repo.findById(id).orElse(null);
    }
    public Commande saveCmd(Commande commande){
        return this.repo.save(commande);
    }

    public void deleteCmd(Long id){
        this.repo.deleteById(id);
    }
}
