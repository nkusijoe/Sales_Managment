/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import rw.okila.sm.model.Customers;
import rw.okila.sm.model.Products;
import rw.okila.sm.model.Sales;

/**
 *
 * @author hnjej
 */
public interface CustomerServiceInterface extends Remote{
    public void saveCustomer(Customers customer) throws RemoteException;
    public void saveProduct(Products products) throws RemoteException;
    public void saveSales(Sales sales) throws RemoteException;
    public void customerCombo(Customers customer) throws RemoteException;
    public List<Customers> findAll() throws RemoteException;
}
