/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.dao;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.okila.sm.model.Sales;
import rw.okila.sm.util.HibernateUtil;

/**
 *
 * @author joe
 */
public class SalesDao {
        static Session session = null;
    
    public void saveSales(Sales sale){
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(sale);
            tx.commit();
       
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            session.close();

    
}
}
}
