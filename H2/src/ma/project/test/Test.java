/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.Date;
import ma.project.classes.Commande;
import ma.project.service.CammandeService;
import ma.project.service.CategorieService;
import ma.project.service.ProduitService;
import ma.project.service.LigneCommandeService;
import ma.project.classes.Commande;
import ma.project.classes.Produit;
import ma.project.classes.Categorie;
import ma.project.classes.LigneCommandProduit;
import ma.project.classes.LigneCommandProduitId;

/**
 *
 * @author oussama
 */
public class Test {

    public static void main(String[] args) {
        CammandeService commandeService = new CammandeService();
        CategorieService categorieService = new CategorieService();
        ProduitService produitService = new ProduitService();
        LigneCommandeService ligneCommandeService = new LigneCommandeService();

        Categorie categorie1 = new Categorie("code00", "libelle00");
        Categorie categorie2 = new Categorie("code01", "libelle01");
        Categorie categorie3 = new Categorie("code02", "libelle02");

        Produit produit01 = new Produit("ES12", 120, categorie1);
        Produit produit02 = new Produit("ES19", 99, categorie1);
        Produit produit03 = new Produit("AR85", 100, categorie2);
        Produit produit04 = new Produit("ZR87", 30, categorie1);
        Produit produit05 = new Produit("BR85", 199, categorie3);
        Produit produit06 = new Produit("EE82", 55, categorie3);

        Commande commande01 = new Commande(new Date());
        Commande commande02 = new Commande(new Date());
        Commande commande03 = new Commande(new Date());

        categorieService.create(categorie1);
        categorieService.create(categorie2);
        categorieService.create(categorie3);

        produitService.create(produit01);
        produitService.create(produit02);
        produitService.create(produit03);
        produitService.create(produit04);
        produitService.create(produit05);
        produitService.create(produit06);

        commandeService.create(commande01);
        commandeService.create(commande02);
        commandeService.create(commande03);

        LigneCommandProduitId ligneCommandProduitId01 = new LigneCommandProduitId(commande01.getId(), produit01.getId());
        LigneCommandProduit ligneCommand01 = new LigneCommandProduit(produit01, commande01, 7);
        ligneCommand01.setId(ligneCommandProduitId01);

        LigneCommandProduitId ligneCommandProduitId02 = new LigneCommandProduitId(commande01.getId(), produit02.getId());
        LigneCommandProduit ligneCommand02 = new LigneCommandProduit(produit02, commande01, 4);
        ligneCommand02.setId(ligneCommandProduitId02);

        LigneCommandProduitId ligneCommandProduitId03 = new LigneCommandProduitId(commande02.getId(), produit03.getId());
        LigneCommandProduit ligneCommand03 = new LigneCommandProduit(produit03, commande02, 1);
        ligneCommand03.setId(ligneCommandProduitId03);

        LigneCommandProduitId ligneCommandProduitId04 = new LigneCommandProduitId(commande02.getId(), produit04.getId());
        LigneCommandProduit ligneCommand04 = new LigneCommandProduit(produit04, commande02, 3);
        ligneCommand04.setId(ligneCommandProduitId04);

        LigneCommandProduitId ligneCommandProduitId05 = new LigneCommandProduitId(commande03.getId(), produit05.getId());
        LigneCommandProduit ligneCommand05 = new LigneCommandProduit(produit05, commande03, 12);
        ligneCommand05.setId(ligneCommandProduitId05);

        LigneCommandProduitId ligneCommandProduitId06 = new LigneCommandProduitId(commande03.getId(), produit06.getId());
        LigneCommandProduit ligneCommand06 = new LigneCommandProduit(produit06, commande03, 5);
        ligneCommand06.setId(ligneCommandProduitId06);

        ligneCommandeService.create(ligneCommand01);
        ligneCommandeService.create(ligneCommand02);
        ligneCommandeService.create(ligneCommand03);
        ligneCommandeService.create(ligneCommand04);
        ligneCommandeService.create(ligneCommand05);
        ligneCommandeService.create(ligneCommand06);

    }
}
