/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.util;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rw.okila.sm.service.CustomerServiceImpl;

/**
 *
 * @author hnjej
 */
public class Server {
    public static void main(String[] args) {
        try {
            Registry registry=LocateRegistry.createRegistry(9876);
            registry.rebind("customerService", new CustomerServiceImpl());
            System.out.println("Server started...");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
