/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import java.util.List;
import ma.project.classes.Commande;
import ma.project.classes.LigneCommandProduit;
import ma.project.dao.IDao;
import ma.project.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author oussama
 */
public class LigneCommandeService implements IDao<LigneCommandProduit>{

    @Override
    public boolean create(LigneCommandProduit t) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(t);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public LigneCommandProduit getById(int id) {
        LigneCommandProduit ligneCommandProduit = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            ligneCommandProduit = (LigneCommandProduit) session.get(LigneCommandProduit.class, id);
            tx.commit();
            return ligneCommandProduit;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return ligneCommandProduit;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<LigneCommandProduit> getAll() {
        List<LigneCommandProduit> ligneCommandProduits = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            ligneCommandProduits = session.createQuery("from LigneCommandProduit").list();
            tx.commit();
            return ligneCommandProduits;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return ligneCommandProduits;
        } finally {
            if(session != null)
                session.close();
        }
    }
    
}
