/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.awt.Frame;
import java.sql.*;
import javax.swing.*;
public class Remove_Librarian extends javax.swing.JFrame {

    /**
     * Creates new form Remove_Librarian
     */
    public Remove_Librarian() {
        initComponents();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(Remove_Librarian.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER LIBRARIAN ID OR LIBRARIAN NAME TO DELETE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 129, 954, 42);
        getContentPane().add(t1);
        t1.setBounds(251, 244, 901, 44);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\del.jpg")); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(438, 414, 200, 55);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Icon 1\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(898, 414, 200, 55);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\25.chair-with-books-background-bookshelves-library-background_105428-3837.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -70, 1390, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String input=t1.getText();
    String query="delete from librarian where librarian_id='"+input+"' or name='"+input+"';";
try
{
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "Sriram@123");
  Statement stm=conn.createStatement();// TODO add your handling code here:
  int rows=stm.executeUpdate(query);
  if(rows>0)
  {
      JOptionPane.showMessageDialog(this,"Librarian removed from library");
      //this.dispose();
  }
  else
      JOptionPane.showMessageDialog(this,"No such librarian present");
  stm.close();
    }//GEN-LAST:event_jButton1ActionPerformed
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Remove_Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_Librarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
