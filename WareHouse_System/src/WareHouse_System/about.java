
package WareHouse_System;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class about extends javax.swing.JFrame {

    public about() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    //    this.setUndecorated(true);   
 //    this.setAlwaysOnTop(true);
 //    this.setResizable(false);
 ///    this.setVisible(true);
     
//Toolkit tk = Toolkit.getDefaultToolkit();
//int xSize = ((int) tk.getScreenSize().getWidth());
//int ySize = ((int) tk.getScreenSize().getHeight());
//this.setSize(xSize,ySize);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setBackground(new java.awt.Color(4, 4, 63));
        jLabel1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("raheel");
        setBackground(new java.awt.Color(4, 4, 63));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        jButton1.setForeground(new java.awt.Color(4, 4, 63));
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(38, 233, 99, 38);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    login s= new login();
           s.setVisible(true);
           dispose();      
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
