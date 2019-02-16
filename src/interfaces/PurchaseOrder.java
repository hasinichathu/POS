/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.Connect;
import java.awt.event.KeyEvent;
//import database.Report;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Hasini
 */
public class PurchaseOrder extends javax.swing.JInternalFrame {

   
    private DefaultTableModel dtm;
    
    public PurchaseOrder() {
        initComponents();        
        dtm = (DefaultTableModel) invtable.getModel();

        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        DateFormat df1 = new SimpleDateFormat("hh:mm:ss");
        Date dobj=new Date();

        dateTxt.setText(df.format(dobj));
        timeTxt.setText(df1.format(dobj));
        po();
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ordernoTxt = new javax.swing.JTextField();
        supidTxt = new javax.swing.JTextField();
        supnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        itemNoTxt = new javax.swing.JTextField();
        netTotalTxt = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        itemIDTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        unitpTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        totalTxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invtable = new javax.swing.JTable();
        clearBtn = new javax.swing.JButton();
        qtyTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(17, 153, 148));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Purchase Order");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        dateTxt.setEditable(false);
        dateTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });
        jPanel4.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Purchase Order No:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 20));

        ordernoTxt.setEditable(false);
        ordernoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ordernoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordernoTxtActionPerformed(evt);
            }
        });
        jPanel4.add(ordernoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, -1));

        supidTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        supidTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supidTxtMouseClicked(evt);
            }
        });
        supidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supidTxtActionPerformed(evt);
            }
        });
        jPanel4.add(supidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 80, -1));

        supnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supnameTxtActionPerformed(evt);
            }
        });
        jPanel4.add(supnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Supplier ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 70, 20));

        jLabel3.setText("Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Time :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 40, 20));

        timeTxt.setEditable(false);
        timeTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });
        jPanel4.add(timeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 120, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Net Amount");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 36));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("No of items");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 36));

        itemNoTxt.setEditable(false);
        itemNoTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemNoTxt.setToolTipText("");
        itemNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNoTxtActionPerformed(evt);
            }
        });
        jPanel2.add(itemNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 141, 37));

        netTotalTxt.setEditable(false);
        netTotalTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        netTotalTxt.setText("0.00");
        netTotalTxt.setToolTipText("");
        netTotalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netTotalTxtActionPerformed(evt);
            }
        });
        jPanel2.add(netTotalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 141, 37));

        okBtn.setText("Save");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel2.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 343, 280, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 340, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Item no:");

        itemIDTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemIDTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemIDTxtMouseClicked(evt);
            }
        });
        itemIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIDTxtActionPerformed(evt);
            }
        });
        itemIDTxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                itemIDTxtPropertyChange(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Item Name:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Unit Price:");

        unitpTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unitpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitpTxtActionPerformed(evt);
            }
        });

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Total");

        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        totalTxt.setEditable(false);
        totalTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Quantity");

        invtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Qty", "Unit Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(invtable);

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearBtn.setText("Clear all");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        qtyTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qtyTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                qtyTxtFocusLost(evt);
            }
        });
        qtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTxtActionPerformed(evt);
            }
        });
        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(itemIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(unitpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 660, 420));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

        if(itemNoTxt.equals("0")){
            JOptionPane.showMessageDialog(this,"Please Add Items");
        }
        else{
            String supID = supidTxt.getText().trim();
//                       String OrderName = supnameTxt.getText().trim();
            

            Connect c = new Connect();
            String query = "INSERT INTO purchase_order (supplier_supplier_id, date) VALUES ("
            
            
            +  supID + "," 
//            +  "'" + OrderName +"'"+ ","         
            + "CURDATE()" 
            

            + ")";
            int genid =c.setQuery(query,"");
           

            int i;
            for (i = 0; i < invtable.getRowCount(); i++) {
                String tabID = invtable.getValueAt(i, 0).toString();
                String tabQty = invtable.getValueAt(i, 2).toString();

                String query2 = "INSERT INTO purchase_order_has_item ( purchase_order_purchase_order_id, item_item_code, quantity )VALUES ("

                + genid  + ","
                + tabID  + ","
                +  tabQty  
                
                + ")";
                c.setQuery(query2,"");
            }

            JOptionPane.showMessageDialog(this,"Purchase Order Added");
        }
        
        supidTxt.setText("");
            int in=Integer.parseInt(ordernoTxt.getText().toString());
            
                    ordernoTxt.setText(Integer.toString(in+1));          
                    netTotalTxt.setText(""+0.00);
                    itemNoTxt.setText(""+0);
                    dtm.setRowCount(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_okBtnActionPerformed

    private void totalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String id = itemIDTxt.getText();
        String name = nameTxt.getText();
        String qty = qtyTxt.getText();
        String unitp = unitpTxt.getText();

        double qtyD = Double.parseDouble(qty);
        double unitpD = Double.parseDouble(unitp);
        double total = qtyD * unitpD;

        int i;
        boolean found = false;
        for (i = 0; i < invtable.getRowCount(); i++) {
            String tabID = invtable.getValueAt(i, 0).toString();
            if (id.equals(tabID)) {
                found = true;
                break;
            }
        }
        if (found) {
            double oldQty = Double.parseDouble(invtable.getValueAt(i, 2).toString());
            double newQty = oldQty + qtyD;
            invtable.setValueAt("" + newQty, i, 2);
            double oldtotal = Double.parseDouble(invtable.getValueAt(i, 4).toString());
            double newTotal = (newQty * unitpD);
            invtable.setValueAt("" + newTotal, i, 4);
        } else {
            dtm.addRow(new Object[]{id, name, qty, unitp, total});
        }

        try {
            double prevTotal = Double.parseDouble(netTotalTxt.getText());
            netTotalTxt.setText("" + (prevTotal + total));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Total Filed is empty");
        }
        
        String nettot = netTotalTxt.getText();
        
        itemIDTxt.setText("");
        nameTxt.setText("");
        qtyTxt.setText("");
        unitpTxt.setText("");
        totalTxt.setText("");
        

        int itemNo = invtable.getRowCount();
        itemNoTxt.setText(""+itemNo);
        if(itemNoTxt.equals("0")){
            JOptionPane.showMessageDialog(this,"Please Add Items");
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void unitpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitpTxtActionPerformed

    private void itemIDTxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_itemIDTxtPropertyChange

    }//GEN-LAST:event_itemIDTxtPropertyChange

    private void itemIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIDTxtActionPerformed

    }//GEN-LAST:event_itemIDTxtActionPerformed

    private void itemIDTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemIDTxtMouseClicked
        ItemViwe a = new ItemViwe(this);
        //        DashBoard.panel.add(a);
        a.setVisible(true);
        getParent().add(a);
        a.toFront();

    }//GEN-LAST:event_itemIDTxtMouseClicked

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

