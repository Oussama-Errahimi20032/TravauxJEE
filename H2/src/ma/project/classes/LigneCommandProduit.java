/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.classes;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author oussama
 */

@Entity
public class LigneCommandProduit {
    
    // Clé primaire composée
    @EmbeddedId
    private LigneCommandProduitId id;
    
    @ManyToOne
    @JoinColumn(name = "produit_id", insertable = false, updatable = false)
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "commande_id", insertable = false, updatable = false)
    private Commande commande;

    private int quantite;

    public LigneCommandProduit() {
    }

    public LigneCommandProduit(Produit produit, Commande commande, int quantite) {
        this.produit = produit;
        this.commande = commande;
        this.quantite = quantite;
    }

    public LigneCommandProduitId getId() {
        return id;
    }

    public void setId(LigneCommandProduitId id) {
        this.id = id;
    }
    
    

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
    
}
