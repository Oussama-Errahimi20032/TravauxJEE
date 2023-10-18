
import java.util.Date;
import java.util.List;
import ma.projet.classes.Employe;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oussama
 */
public class Test {
    public static void main(String[] args) {
        EmployeService ms = new EmployeService();
        TacheService ts = new TacheService();
        ProjetService ps = new ProjetService();
        Employe e =new Employe("hassan", "said", "numtel");
        ms.create(e);
        Employe e1=new Employe("employe", "emp", "numtel");
        ms.create(new Employe("ouvrier", "emplo", "codetel"));
        Projet p =new Projet("civil", new Date(), new Date(),e);
        Projet p1 =new Projet("hydrolique", new Date(), new Date(),e);
        ps.create(p);
        ps.create(p1);
        ts.create(new Tache("maintenance", new Date(), new Date(), 4500, p1));
        ts.create(new Tache("maintenance1", new Date(), new Date(), 4500, p));
       
        ms.getTachesRealise();
        
        
        
        
        
       
        
        
    }
}
