/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modèle.Insertion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quenq
 */
public class Infoprof extends javax.swing.JDialog  {

    /**
     * Creates new form Ajoutprof
     */

    public Infoprof(java.awt.Frame jFrame, boolean b) {
        super(jFrame,b);
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

        jLabel1 = new javax.swing.JLabel();
        insertion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prénom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ajout élève");

        insertion.setText("Ajouter");
        insertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Nom :");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Prénom :");

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        prénom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prénomActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ECE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nom)
                            .addComponent(prénom, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertion)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prénom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(insertion)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void insertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertionActionPerformed
        String name;
        name = nom.getText();
        String surname;
        surname = prénom.getText();
        Insertion isr = new Insertion();
        try {
            isr.Insertion("INSERT INTO personne (id,nom, prénom, type) VALUES (NULL ,"+"'"+name+"'"+", "+"'"+surname+"'"+", '0')");
        } catch (SQLException e) {
            Logger.getLogger(Ajoutélève.class.getName()).log(Level.SEVERE, null, e);
        }
       
        Accueil f = new Accueil (new javax.swing.JFrame(), true);
        f.show();
        dispose();
    }//GEN-LAST:event_insertionActionPerformed

    private void prénomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prénomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prénomActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Ajoutélève.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajoutélève.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajoutélève.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajoutélève.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){ 
            public void run() {
                Ajoutélève wdw = new Ajoutélève (new javax.swing.JFrame(), true);
                wdw.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            wdw.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prénom;
    // End of variables declaration//GEN-END:variables
}
