/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

/**
 *
 * @author oussama
 */
public class Test {

    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
        // Produit pr =new Produit();
        ps.create(new Produit("dacia", new Date(), 200, "good"));
        ps.create(new Produit("mercedes", new Date(), 85, "good"));
        ps.create(new Produit("renault", new Date(), 500, "moyenne"));
        ps.create(new Produit("golf", new Date(), 800, "moyenne"));
        ps.create(new Produit("volvo", new Date(), 900, "moyenne"));

        for (Produit p : ps.findAll()) {
            System.out.println(p.getMarque());
        }

        System.out.println(ps.findById(2).toString());
        ps.delete(ps.findById(3));
        
       // Produit pr = ps.findById(1);
       // pr.setMarque("golf");
       // pr.setDisignation("moyenne");
       // ps.update(pr);
        
        for (Produit p : ps.findAll()) {
            if (p.getPrix() > 100) {
                System.out.println(p.toString());
            } else {
                System.out.println("Produits n'existe pas");
            }
        }
        
         
    }
}
