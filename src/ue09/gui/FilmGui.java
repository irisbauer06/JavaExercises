package ue09.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import ue09.data.Film;
import ue09.data.Filme;

/**
 *
 * @author iris06
 */
public class FilmGui extends javax.swing.JFrame
{
  private final Filme filme = new Filme();
  private final FilmTableModel model = new FilmTableModel(filme.getFilme());

  /**
   * Creates new form FilmGui
   */
  public FilmGui()
  {
    initComponents();
    setLocationRelativeTo(null);
    tabelle.setModel(model);
    setExtendedState(JFrame.MAXIMIZED_BOTH); //maximiert öffnen
    //pack();
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
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelle = new javax.swing.JTable();
    jmenu1 = new javax.swing.JMenuBar();
    mDatei = new javax.swing.JMenu();
    miDateiladen = new javax.swing.JMenuItem();
    miSpeichern = new javax.swing.JMenuItem();
    miSeperator = new javax.swing.JPopupMenu.Separator();
    miBeenden = new javax.swing.JMenuItem();
    mFilm = new javax.swing.JMenu();
    miHinzufuegen = new javax.swing.JMenuItem();
    miLoeschen = new javax.swing.JMenuItem();
    miBearbeiten = new javax.swing.JMenuItem();
    mExtras = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Filmverwaltung V0.1");
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        onWindowClosing(evt);
      }
    });

    pMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
    pMain.setLayout(new java.awt.BorderLayout());

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
    jScrollPane1.setViewportView(tabelle);

    pMain.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

    mDatei.setText("Datei");

    miDateiladen.setText("Datei laden");
    miDateiladen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onDateiLaden(evt);
      }
    });
    mDatei.add(miDateiladen);

    miSpeichern.setText("Datei speichern");
    miSpeichern.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onDateiSpeichern(evt);
      }
    });
    mDatei.add(miSpeichern);
    mDatei.add(miSeperator);

    miBeenden.setText("Beenden");
    miBeenden.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onDateiBeenden(evt);
      }
    });
    mDatei.add(miBeenden);

    jmenu1.add(mDatei);

    mFilm.setText("Film");

    miHinzufuegen.setText("Hinzufügen");
    miHinzufuegen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onFilmHinzufuegen(evt);
      }
    });
    mFilm.add(miHinzufuegen);

    miLoeschen.setText("Löschen");
    miLoeschen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onFilmLoeschen(evt);
      }
    });
    mFilm.add(miLoeschen);

    miBearbeiten.setText("Bearbeiten");
    miBearbeiten.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onFilmBearbeiten(evt);
      }
    });
    mFilm.add(miBearbeiten);

    jmenu1.add(mFilm);

    mExtras.setText("Extras");
    jmenu1.add(mExtras);

    setJMenuBar(jmenu1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onDateiLaden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDateiLaden
  {//GEN-HEADEREND:event_onDateiLaden
    final JFileChooser chooser = new JFileChooser();
    chooser.addChoosableFileFilter(
      new FileNameExtensionFilter("Film-Dateien", "csv", "txt"));
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
    { //Wurde der Dialog mit "Übernehmen" beendet? ==> Ja
      final File file = chooser.getSelectedFile();
      try ( //Automatische Recourcenverwaltung
          final BufferedReader reader =
            new BufferedReader (
              new InputStreamReader(
                 new FileInputStream(file), "utf8"))
        )
      {
        
        filme.readFrom(reader); // Filme aus Datei lesen
        model.fireTableDataChanged(); //Tabelle aktualisieren
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(this, e.getMessage(),
          "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
      }

    }
  }//GEN-LAST:event_onDateiLaden

  private void onDateiBeenden(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDateiBeenden
  {//GEN-HEADEREND:event_onDateiBeenden
    onX();
  }//GEN-LAST:event_onDateiBeenden

  private void onWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onWindowClosing
  {//GEN-HEADEREND:event_onWindowClosing
    onX();
  }//GEN-LAST:event_onWindowClosing

  private void onFilmHinzufuegen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFilmHinzufuegen
  {//GEN-HEADEREND:event_onFilmHinzufuegen
    final FilmDialog dlg = new FilmDialog(this,true); // Dialog objekt gebaut
    dlg.setVisible(true); //Dialog sichtbar machen, modales Dialog
    
    if (dlg.pressedOK())
    {
      final Film film = dlg.getFilm(); //Dann Film abholen
      filme.add(film);
      model.fireTableRowsInserted(filme.size()-1, filme.size()-1);
    }
    
  }//GEN-LAST:event_onFilmHinzufuegen

  private void onFilmLoeschen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFilmLoeschen
  {//GEN-HEADEREND:event_onFilmLoeschen
    /*
    final int selIndex = tabelle.getSelectedRow(); //Hol Index der selektierten Zeile
    if (selIndex<0)
      JOptionPane.showMessageDialog(this, "Bitte erst eine Zeile selektieren",
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    else
      if (JOptionPane.showConfirmDialog(this, "FIlm wirklich löschen?","Sicherheitsabfrage", 
        JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
    {
      filme.remove(selIndex); //Film am selecten Index aus der Arraylist löschen
      model.fireTableRowsDeleted(selIndex, selIndex);
    }*/
    
    final int[] sel = tabelle.getSelectedRows();
    if (sel.length<1)
      JOptionPane.showMessageDialog(this, "Bitte mindestens einen Film auswählen",
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    else
      if (JOptionPane.showConfirmDialog(
        this,
        sel.length>1
          ? String.format("Wirklich %d selektierte Filme löschen?", sel.length)
          : "Selektierten Film wirklich löschen?",
        "Sicherheitsabfrage", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
      {
        for (int i=sel.length-1;i>=0;i--) //FIlme aus ArrayList löschen
          filme.remove(sel[i]);
        model.fireTableDataChanged();
      }
  }//GEN-LAST:event_onFilmLoeschen

  private void onFilmBearbeiten(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFilmBearbeiten
  {//GEN-HEADEREND:event_onFilmBearbeiten
    final int selIndex = tabelle.getSelectedRow(); //Hol Index der selektierten Zeile
    if (selIndex<0)
      JOptionPane.showMessageDialog(this, "Bitte erst einen Film selektieren",
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    else
    {
      final Film alterFilm = filme.get(selIndex);
      final FilmDialog dlg = new FilmDialog(this, true);
      dlg.setFilm(alterFilm);
      dlg.setVisible(true);
      if (dlg.pressedOK())
      {
        final Film neuerFilm = dlg.getFilm(); //Film abholen
        filme.set(selIndex,neuerFilm);
        model.fireTableRowsUpdated(selIndex,selIndex); //Tabelle aktualisieren
      }
      
    }
  }//GEN-LAST:event_onFilmBearbeiten

  private void onDateiSpeichern(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDateiSpeichern
  {//GEN-HEADEREND:event_onDateiSpeichern
   final JFileChooser chooser = new JFileChooser();
   if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
   {
     File file = chooser.getSelectedFile();
     final String path = file.getAbsolutePath();
     if (!path.toLowerCase().endsWith(".csv"));
     file = new File(path+".csv");
       try (
         final BufferedWriter writer =
           new BufferedWriter(
            new OutputStreamWriter(
             new FileOutputStream(file), "utf8")))
       {
         filme.writeTo(writer);
         JOptionPane.showMessageDialog(this, String.format
          ("%d Filme erfolgreich gespeichert", filme.size()),
           "Gespeichert", JOptionPane.ERROR_MESSAGE);
       }
       catch (Exception e)
       {
         JOptionPane.showMessageDialog(this, e.getMessage(),
           "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
       }
   }
  }//GEN-LAST:event_onDateiSpeichern

  private void onX()
  {
    if (JOptionPane.showConfirmDialog(
    this, "Wirklich beenden?", "Sicherheitsabfrage",
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
      java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new FilmGui().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenuBar jmenu1;
  private javax.swing.JMenu mDatei;
  private javax.swing.JMenu mExtras;
  private javax.swing.JMenu mFilm;
  private javax.swing.JMenuItem miBearbeiten;
  private javax.swing.JMenuItem miBeenden;
  private javax.swing.JMenuItem miDateiladen;
  private javax.swing.JMenuItem miHinzufuegen;
  private javax.swing.JMenuItem miLoeschen;
  private javax.swing.JPopupMenu.Separator miSeperator;
  private javax.swing.JMenuItem miSpeichern;
  private javax.swing.JPanel pMain;
  private javax.swing.JTable tabelle;
  // End of variables declaration//GEN-END:variables
}
