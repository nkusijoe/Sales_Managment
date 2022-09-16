/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.okila.sm.model.Customers;
import rw.okila.sm.util.HibernateUtil;

/**
 *
 * @author joe
 */
public class CustomerDao {

    static Session session = null;
    
    public void saveCustomer(Customers customer){
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(customer);
            tx.commit();
       
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            session.close();

    
}
}
}
