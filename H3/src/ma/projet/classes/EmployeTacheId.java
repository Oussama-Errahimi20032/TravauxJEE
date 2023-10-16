/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class EmployeTacheId implements Serializable {
    
    private int employe_id;
    private int tache_id;

    public EmployeTacheId() {
    }

    public EmployeTacheId(int employe_id, int tache_id) {
        this.employe_id = employe_id;
        this.tache_id = tache_id;
    }

    public int getEmployeId() {
        return employe_id;
    }

    public void setEmployeId(int employe_id) {
        this.employe_id = employe_id;
    }

    public int getTacheId() {
        return tache_id;
    }

    public void setTacheId(int tache_id) {
        this.tache_id = tache_id;
    }
    
    
}
