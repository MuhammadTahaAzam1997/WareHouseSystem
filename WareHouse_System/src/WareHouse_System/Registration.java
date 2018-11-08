
package WareHouse_System;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class Registration extends javax.swing.JFrame {

    Connection con=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
   Statement stmt = null;
    private Object s;
    
    
    public Registration() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(null);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(34, 248, 90, 40);

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(188, 167, 120, 40);

        jLabel1.setText("username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 76, 70, 20);

        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 99, 70, 20);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1054, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(645, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Welcome s= new Welcome();
           s.setVisible(true);
           dispose();           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
    
           
    }//GEN-LAST:event_unActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    
        
        
   Statement stmt = null;    
     try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection con;
         con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=chase_up;user=raheel;password=1234567;");
         stmt = con.createStatement();
  
     System.out.println("Connected to database !");
   }
   catch(SQLException sqle) {
    System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
   System.out.println("Class Not Found Exception :" + e.getMessage());
  }  
     
     
     
     
     if(((un.getText()== null || un.getText().isEmpty())) || ((pw.getText()== null || pw.getText().isEmpty()))){
       JOptionPane.showMessageDialog(null,"Please insert Complete Information!!!!!!!!!!!!1");
       un.setText(null);
       pw.setText(null);
     }
     
     
     
     else{
               try{
          String q = "insert into login (username,password) values ('"+un.getText()+"' , '"+pw.getText()+"')";
          stmt.execute(q);
          
          JOptionPane.showMessageDialog(null,"Registration Added to the Dtabase");
          un.setText(null);
          pw.setText(null);
          
           login s= new login();
           s.setVisible(true);
           dispose(); 
           
      }
    catch(SQLException ex) {   
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }  
    }//GEN-LAST:event_saveActionPerformed

    }
    
    
    
    
    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
     
    }//GEN-LAST:event_pwActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pw;
    private javax.swing.JButton save;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
