/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.classes;

import java.io.Serializable;

/**
 *
 * @author oussama
 */
public class LigneCommandProduitId implements Serializable  {
    private int commande_id;
    private int produit_id;

    public LigneCommandProduitId() {
    }

    public LigneCommandProduitId(int commandeId, int produitId) {
        this.commande_id = commandeId;
        this.produit_id = produitId;
    }

    public int getCommandeId() {
        return commande_id;
    }

    public void setCommandeId(int commandeId) {
        this.commande_id = commandeId;
    }

    public int getProduitId() {
        return produit_id;
    }

    public void setProduitId(int produitId) {
        this.produit_id = produitId;
    }

    
    
    
}