//   
    private void ordernoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordernoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordernoTxtActionPerformed

    private void supidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supidTxtActionPerformed

    private void supidTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supidTxtMouseClicked
                SupplierList a = new SupplierList(this);
                a.setVisible(true);
                getParent().add(a);
                a.toFront();
    }//GEN-LAST:event_supidTxtMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        itemIDTxt.setText("");
        nameTxt.setText("");
        qtyTxt.setText("");
        unitpTxt.setText("");
        totalTxt.setText("");
    }//GEN-LAST:event_removeBtnActionPerformed

    private void supnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supnameTxtActionPerformed

    private void netTotalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netTotalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netTotalTxtActionPerformed

    private void itemNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNoTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        netTotalTxt.setText(""+0.00);
        itemNoTxt.setText(""+0.00);
        dtm.setRowCount(0);
        itemIDTxt.setText("");
        nameTxt.setText("");
        qtyTxt.setText("");
        unitpTxt.setText("");
        totalTxt.setText("");
        supidTxt.setText("");
        supnameTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void qtyTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtyTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtFocusLost

    private void qtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTxtActionPerformed
        //               // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtActionPerformed

    private void qtyTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtKeyPressed

    private void qtyTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyReleased
        // TODO add your handling code here:
        String unitp = unitpTxt.getText();
        String qty = qtyTxt.getText();
        
            if (qty.equals("")){ // if not this gives error of null string
            
            }else {
                double qtyD = Double.parseDouble(qty);// to get total
                double unitpD = Double.parseDouble(unitp);
                double totalText = (qtyD * unitpD);
                totalTxt.setText(""+totalText);
            }    
            
            if (evt.getKeyCode()== KeyEvent.VK_ENTER){
                String id = itemIDTxt.getText();
                String name = nameTxt.getText();


                double qtyD = Double.parseDouble(qty);
                double unitpD = Double.parseDouble(unitp);
                double total = qtyD * unitpD;

                int i;
                boolean found = false;
                for (i = 0; i < invtable.getRowCount(); i++) {
                    String tabID = invtable.getValueAt(i, 0).toString();
                    if (id.equals(tabID)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    double oldQty = Double.parseDouble(invtable.getValueAt(i, 2).toString());
                    double newQty = oldQty + qtyD;
                    invtable.setValueAt("" + newQty, i, 2);
                    double oldtotal = Double.parseDouble(invtable.getValueAt(i, 4).toString());
                    double newTotal = (newQty * unitpD);
                    invtable.setValueAt("" + newTotal, i, 4);
                } else {
                    dtm.addRow(new Object[]{id, name, qty, unitp, total});
                }

                try {
                    double prevTotal = Double.parseDouble(netTotalTxt.getText());
                    netTotalTxt.setText("" + (prevTotal + total));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Total Filed is empty");
                }
        
            String nettot = netTotalTxt.getText();



            itemIDTxt.setText("");
            nameTxt.setText("");
            qtyTxt.setText("");
            unitpTxt.setText("");
            totalTxt.setText("");
            supnameTxt.setText("");

            int itemNo = invtable.getRowCount();
            itemNoTxt.setText(""+itemNo);
            if(itemNoTxt.equals("0")){
                JOptionPane.showMessageDialog(this,"Please Add Items");
            }
        
        }
    }//GEN-LAST:event_qtyTxtKeyReleased

    private void qtyTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtKeyTyped
    void setItem(int itemno,String itemname){

        int ino = itemno;
        String iname = itemname;
        
        itemIDTxt.setText(""+ino);
        nameTxt.setText(iname);
        
        Connect c = new Connect();
        
        String query3 = "SELECT buying_price FROM stock_has_item WHERE item_item_code like '%"+ino+"%'" ;
        ResultSet reset3 = c.getQuery(query3);
        
        try {
            while(reset3.next()){
            
            int bpricee = reset3.getInt("buying_price");
            
            String bprice = Integer.toString(bpricee);

            unitpTxt.setText(bprice);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemViwe.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        qtyTxt.requestFocusInWindow();

// TODO add your handling code here:
    }   
//    
    
        void setSupplier (int supno, String name){
           int sno = supno;
           String sname=name;
           supidTxt.setText(""+sno);
           supnameTxt.setText(""+sname);
        }
        
        void po(){
        Connect c = new Connect();
        
        String query3 = "SELECT purchase_order_id FROM purchase_order ORDER BY purchase_order_id DESC LIMIT 1" ;
        ResultSet reset3 = c.getQuery(query3);
        
        try {
            while(reset3.next()){
            
            int id = reset3.getInt("purchase_order_id");
            
            String ids= Integer.toString((id+1));
            ordernoTxt.setText(ids);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTable invtable;
    private javax.swing.JTextField itemIDTxt;
    private javax.swing.JTextField itemNoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField netTotalTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextField ordernoTxt;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField supidTxt;
    private javax.swing.JTextField supnameTxt;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JTextField unitpTxt;
    // End of variables declaration//GEN-END:variables
}
