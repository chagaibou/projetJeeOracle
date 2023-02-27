package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Comd_lie_cuisine;
import com.projetOracleJee.restaurant.entity.Commande;
import com.projetOracleJee.restaurant.repository.LcmdReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LcmdService {
    @Autowired
    private LcmdReposiory repo;

    public List<Comd_lie_cuisine> findAllLcmd(){
        return this.repo.findAll();
    }

    public Comd_lie_cuisine findById(Long id){
        return this.repo.findById(id).orElse(null);
    }
    public Comd_lie_cuisine saveLcmd(Comd_lie_cuisine commande){
        return this.repo.save(commande);
    }

    public void deleteLcmd(Long id){
        this.repo.deleteById(id);
    }
}
