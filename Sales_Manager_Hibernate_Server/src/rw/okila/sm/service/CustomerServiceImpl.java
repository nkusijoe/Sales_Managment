/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.okila.sm.dao.CustomerDao;
import rw.okila.sm.dao.ProductDao;
import rw.okila.sm.dao.SalesDao;
import rw.okila.sm.model.Customers;
import rw.okila.sm.model.Products;
import rw.okila.sm.model.Sales;
import rw.okila.sm.util.HibernateUtil;

/**
 *
 * @author hnjej
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerServiceInterface{

    public CustomerServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public void saveCustomer(Customers customer) throws RemoteException {
       CustomerDao dao=new CustomerDao();
       dao.saveCustomer(customer);
    }

    @Override
    public List<Customers> findAll() throws RemoteException {
        return null;
    }

    @Override
    public void saveProduct(Products products) throws RemoteException {
       ProductDao pdao=new ProductDao();
       pdao.saveProduct(products);
    }

    @Override
    public void saveSales(Sales sales) throws RemoteException {
       SalesDao sdao=new SalesDao();
       sdao.saveSales(sales);
    }

    @Override
    public void customerCombo(Customers customer) throws RemoteException {

    }
    }
    
