/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.ArrayList;
import java.util.List;
import ma.project.classes.Commande;
import ma.project.classes.Produit;
import ma.project.service.CammandeService;
import ma.project.service.ProduitService;

/**
 *
 *  @author oussama
 */
public class Test2 {
    public static void main(String[] args){
    
    CammandeService commandeService = new CammandeService();
    ProduitService produitService = new ProduitService();
    
    
//    Q5)
    Commande commande = commandeService.getById(1);
    commande.afficherProduitsCommandes();
    
    // Q6)
//    List<Produit> produits = new ArrayList<Produit>();
//    produits = produitService.getProduitsPrixSuperieur(100);
//    
//    for(Produit produit: produits){
//        System.out.println(produit);
//    }
    
    // Q3) Méthode permettant d’afficher la liste des produits par catégorie
//    List<Produit> produits = new ArrayList<Produit>();
//    produits = produitService.getProduitsByCategorie("libelle-00");
//    
//    if( produits == null ){
//        System.out.println("Null pointer");
//    }else{
//        for(Produit produit: produits){
//            System.out.println(produit);
//        }
//    }
    
    
    
    }
}
