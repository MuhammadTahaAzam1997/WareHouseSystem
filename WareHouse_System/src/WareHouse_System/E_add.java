

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
public class E_add extends javax.swing.JFrame {

     Connection con=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
   Statement stmt = null;
    private Object s;/**
     * Creates new form Products
     */
    public E_add(){ 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comission = new javax.swing.JTextField();
        ha = new javax.swing.JTextField();
        mn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dn = new javax.swing.JTextField();
        bd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mon = new javax.swing.JTextField();
        sa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jd = new javax.swing.JTextField();
        ci = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        co = new javax.swing.JTextField();
        en = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        bs = new javax.swing.JTextField();
        os = new javax.swing.JTextField();
        exd = new javax.swing.JTextField();
        add = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emergencg number");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 480, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("commission");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(790, 210, 94, 31);

        comission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comissionActionPerformed(evt);
            }
        });
        jPanel1.add(comission);
        comission.setBounds(890, 210, 180, 30);

        ha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haActionPerformed(evt);
            }
        });
        jPanel1.add(ha);
        ha.setBounds(190, 280, 450, 30);

        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });
        jPanel1.add(mn);
        mn.setBounds(380, 80, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 80, 94, 31);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn);
        fn.setBounds(190, 80, 180, 30);

        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });
        jPanel1.add(eid);
        eid.setBounds(190, 40, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dept_No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 120, 94, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Birthday");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 160, 94, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Joinning date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 200, 94, 31);

        dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnActionPerformed(evt);
            }
        });
        jPanel1.add(dn);
        dn.setBounds(190, 120, 180, 30);

        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });
        jPanel1.add(bd);
        bd.setBounds(190, 160, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Street Address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 240, 120, 31);

        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        jPanel1.add(mon);
        mon.setBounds(190, 440, 180, 30);

        sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saActionPerformed(evt);
            }
        });
        jPanel1.add(sa);
        sa.setBounds(190, 240, 450, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("House Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 280, 110, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 320, 94, 31);

        jd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdActionPerformed(evt);
            }
        });
        jPanel1.add(jd);
        jd.setBounds(190, 200, 180, 30);

        ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciActionPerformed(evt);
            }
        });
        jPanel1.add(ci);
        ci.setBounds(190, 320, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 360, 94, 31);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone number");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 400, 120, 31);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mobile number");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(80, 440, 120, 31);

        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });
        jPanel1.add(co);
        co.setBounds(190, 360, 180, 30);

        en.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enActionPerformed(evt);
            }
        });
        jPanel1.add(en);
        en.setBounds(190, 480, 180, 30);

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        jPanel1.add(pn);
        pn.setBounds(190, 400, 180, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Emp_ID");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 40, 94, 31);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("basic salary");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(790, 90, 94, 31);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("overtime salary");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(780, 130, 120, 31);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("extra day");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(790, 170, 94, 31);

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln);
        ln.setBounds(570, 80, 180, 30);

        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });
        jPanel1.add(bs);
        bs.setBounds(890, 90, 180, 30);

        os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osActionPerformed(evt);
            }
        });
        jPanel1.add(os);
        os.setBounds(890, 130, 180, 30);

        exd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exdActionPerformed(evt);
            }
        });
        jPanel1.add(exd);
        exd.setBounds(890, 170, 180, 30);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(4, 4, 64));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(960, 320, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Employee s= new Employee();
           s.setVisible(true);
           dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comissionActionPerformed

    private void haActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_haActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

    private void dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void saActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saActionPerformed

    private void jdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdActionPerformed

    private void ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsActionPerformed

    private void osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_osActionPerformed

    private void exdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exdActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        
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
     
     
     
     
     if(    ((eid.getText()== null || eid.getText().isEmpty()))
      || ((fn.getText()== null || fn.getText().isEmpty()))
     || ((mn.getText()== null || mn.getText().isEmpty()))
     || ((ln.getText()== null || ln.getText().isEmpty()))
     || ((dn.getText()== null || dn.getText().isEmpty()))
     || ((bd.getText()== null || bd.getText().isEmpty()))
     || ((jd.getText()== null || jd.getText().isEmpty()))
     || ((sa.getText()== null || sa.getText().isEmpty()))
     || ((ha.getText()== null || ha.getText().isEmpty()))
     || ((ci.getText()== null || ci.getText().isEmpty()))
     || ((co.getText()== null || co.getText().isEmpty()))
     || ((pn.getText()== null || pn.getText().isEmpty()))
     || ((mon.getText()== null || mon.getText().isEmpty()))
     || ((en.getText()== null || en.getText().isEmpty()))
     || ((bs.getText()== null || bs.getText().isEmpty()))
     || ((os.getText()== null || os.getText().isEmpty()))
     || ((exd.getText()== null || exd.getText().isEmpty()))
      || ((comission.getText()== null || comission.getText().isEmpty()))
             
             )     
     
     
     
     
     
     
     {
       JOptionPane.showMessageDialog(null,"Please insert Complete Information!!!!!!!!!!!!1");
 
     }
     
     
     
     else {
               try{
          String q = "insert into Employee (Emp_ID,first_Name,Middle_Name,last_name,Dept_id,Date_0f_Birth,joining_date,street_Address,House_address,city,Country,Phone_no,Mobile_no,Emergency_no,basic_salary,overtime_salary,extra_days,commission) values ('"+eid.getText()+"' , '"+fn.getText()+"', '"+mn.getText()+"', '"+ln.getText()+"', '"+dn.getText()+"', '"+bd.getText()+"', '"+jd.getText()+"', '"+sa.getText()+"', '"+ha.getText()+"', '"+ci.getText()+"', '"+co.getText()+"', '"+pn.getText()+"', '"+mon.getText()+"', '"+en.getText()+"', '"+bs.getText()+"', '"+os.getText()+"', '"+exd.getText()+"','"+comission.getText()+"')";
          stmt.execute(q);
          
          JOptionPane.showMessageDialog(null,"Registration Added to the Dtabase");
          eid.setText(null);
       fn.setText(null);
     mn.setText(null);
  ln.setText(null);
  dn.setText(null);
  bd.setText(null);
  jd.setText(null);
  sa.setText(null);
  ha.setText(null);
 ci.setText(null);
   co.setText(null);
 pn.setText(null);
  mon.setText(null);
  en.setText(null);
     bs.setText(null);
     os.setText(null);
   exd.setText(null);
   comission.setText(null);
         
           
      }
    catch(SQLException ex) {   
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }  
    }                                    
    
    
    
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(E_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField bd;
    private javax.swing.JTextField bs;
    private javax.swing.JTextField ci;
    private javax.swing.JTextField co;
    private javax.swing.JTextField comission;
    private javax.swing.JTextField dn;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField en;
    private javax.swing.JTextField exd;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField ha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jd;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mn;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField os;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField sa;
    // End of variables declaration//GEN-END:variables
}
