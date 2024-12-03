/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ue11.gui;

import java.io.*;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import ue11.calc.WetterRechner;
import ue11.data.*;

/**
 *
 * @author leonb
 */
public class WetterGUI extends javax.swing.JFrame
{

  
  /**
   * Creates new form WetterGUI
   */
  
  // Datenelemente
  private final Messungen messungen = new Messungen();
  private final MessungTableModel model = new MessungTableModel(messungen.getMessungen());
  
  public WetterGUI()
  {
    initComponents();
    tabelle.setModel(model);
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

    pMain = new javax.swing.JPanel();
    pSouth = new javax.swing.JPanel();
    btHinzufuegen = new javax.swing.JButton();
    btBerechne = new javax.swing.JButton();
    btBeenden = new javax.swing.JButton();
    btSpeichern = new javax.swing.JButton();
    btLaden = new javax.swing.JButton();
    pCenter = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tabelle = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Wetterprotokoll");
    setLocationByPlatform(true);
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        onWindowsClosing(evt);
      }
    });

    pMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
    pMain.setLayout(new java.awt.BorderLayout());

    pSouth.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Befehle"), javax.swing.BorderFactory.createEmptyBorder(8, 20, 8, 20)));
    pSouth.setLayout(new java.awt.GridLayout(2, 3, 8, 0));

    btHinzufuegen.setText("Hinzufügen");
    btHinzufuegen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onHinzufuegen(evt);
      }
    });
    pSouth.add(btHinzufuegen);

    btBerechne.setText("Berechnen");
    btBerechne.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onBerechnen(evt);
      }
    });
    pSouth.add(btBerechne);

    btBeenden.setText("Beenden");
    btBeenden.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onBeenden(evt);
      }
    });
    pSouth.add(btBeenden);

    btSpeichern.setText("Speichern");
    btSpeichern.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onSpeichern(evt);
      }
    });
    pSouth.add(btSpeichern);

    btLaden.setText("Laden");
    btLaden.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onLaden(evt);
      }
    });
    pSouth.add(btLaden);

    pMain.add(pSouth, java.awt.BorderLayout.PAGE_END);

    pCenter.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Messungen"), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    pCenter.setLayout(new java.awt.BorderLayout());

    tabelle.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane2.setViewportView(tabelle);

    pCenter.add(jScrollPane2, java.awt.BorderLayout.CENTER);

    pMain.add(pCenter, java.awt.BorderLayout.CENTER);

    getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onHinzufuegen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onHinzufuegen
  {//GEN-HEADEREND:event_onHinzufuegen
    final WetterDialog dlg = new WetterDialog(this, true);  // Dialog-Objekt gebaut
    dlg.setVisible(true);
    
    if(dlg.pressedOk())
    {
      final Messung messung = dlg.getErzeugung();
      messungen.add(messung);
      model.fireTableRowsInserted(messungen.size()-1, messungen.size()-1);
    }
  }//GEN-LAST:event_onHinzufuegen

  private void onBerechnen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBerechnen
  {//GEN-HEADEREND:event_onBerechnen
    try
    {
      final WetterRechner rechner = new WetterRechner(messungen.getMessungen());
      
      
      
      JOptionPane.showMessageDialog(this,
        String.format("Durchschnittstemperatur: %.1f\n Durchschnittliche Feuchtigkeit: %.1f\n Durchschnittlicher Druck: %.1f",
          rechner.getTemperatur(), rechner.getFeuchte(), rechner.getDruck()), 
        "Auswertung" , JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
    
    
  }//GEN-LAST:event_onBerechnen

  private void onBeenden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBeenden
  {//GEN-HEADEREND:event_onBeenden
    guiBeenden();
  }//GEN-LAST:event_onBeenden

  private void onWindowsClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onWindowsClosing
  {//GEN-HEADEREND:event_onWindowsClosing
    guiBeenden();
  }//GEN-LAST:event_onWindowsClosing

  private void onSpeichern(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSpeichern
  {//GEN-HEADEREND:event_onSpeichern
    final JFileChooser chooser = new JFileChooser();
    if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
    {
      File file = chooser.getSelectedFile();
      final String path = file.getAbsolutePath();
      if(!path.toLowerCase().endsWith(".csv")) 
        file = new File(path+".csv");
      
      try (     
          final BufferedWriter writer = 
            new BufferedWriter(
              new OutputStreamWriter(
                new FileOutputStream(file), "utf8")))
      {
        messungen.writeTo(writer);
        JOptionPane.showMessageDialog(this, String.format("%d Filme erfolgreich gespeichert!", messungen.size()),
          "Information", JOptionPane.INFORMATION_MESSAGE);
      }
      catch (Exception ex)
      {
        JOptionPane.showMessageDialog(this, ex.getMessage(),
          "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_onSpeichern

  private void onLaden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLaden
  {//GEN-HEADEREND:event_onLaden
    final JFileChooser chooser = new JFileChooser();  // Objekt für Dateidialog erstellen
    chooser.addChoosableFileFilter(
      new FileNameExtensionFilter("Messungen-Dateien", "csv", "txt"));
    chooser.setAcceptAllFileFilterUsed(false);  // Man kann nur mehr CSV oder txt Dateien auswählen
    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)  // Dialog MODAL zeigen
    {
      final File file = chooser.getSelectedFile();
      try(
        final BufferedReader reader = 
          new BufferedReader(
            new InputStreamReader(
              new FileInputStream(file), "utf8"))
        )
      {
        messungen.readFrom(reader);   // Filme aus Datei lesen
        System.out.println(messungen.getMessungen());
        model.fireTableDataChanged(); // Tabelle aktualisieren
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, ex.getMessage(),
          "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_onLaden

  private void guiBeenden()
  {
    if(JOptionPane.showConfirmDialog(this, 
      "Wirklich beenden?", "Sicherheitsabfrage", 
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
      java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new WetterGUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btBeenden;
  private javax.swing.JButton btBerechne;
  private javax.swing.JButton btHinzufuegen;
  private javax.swing.JButton btLaden;
  private javax.swing.JButton btSpeichern;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JPanel pCenter;
  private javax.swing.JPanel pMain;
  private javax.swing.JPanel pSouth;
  private javax.swing.JTable tabelle;
  // End of variables declaration//GEN-END:variables
}