
package WareHouse_System;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Distributers extends javax.swing.JFrame {
    
    public Distributers() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        view1 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        view = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));
        getContentPane().setLayout(null);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(29, 250, 55, 23);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        view1.setText("view");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });
        jPanel1.add(view1);
        view1.setBounds(160, 100, 80, 23);

        add1.setText("add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1);
        add1.setBounds(160, 150, 80, 23);

        delete1.setText("delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete1);
        delete1.setBounds(160, 200, 80, 23);

        update1.setText("update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel1.add(update1);
        update1.setBounds(157, 250, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 770);

        view.setText("view");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(150, 60, 70, 23);

        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(170, 120, 51, 23);

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(160, 180, 63, 23);

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(170, 250, 67, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  Welcome s= new Welcome();
           s.setVisible(true);
           dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        S_view s = null;
        try {
            s = new S_view();
        } catch (SQLException ex) {
            Logger.getLogger(Distributers.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        S_add s= new S_add();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        S_delete s= new S_delete();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        S_update s= new S_update();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        DI_view s= new DI_view();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_view1ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        DI_add s= new DI_add();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_add1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        DI_delete s= new DI_delete();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_delete1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        DI_update s= new DI_update();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_update1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Distributers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    // End of variables declaration//GEN-END:variables
}
