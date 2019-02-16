/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.Connect;
import javax.swing.JOptionPane;

/**
 *
 * @author Akbar
 */
public class AddNewSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewSupplier1
     */
    public AddNewSupplier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comnameTxt = new javax.swing.JTextField();
        agentnameTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        supaddressTxt = new javax.swing.JTextArea();
        comphnTxt = new javax.swing.JTextField();
        agentphnTxt = new javax.swing.JTextField();
        mailTxt = new javax.swing.JTextField();
        clsBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        supviwe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        a_mailTxt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comnameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comnameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(comnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 270, -1));

        agentnameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(agentnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 270, -1));

        supaddressTxt.setColumns(20);
        supaddressTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        supaddressTxt.setRows(5);
        jScrollPane1.setViewportView(supaddressTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 270, 102));

        comphnTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comphnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comphnTxtActionPerformed(evt);
            }
        });
        jPanel1.add(comphnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 270, -1));

        agentphnTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(agentphnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 270, -1));

        mailTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTxtActionPerformed(evt);
            }
        });
        jPanel1.add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 270, -1));

        clsBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clsBtn.setText("Clear All");
        clsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 130, 40));

        okBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        okBtn.setText("Save");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel1.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 130, 40));

        supviwe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        supviwe.setText("Supplier View");
        supviwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supviweActionPerformed(evt);
            }
        });
        jPanel1.add(supviwe, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 130, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Agent name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Agent Phone");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, 150));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Company details");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Agent details");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Company name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Company Phone");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Email");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(35, 35, 35))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 250));

        a_mailTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a_mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_mailTxtActionPerformed(evt);
            }
        });
        jPanel1.add(a_mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 270, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 280));

        jPanel3.setBackground(new java.awt.Color(17, 153, 148));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("New Supplier");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comnameTxtActionPerformed

    private void comphnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comphnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comphnTxtActionPerformed

    private void mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTxtActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        String cname= comnameTxt.getText().trim();
        String address= supaddressTxt.getText().trim();
        String ctel=comphnTxt.getText().trim();
        String cmail=mailTxt.getText().trim();

        String aname= agentnameTxt.getText().trim();
        String atel=agentphnTxt.getText().trim();
        String a_mail=a_mailTxt.getText().trim();

        if(cname.equals("")||aname.equals("")||address.equals("")||ctel.equals("")||atel.equals(""))
        {JOptionPane.showMessageDialog(this,"Please fill required fields");
        }else if(ctel.length()!=10){
            JOptionPane.showMessageDialog(this,"Company phone number is not valid");
        }else if(atel.length()!=10){
            JOptionPane.showMessageDialog(this,"Agent phone number is not valid");
        }
        else{
            Connect c =new Connect();
            String query = "INSERT INTO supplier ( supplier_name, sup_add, sup_phn, sup_mail, agnt_name,  agnt_phn, agnt_mail)VALUES ("
            + "'" + cname + "'" + ","
            + "'" + address + "'" + "," 
            +  ctel + ","        
            + "'" + cmail + "'"+ ","
                    
            + "'" + aname + "'" + ","
            + "'" + atel + "'" + ","
            + "'" + a_mail + "'"
            + ")";
            
            c.setQuery(query,"");
            JOptionPane.showMessageDialog(this,"Supplier Added");
            comnameTxt.setText("");
            agentnameTxt.setText("");
            supaddressTxt.setText("");
            comphnTxt.setText("");
            agentphnTxt.setText("");
            mailTxt.setText("");
            a_mailTxt.setText("");

        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void supviweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supviweActionPerformed
//         TODO add your handling code here:
        SupplierList a= new SupplierList();
        getParent().add(a);
        a.setVisible(true);
    }//GEN-LAST:event_supviweActionPerformed

    private void clsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsBtnActionPerformed
            comnameTxt.setText("");
            agentnameTxt.setText("");
            supaddressTxt.setText("");
            comphnTxt.setText("");
            agentphnTxt.setText("");
            mailTxt.setText(""); 
            a_mailTxt.setText("");        // TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_clsBtnActionPerformed

    private void a_mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_mailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_mailTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_mailTxt;
    private javax.swing.JTextField agentnameTxt;
    private javax.swing.JTextField agentphnTxt;
    private javax.swing.JButton clsBtn;
    private javax.swing.JTextField comnameTxt;
    private javax.swing.JTextField comphnTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextArea supaddressTxt;
    private javax.swing.JButton supviwe;
    // End of variables declaration//GEN-END:variables
}
