/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WareHouse_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class E_delete extends javax.swing.JFrame {
 Connection con=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
   Statement stmt = null;
    private Object s;/**
    /**
     * Creates new form Products
     */
    public E_delete(){ 
            setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        deid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(103, 589, 55, 23);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(4, 4, 64));
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(530, 210, 100, 30);
        jPanel1.add(deid);
        deid.setBounds(120, 210, 360, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Employee ID to delete the Record");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 130, 380, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Employee s= new Employee();
           s.setVisible(true);
           dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    Statement stmt = null;    
     try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection con;
         con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Ware_House;user=raheels;password=1234567;");
         stmt = con.createStatement();
  
     System.out.println("Connected to database !");
   }
   catch(SQLException sqle) {
    System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
   System.out.println("Class Not Found Exception :" + e.getMessage());
  }  
        
   if(    ((deid.getText()== null || deid.getText().isEmpty()))){
    JOptionPane.showMessageDialog(null,"Please insert Complete Information!!!!!!!!!!!!1");
       deid.setText(null);    
   }  
   else 
       
   try{
          String q = "DELETE FROM Employee where  Emp_id="+deid.getText()+"";     
          stmt.execute(q);
          
          JOptionPane.showMessageDialog(null,"Record Delete from the Dtabase");
          deid.setText(null);    
       
     
     
    }
    catch(SQLException ex) {   
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }  
                                         
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        
        
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deid;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}