/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;

/**
 *
 * @author hp
 */
public class Test2 {
    public static void main(String[] args){
    
    TacheService tacheService = new TacheService();
    ProjetService projetService = new ProjetService();
    
    

     //Q7)
    Tache tache00 = new Tache("Tache n00",new Date(), new Date(), 130.0);
    Tache tache01 = new Tache("Tache n00",new Date(), new Date(), 199.8);
    tacheService.create(tache00);
    tacheService.create(tache01);
    
    List<Tache> taches = new ArrayList<>();
    taches = tacheService.getTachesPrixSuperieur(100.0);
    
    for(Tache tache: taches){
        System.out.println(taches);
    }
    
    // Q6)
    Projet projet = projetService.getById(1);
    List<Tache> taches = new ArrayList<>();
    taches = projet.getTaches();
    
    for(Tache tache: taches){
        System.out.println(taches);
    }
    
    
    }
}
