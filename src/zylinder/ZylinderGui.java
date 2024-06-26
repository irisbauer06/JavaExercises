package zylinder;

import javax.swing.JOptionPane;

/**
 *
 * @author iris06
 */
public class ZylinderGui extends javax.swing.JFrame
{

  /**
   * Creates new form ZylinderGui
   */
  public ZylinderGui()
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

    jScrollPane1 = new javax.swing.JScrollPane();
    pMain = new javax.swing.JPanel();
    pButtons = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    btVolumen = new javax.swing.JButton();
    btOberflaeche = new javax.swing.JButton();
    btGrundflaeche = new javax.swing.JButton();
    btMantel = new javax.swing.JButton();
    btDurchmesser = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    pContent = new javax.swing.JPanel();
    pEingang = new javax.swing.JPanel();
    lRadius = new javax.swing.JLabel();
    lHoehe = new javax.swing.JLabel();
    ftfRadius = new javax.swing.JFormattedTextField();
    ftfHoehe = new javax.swing.JFormattedTextField();
    pAusgang = new javax.swing.JPanel();
    lVolumen = new javax.swing.JLabel();
    lOberflaeche = new javax.swing.JLabel();
    lGrundflaeche = new javax.swing.JLabel();
    lMantel = new javax.swing.JLabel();
    ftfVolumen = new javax.swing.JFormattedTextField();
    ftfOberflaeche = new javax.swing.JFormattedTextField();
    ftfGrundflaeche = new javax.swing.JFormattedTextField();
    ftfMantel = new javax.swing.JFormattedTextField();
    ftfDurchmesser = new javax.swing.JFormattedTextField();
    lDurchmesser = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Zylinder Rechner");
    setLocationByPlatform(true);
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        onWindowClosing(evt);
      }
    });

    pMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
    pMain.setLayout(new java.awt.BorderLayout(0, 5));

    jPanel1.setLayout(new java.awt.GridLayout(2, 3, 8, 8));

    btVolumen.setText("Volumen");
    btVolumen.setActionCommand("");
    btVolumen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onVolumenBerechnen(evt);
      }
    });
    jPanel1.add(btVolumen);

    btOberflaeche.setText("Oberfläche");
    btOberflaeche.setActionCommand("");
    btOberflaeche.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onOberflaecheBerechnen(evt);
      }
    });
    jPanel1.add(btOberflaeche);

    btGrundflaeche.setText("Grundfäche");
    btGrundflaeche.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onGrundflaecheBerechnen(evt);
      }
    });
    jPanel1.add(btGrundflaeche);

    btMantel.setText("Mantel");
    btMantel.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onMantelBerechnen(evt);
      }
    });
    jPanel1.add(btMantel);

    btDurchmesser.setText("Durchmesser");
    btDurchmesser.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onDurchmesserBerechnen(evt);
      }
    });
    jPanel1.add(btDurchmesser);

    jButton1.setText("Beenden");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onBeenden(evt);
      }
    });
    jPanel1.add(jButton1);

    pButtons.add(jPanel1);

    pMain.add(pButtons, java.awt.BorderLayout.PAGE_END);

    pContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
    pContent.setLayout(new java.awt.GridLayout(2, 2));

    pEingang.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Eingangsgrößen"), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    java.awt.GridBagLayout pEingangLayout = new java.awt.GridBagLayout();
    pEingangLayout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0};
    pEingangLayout.rowHeights = new int[] {0, 8, 0};
    pEingang.setLayout(pEingangLayout);

    lRadius.setText("Radius in m");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pEingang.add(lRadius, gridBagConstraints);

    lHoehe.setText("Höhe in m");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pEingang.add(lHoehe, gridBagConstraints);

    ftfRadius.setColumns(10);
    ftfRadius.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfRadius.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    pEingang.add(ftfRadius, gridBagConstraints);

    ftfHoehe.setColumns(10);
    ftfHoehe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfHoehe.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    pEingang.add(ftfHoehe, gridBagConstraints);

    pContent.add(pEingang);

    pAusgang.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Ausgangsgrößen"), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    java.awt.GridBagLayout pAusgangLayout = new java.awt.GridBagLayout();
    pAusgangLayout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
    pAusgangLayout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
    pAusgang.setLayout(pAusgangLayout);

    lVolumen.setText("Volumen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pAusgang.add(lVolumen, gridBagConstraints);

    lOberflaeche.setText("Oberfläche");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pAusgang.add(lOberflaeche, gridBagConstraints);

    lGrundflaeche.setText("           Grundfläche");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pAusgang.add(lGrundflaeche, gridBagConstraints);

    lMantel.setText("Mantel");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pAusgang.add(lMantel, gridBagConstraints);

    ftfVolumen.setEditable(false);
    ftfVolumen.setColumns(10);
    ftfVolumen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfVolumen.setFocusable(false);
    ftfVolumen.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    pAusgang.add(ftfVolumen, gridBagConstraints);

    ftfOberflaeche.setEditable(false);
    ftfOberflaeche.setColumns(10);
    ftfOberflaeche.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfOberflaeche.setFocusable(false);
    ftfOberflaeche.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    pAusgang.add(ftfOberflaeche, gridBagConstraints);

    ftfGrundflaeche.setEditable(false);
    ftfGrundflaeche.setColumns(10);
    ftfGrundflaeche.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfGrundflaeche.setFocusable(false);
    ftfGrundflaeche.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    pAusgang.add(ftfGrundflaeche, gridBagConstraints);

    ftfMantel.setEditable(false);
    ftfMantel.setColumns(10);
    ftfMantel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfMantel.setFocusable(false);
    ftfMantel.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    pAusgang.add(ftfMantel, gridBagConstraints);

    ftfDurchmesser.setEditable(false);
    ftfDurchmesser.setColumns(10);
    ftfDurchmesser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
    ftfDurchmesser.setFocusable(false);
    ftfDurchmesser.setValue(0.0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    pAusgang.add(ftfDurchmesser, gridBagConstraints);

    lDurchmesser.setText("Durchmesser");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pAusgang.add(lDurchmesser, gridBagConstraints);

    jLabel8.setText("m³");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    pAusgang.add(jLabel8, gridBagConstraints);

    jLabel9.setText("m²");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    pAusgang.add(jLabel9, gridBagConstraints);

    jLabel10.setText("m²");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    pAusgang.add(jLabel10, gridBagConstraints);

    jLabel11.setText("m");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    pAusgang.add(jLabel11, gridBagConstraints);

    jLabel12.setText("m");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    pAusgang.add(jLabel12, gridBagConstraints);

    pContent.add(pAusgang);

    pMain.add(pContent, java.awt.BorderLayout.CENTER);

    jScrollPane1.setViewportView(pMain);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  private void onOberflaecheBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onOberflaecheBerechnen
  {//GEN-HEADEREND:event_onOberflaecheBerechnen
    try
    {
      double h = ((Number) ftfHoehe.getValue()).doubleValue();
      double r = ((Number) ftfRadius.getValue()).doubleValue();

      final ZylinderRechner rechner = new ZylinderRechner(h, r);

      ftfOberflaeche.setValue(rechner.getO());

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }

  }//GEN-LAST:event_onOberflaecheBerechnen

  private void onVolumenBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onVolumenBerechnen
  {//GEN-HEADEREND:event_onVolumenBerechnen
    try
    {
      double h = ((Number) ftfHoehe.getValue()).doubleValue();
      double r = ((Number) ftfRadius.getValue()).doubleValue();

      final ZylinderRechner rechner = new ZylinderRechner(h, r);

      ftfVolumen.setValue(rechner.getV());

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_onVolumenBerechnen

  private void onGrundflaecheBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onGrundflaecheBerechnen
  {//GEN-HEADEREND:event_onGrundflaecheBerechnen
    try
    {
      double h = ((Number) ftfHoehe.getValue()).doubleValue();
      double r = ((Number) ftfRadius.getValue()).doubleValue();

      final ZylinderRechner rechner = new ZylinderRechner(h, r);

      ftfGrundflaeche.setValue(rechner.getG());

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_onGrundflaecheBerechnen

  private void onMantelBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onMantelBerechnen
  {//GEN-HEADEREND:event_onMantelBerechnen
    try
    {
      double h = ((Number) ftfHoehe.getValue()).doubleValue();
      double r = ((Number) ftfRadius.getValue()).doubleValue();

      final ZylinderRechner rechner = new ZylinderRechner(h, r);

      ftfMantel.setValue(rechner.getM());

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_onMantelBerechnen

  private void onDurchmesserBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDurchmesserBerechnen
  {//GEN-HEADEREND:event_onDurchmesserBerechnen
    try
    {
      double h = ((Number) ftfHoehe.getValue()).doubleValue();
      double r = ((Number) ftfRadius.getValue()).doubleValue();

      final ZylinderRechner rechner = new ZylinderRechner(h, r);

      ftfDurchmesser.setValue(rechner.getD());

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_onDurchmesserBerechnen

  private void onWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onWindowClosing
  {//GEN-HEADEREND:event_onWindowClosing
    onX();
  }//GEN-LAST:event_onWindowClosing

  private void onBeenden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBeenden
  {//GEN-HEADEREND:event_onBeenden
    onX();
  }//GEN-LAST:event_onBeenden
  private void onX()
  {
    if (JOptionPane.showConfirmDialog(this, "Wirklich beenden?", "Sicherheitsabfrage",
      JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
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
      java.util.logging.Logger.getLogger(ZylinderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(ZylinderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(ZylinderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(ZylinderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new ZylinderGui().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btDurchmesser;
  private javax.swing.JButton btGrundflaeche;
  private javax.swing.JButton btMantel;
  private javax.swing.JButton btOberflaeche;
  private javax.swing.JButton btVolumen;
  private javax.swing.JFormattedTextField ftfDurchmesser;
  private javax.swing.JFormattedTextField ftfGrundflaeche;
  private javax.swing.JFormattedTextField ftfHoehe;
  private javax.swing.JFormattedTextField ftfMantel;
  private javax.swing.JFormattedTextField ftfOberflaeche;
  private javax.swing.JFormattedTextField ftfRadius;
  private javax.swing.JFormattedTextField ftfVolumen;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lDurchmesser;
  private javax.swing.JLabel lGrundflaeche;
  private javax.swing.JLabel lHoehe;
  private javax.swing.JLabel lMantel;
  private javax.swing.JLabel lOberflaeche;
  private javax.swing.JLabel lRadius;
  private javax.swing.JLabel lVolumen;
  private javax.swing.JPanel pAusgang;
  private javax.swing.JPanel pButtons;
  private javax.swing.JPanel pContent;
  private javax.swing.JPanel pEingang;
  private javax.swing.JPanel pMain;
  // End of variables declaration//GEN-END:variables
}
