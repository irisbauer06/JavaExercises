/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nivennumber.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author iris06
 */
public class NivenGui extends javax.swing.JFrame
{

  /**
   * Creates new form NivenGui
   */
  public NivenGui()
  {
    initComponents();
    setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    pMain = new javax.swing.JPanel();
    progressbar = new javax.swing.JProgressBar();
    pWest = new javax.swing.JPanel();
    pNorden = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    tfNivenAnzahl = new javax.swing.JFormattedTextField();
    tfNiventrue = new javax.swing.JFormattedTextField();
    spUntergrenze = new javax.swing.JSpinner();
    spObergrenze = new javax.swing.JSpinner();
    jLabel4 = new javax.swing.JLabel();
    pSueden = new javax.swing.JPanel();
    pButton = new javax.swing.JPanel();
    btBerechnen = new javax.swing.JButton();
    btBeenden = new javax.swing.JButton();
    btLöschen = new javax.swing.JButton();
    pOst = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    listenfeld = new javax.swing.JList<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        onWindowClosing(evt);
      }
    });

    pMain.setLayout(new java.awt.BorderLayout());
    pMain.add(progressbar, java.awt.BorderLayout.SOUTH);

    pWest.setLayout(new java.awt.BorderLayout());

    pNorden.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8), javax.swing.BorderFactory.createTitledBorder("Ein -& Ausgabe")));
    java.awt.GridBagLayout pNordenLayout = new java.awt.GridBagLayout();
    pNordenLayout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
    pNordenLayout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0};
    pNorden.setLayout(pNordenLayout);

    jLabel1.setText("Obergrenze");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pNorden.add(jLabel1, gridBagConstraints);

    jLabel2.setText("Untergrenze");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pNorden.add(jLabel2, gridBagConstraints);

    jLabel3.setText("Anzahl");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pNorden.add(jLabel3, gridBagConstraints);

    tfNivenAnzahl.setEditable(false);
    tfNivenAnzahl.setColumns(10);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    pNorden.add(tfNivenAnzahl, gridBagConstraints);

    tfNiventrue.setEditable(false);
    tfNiventrue.setColumns(10);
    tfNiventrue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    pNorden.add(tfNiventrue, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pNorden.add(spUntergrenze, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pNorden.add(spObergrenze, gridBagConstraints);

    jLabel4.setText("Gefundene Nivenzahl");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pNorden.add(jLabel4, gridBagConstraints);

    pWest.add(pNorden, java.awt.BorderLayout.NORTH);

    pSueden.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8), javax.swing.BorderFactory.createTitledBorder("Buttons")));

    pButton.setLayout(new java.awt.GridLayout(0, 1));

    btBerechnen.setText("Berechnen");
    btBerechnen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onBerechnen(evt);
      }
    });
    pButton.add(btBerechnen);

    btBeenden.setText("Beenden");
    btBeenden.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onBeenden(evt);
      }
    });
    pButton.add(btBeenden);

    btLöschen.setText("Löschen");
    btLöschen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onLoeschen(evt);
      }
    });
    pButton.add(btLöschen);

    pSueden.add(pButton);

    pWest.add(pSueden, java.awt.BorderLayout.SOUTH);

    pMain.add(pWest, java.awt.BorderLayout.WEST);

    pOst.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8), javax.swing.BorderFactory.createTitledBorder("Liste der Nivennumbers")));
    pOst.setLayout(new java.awt.BorderLayout());

    jScrollPane2.setViewportView(listenfeld);

    pOst.add(jScrollPane2, java.awt.BorderLayout.CENTER);

    pMain.add(pOst, java.awt.BorderLayout.EAST);

    getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void loeschen()
  {
    
  }
  private void onBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBerechnen
  {//GEN-HEADEREND:event_onBerechnen
    // TODO add your handling code here:
  }//GEN-LAST:event_onBerechnen

  private void onBeenden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBeenden
  {//GEN-HEADEREND:event_onBeenden
    // TODO add your handling code here:
  }//GEN-LAST:event_onBeenden

  private void onLoeschen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLoeschen
  {//GEN-HEADEREND:event_onLoeschen
    // TODO add your handling code here:
  }//GEN-LAST:event_onLoeschen

  private void onWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onWindowClosing
  {//GEN-HEADEREND:event_onWindowClosing
    // TODO add your handling code here:
  }//GEN-LAST:event_onWindowClosing

  private void onX()
  {
    if (JOptionPane.showConfirmDialog(this, "Wirklich beenden?",
      "Sicherheitsabfrage",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
    dispose();
  }
  
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(NivenGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(NivenGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(NivenGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(NivenGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new NivenGui().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btBeenden;
  private javax.swing.JButton btBerechnen;
  private javax.swing.JButton btLöschen;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JList<String> listenfeld;
  private javax.swing.JPanel pButton;
  private javax.swing.JPanel pMain;
  private javax.swing.JPanel pNorden;
  private javax.swing.JPanel pOst;
  private javax.swing.JPanel pSueden;
  private javax.swing.JPanel pWest;
  private javax.swing.JProgressBar progressbar;
  private javax.swing.JSpinner spObergrenze;
  private javax.swing.JSpinner spUntergrenze;
  private javax.swing.JFormattedTextField tfNivenAnzahl;
  private javax.swing.JFormattedTextField tfNiventrue;
  // End of variables declaration//GEN-END:variables
}