package dao;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Bettayeb on 4/29/2017.
 */
public class ProduitDAO {

    public ProduitDAO(){

    }

    public void addProduit(Produit p){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
    }

    public void updateProduit(Produit p){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
    }

    public void deleteProduit(Produit p){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
    }

    public List getAllProduits(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q=session.createQuery("from Produit ");
        return q.list();
    }

}
