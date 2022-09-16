/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.okila.sm.view;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rw.okila.sm.model.Products;

/**
 *
 * @author joe
 */
public class ProductView extends javax.swing.JInternalFrame {

   /**
     * Creates new form ProductsView
     */
    public ProductView() {
        
        initComponents();
        showProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        descriptionTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        saveProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        typeSelect = new javax.swing.JComboBox<>();
        manDate = new com.toedter.calendar.JDateChooser();
        expDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        pidTxt = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("New Product");

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        jLabel3.setText("Type:");

        jLabel5.setText("Man Date:");

        jLabel6.setText("Exp Date:");

        jLabel7.setText("Price:");

        descriptionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTxtActionPerformed(evt);
            }
        });

        saveProduct.setText("Save");
        saveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProductActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Description", "Type", "Manufacture Date", "Expiration Date", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        typeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "electronic", "sport", "fashion", "food", " " }));

        jLabel4.setText("Product ID:");

        pidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTxt)
                    .addComponent(descriptionTxt)
                    .addComponent(priceTxt)
                    .addComponent(typeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expDate, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(manDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pidTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(manDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(expDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(saveProduct)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTxtActionPerformed

        public void saveProd() {
        try {
            Products prod = new Products();
            prod.setProdtin(pidTxt.getText());
            prod.setProdname(nameTxt.getText());
            prod.setProddescription(descriptionTxt.getText());
            prod.setProdtype(typeSelect.getSelectedItem().toString());
            prod.setMandate(manDate.getDate().toString());
            prod.setExpdate(expDate.getDate().toString());
            prod.setPrice(priceTxt.getText());

            //UPDATE FORM
            pidTxt.setText("");
            nameTxt.setText("");
            descriptionTxt.setText("");
            typeSelect.setSelectedItem("choose");
            manDate.setDate(null);
            expDate.setDate(null);
            priceTxt.setText("");
            
            //UPDATE TABLE
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setRowCount(0);
            showProducts();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
public void showProducts()
{
    
}
 
    private void saveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProductActionPerformed
             if(pidTxt.getText().length()==5 ){

        saveProd();
       
        JOptionPane.showMessageDialog(null, "successfully saved","Data saved", JOptionPane.INFORMATION_MESSAGE);
    }
    else{
          JOptionPane.showMessageDialog(null, "you must have phone number containing 10 digits and tin muber containing 9 digits");
            }
        pidTxt.setText("");
        nameTxt.setText("");
        descriptionTxt.setText("");
        typeSelect.setSelectedItem("choose");
        manDate.setDate(null);
        expDate.setDate(null);
        priceTxt.setText("");
        
    }//GEN-LAST:event_saveProductActionPerformed

    private void pidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descriptionTxt;
    private com.toedter.calendar.JDateChooser expDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser manDate;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pidTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTable productTable;
    private javax.swing.JButton saveProduct;
    private javax.swing.ButtonGroup type;
    private javax.swing.JComboBox<String> typeSelect;
    // End of variables declaration//GEN-END:variables
}