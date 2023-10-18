/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author oussama
 */
@Embeddable
public class EmployeTachePk implements Serializable{
    private int tache;
    private int employe;

    public EmployeTachePk() {
    }

    public EmployeTachePk(int tache, int employe) {
        this.tache = tache;
        this.employe = employe;
    }

    public int getTache() {
        return tache;
    }

    public void setTache(int tache) {
        this.tache = tache;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }
    
    
}
