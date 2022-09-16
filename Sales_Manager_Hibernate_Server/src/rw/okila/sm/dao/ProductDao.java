/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.okila.sm.model.Products;
import rw.okila.sm.util.HibernateUtil;

/**
 *
 * @author joe
 */
public class ProductDao {
        static Session session = null;
    
    public void saveProduct(Products product){
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(product);
            tx.commit();
       
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            session.close();

    
}
}
        public List<Products> listProducts() {
        int rows = 0;
        Connection con = null;
        
        List<Products> result = new ArrayList<>();
        try {
            String url="jdbc:postgresql://localhost:5432/okila_db";
            String user="postgres";
            String password = "postgres";
            con = DriverManager.getConnection(url, user, password);
            String sql = "select * from products;";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs;
            rs = st.executeQuery();
            while (rs.next()) {
                Products prod= new Products();
                prod.setProdtin(rs.getString("prodtin"));
                prod.setProdname(rs.getString("prodname"));
                prod.setProddescription(rs.getString("proddescription"));
                prod.setProdtype(rs.getString("prodtype"));
                prod.setMandate(rs.getString("mandate"));
                prod.setExpdate(rs.getString("expdate"));
                prod.setPrice(rs.getString("price"));
                result.add(prod);
            }
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
        
        
}
