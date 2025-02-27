/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author hillv
 */
public class RegNyUtrustning extends javax.swing.JFrame {

      private InfDB idb;
      private String Tidigare;
    /**
     * Creates new form RegNyUtrustning
     */
    
    public RegNyUtrustning() {
        initComponents();

        // Försök att skapa en anslutning till databasen
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }
    
    public RegNyUtrustning(String Tidigare) {
        initComponents();
        this.Tidigare = Tidigare;
        // Försök att skapa en anslutning till databasen
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
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
        txtNamn = new javax.swing.JTextField();
        cbtnUtrustning = new javax.swing.JComboBox<>();
        lbTypUtrustning = new javax.swing.JLabel();
        txtUtrustningInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistera = new javax.swing.JButton();
        btnTillbaka2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Namn:");

        cbtnUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Teknink", "Kommunikation" }));
        cbtnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnUtrustningActionPerformed(evt);
            }
        });

        lbTypUtrustning.setText("Kaliber:");

        jLabel2.setText("Typ av Utrustning:");

        btnRegistera.setText("Registera");
        btnRegistera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisteraActionPerformed(evt);
            }
        });

        btnTillbaka2.setText("Tillbaka");
        btnTillbaka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbaka2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUtrustningInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbtnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTypUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistera)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTillbaka2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka2)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbtnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbTypUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUtrustningInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnRegistera)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbtnUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnUtrustningActionPerformed
        String typUtrustning = (String) cbtnUtrustning.getSelectedItem();
        if("Vapen".equals(typUtrustning)){
            lbTypUtrustning.setText("Kaliber:");
        }
        if("Kommunikation".equals(typUtrustning)){
            lbTypUtrustning.setText("Overforingsteknik:");
        }
        else{
            lbTypUtrustning.setText("Källa:");
        }
    }//GEN-LAST:event_cbtnUtrustningActionPerformed

    private void btnRegisteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisteraActionPerformed
        if(Inmatningsvalidering.textValidering(txtNamn) && Inmatningsvalidering.textValidering(txtUtrustningInfo)){
            try{
              String namn = txtNamn.getText();
              String typUtrustning = (String) cbtnUtrustning.getSelectedItem();
              String infoUtrustning = txtUtrustningInfo.getText();
              //sql frågan tar fram ett nytt id som är ett högre än det högsta vi har nu
              String fragaUtrustningID = "SELECT COALESCE(MAX(Utrustnings_ID), 0) + 1 AS NextUtrustningsID FROM Utrustning";
              String utrustningsIDResult = idb.fetchSingle(fragaUtrustningID);
              int utrustningsID = (utrustningsIDResult != null) ? Integer.parseInt(utrustningsIDResult) : 1;

              String fragaRegistreraUtrustning = "INSERT INTO Utrustning (Utrustnings_ID, Benamning) VALUES "
                                         + "('" + utrustningsID + "', '" + namn + "')";
              idb.insert(fragaRegistreraUtrustning);
              //Kollar vilken typ av utrustning man vill registrera samt registrerar den i databasen
              if("Vapen".equals(typUtrustning)){
                  int infoVapen = Integer.parseInt(infoUtrustning);
                  String fragaVapen = "INSERT INTO Vapen (Utrustnings_ID, Kaliber) VALUES "
                                         + "('" + utrustningsID + "', '" + infoVapen + "')";
                  idb.insert(fragaVapen);
              } 
              if("Kommunikation".equals(typUtrustning)){
                  String fragaKommuniktion = "INSERT INTO Kommunikation (Utrustnings_ID, Overforingsteknik) VALUES "
                           + "('" + utrustningsID + "', '" + infoUtrustning + "')";
                  idb.insert(fragaKommuniktion);
              } 
              else{
                String fragaTeknik = "INSERT INTO Teknik (Utrustnings_ID, Kraftkalla) VALUES "
                           + "('" + utrustningsID + "', '" + infoUtrustning + "')";
                  idb.insert(fragaTeknik);
              }
              JOptionPane.showMessageDialog(null, "Utrustning registrerad");
              



           }
            catch (InfException ex) {
                // Visa felmeddelande om något går fel med databasen
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnRegisteraActionPerformed
    }
    private void btnTillbaka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbaka2ActionPerformed
        // TODO add your handling code here:
        
        if(Tidigare.equals("ADMIN")){
            EfterInloggAdmin nytt = new EfterInloggAdmin();
            RegNyUtrustning.this.setVisible(false);
            nytt.setVisible(true);
        }
        else{
            EfterInlogg nytt = new EfterInlogg();
            RegNyUtrustning.this.setVisible(false);
            nytt.setVisible(true);
        }
    }//GEN-LAST:event_btnTillbaka2ActionPerformed
    
    
    
      
      
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
            java.util.logging.Logger.getLogger(RegNyUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegNyUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegNyUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegNyUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegNyUtrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistera;
    private javax.swing.JButton btnTillbaka2;
    private javax.swing.JComboBox<String> cbtnUtrustning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbTypUtrustning;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtUtrustningInfo;
    // End of variables declaration//GEN-END:variables
}
