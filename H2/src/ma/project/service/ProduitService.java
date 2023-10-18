/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import java.util.List;
import ma.project.classes.Commande;
import ma.project.classes.Produit;
import ma.project.dao.IDao;
import ma.project.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author oussama
 */
public class ProduitService implements IDao<Produit>{

    @Override
    public boolean create(Produit p) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(p);
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
    public Produit getById(int id) {
        Produit produit = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            produit = (Produit) session.get(Produit.class, id);
            tx.commit();
            return produit;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return produit;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Produit> getAll() {
        List<Produit> produits = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            produits = session.createQuery("from Produit").list();
            tx.commit();
            return produits;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return produits;
        } finally {
            if(session != null)
                session.close();
        }
    }
    
    public List<Produit> getProduitsByCategorie(String categorieName) {
        List<Produit> products = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM Produit where categorie.libelle = :libelle";
            Query query = session.createQuery(hql);
            query.setParameter("libelle", categorieName);
            products = query.list();
            return products;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return products;
        } finally {
            if(session != null)
                session.close();
        }
    
    }
    
    public List<Produit> getProduitsPrixSuperieur(float prix){
        List<Produit> products = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM Produit p WHERE p.prix > :prixLimite";
            Query query = session.createQuery(hql);
            query.setParameter("prixLimite", prix);
            products = query.list();
            return products;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return products;
        } finally {
            if(session != null)
                session.close();
        }
    }
    
}
