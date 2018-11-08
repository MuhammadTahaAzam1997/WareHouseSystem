
package WareHouse_System;

import javax.swing.JFrame;

public class Welcome extends javax.swing.JFrame {

   
    public Welcome() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        suppliers = new javax.swing.JButton();
        defected = new javax.swing.JButton();
        distributers = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 4, 64));
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setToolTipText("welcome ");
        jPanel4.setName("welcome"); // NOI18N
        jPanel4.setLayout(null);

        suppliers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suppliers.setForeground(new java.awt.Color(4, 4, 64));
        suppliers.setText("supplier");
        suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersActionPerformed(evt);
            }
        });
        jPanel4.add(suppliers);
        suppliers.setBounds(100, 340, 160, 50);

        defected.setBackground(new java.awt.Color(255, 255, 255));
        defected.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        defected.setForeground(new java.awt.Color(4, 4, 64));
        defected.setText("defected");
        defected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defectedActionPerformed(evt);
            }
        });
        jPanel4.add(defected);
        defected.setBounds(100, 630, 160, 50);

        distributers.setBackground(new java.awt.Color(255, 255, 255));
        distributers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        distributers.setForeground(new java.awt.Color(4, 4, 64));
        distributers.setText("distributers");
        distributers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributersActionPerformed(evt);
            }
        });
        jPanel4.add(distributers);
        distributers.setBounds(100, 490, 160, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(4, 4, 64));
        jButton2.setText("employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(100, 70, 160, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(4, 4, 64));
        jButton3.setText("products");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(100, 200, 160, 50);

        registration.setBackground(new java.awt.Color(51, 255, 51));
        registration.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("registration");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });
        jPanel4.add(registration);
        registration.setBounds(1110, 520, 160, 50);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("signout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(1110, 610, 160, 50);

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("welcome");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(430, 20, 430, 160);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1380, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     login s= new login();
           s.setVisible(true);
           dispose(); 
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Employee s= new Employee();
           s.setVisible(true);
           dispose(); 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Products s= new Products();
           s.setVisible(true);
           dispose(); 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void defectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defectedActionPerformed
    Defected s= new Defected();
           s.setVisible(true);
           dispose();
        
    }//GEN-LAST:event_defectedActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
      Registration s= new Registration();
           s.setVisible(true);
           dispose();
    }//GEN-LAST:event_registrationActionPerformed

    private void suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersActionPerformed
 Suppliers s= new Suppliers();
           s.setVisible(true);
           dispose();
    }//GEN-LAST:event_suppliersActionPerformed

    private void distributersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributersActionPerformed
     Distributers s= new Distributers();
           s.setVisible(true);
           dispose();
    }//GEN-LAST:event_distributersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton defected;
    private javax.swing.JButton distributers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton registration;
    private javax.swing.JButton suppliers;
    // End of variables declaration//GEN-END:variables
}
