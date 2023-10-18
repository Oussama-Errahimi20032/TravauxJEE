/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.hibernate.annotations.NamedNativeQuery;

/**
 *
 * @author oussama
 */
//@NamedNativeQuery(name = "getProduitsCommandesEntreDates", query = "", resultClass = Produit.class)

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @OneToMany(mappedBy = "commande", fetch = FetchType.EAGER)
    private List<LigneCommandProduit> lignesCommande;


    public Commande() {
    }

    public Commande(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void afficherProduitsCommandes(){
        System.out.println("Produits commandés dans la commande " + id + " du " + date + ":");
        System.out.println("Liste des produits :");

        for (LigneCommandProduit ligne : lignesCommande) {
            System.out.println("\tReference: " + ligne.getProduit().getReference() + ", Prix: " + ligne.getProduit().getPrix() + ", Quantité: " + ligne.getQuantite());
    }
    }
    
}
