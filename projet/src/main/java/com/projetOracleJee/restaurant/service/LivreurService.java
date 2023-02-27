package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Livreur;
import com.projetOracleJee.restaurant.repository.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivreurService {
 @Autowired
 private LivreurRepository repo;

    public List<Livreur> findAllLivreur(){
     return this.repo.findAll();
    }
    public Livreur findByIdLivreur(Long id){
        return this.repo.findById(id).orElse(null);
    }
    public Livreur saveLivreur(Livreur livreur){
        return this.repo.save(livreur);
    }
    public void deleteLivreur(Long id){
         this.repo.deleteById(id);
    }


}
