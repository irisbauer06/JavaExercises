package ue09.gui;

import javax.swing.JOptionPane;
import ue09.data.Film;

/**
 *
 * @author iris06
 */
public class FilmDialog extends javax.swing.JDialog
{
  private Film film = null;
  
  public Film getFilm()
  {
    return film;
  }
  
  private boolean pressedOK = false;

  public boolean pressedOK()
  {
    return pressedOK;
  }
  
  
  /**
   * Creates new form FilmDialog
   */
  public FilmDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(parent);
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

    jScrollPane1 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();
    pSouth = new javax.swing.JPanel();
    pButton = new javax.swing.JPanel();
    btUebernehmen = new javax.swing.JButton();
    btAbbrechen = new javax.swing.JButton();
    pContent = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Hinzufügen/Bearbeiten Film");

    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
    jPanel1.setLayout(new java.awt.BorderLayout());

    pButton.setLayout(new java.awt.GridLayout());

    btUebernehmen.setText("Übernehmen");
    btUebernehmen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onOK(evt);
      }
    });
    pButton.add(btUebernehmen);

    btAbbrechen.setText("Abbrechen");
    btAbbrechen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onCancel(evt);
      }
    });
    pButton.add(btAbbrechen);

    pSouth.add(pButton);

    jPanel1.add(pSouth, java.awt.BorderLayout.SOUTH);

    pContent.setLayout(new java.awt.GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel1.setText("X");
    pContent.add(jLabel1, new java.awt.GridBagConstraints());

    jPanel1.add(pContent, java.awt.BorderLayout.CENTER);

    jScrollPane1.setViewportView(jPanel1);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private Film createFilm()
    throws Exception
  {
    //return new Film(...)
    return null;
  }
  private void onOK(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onOK
  {//GEN-HEADEREND:event_onOK
    try
    {
      film = createFilm();
      pressedOK = true;
      dispose();
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(),
        "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
    
  }//GEN-LAST:event_onOK

  private void onCancel(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onCancel
  {//GEN-HEADEREND:event_onCancel
    dispose();
  }//GEN-LAST:event_onCancel

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
      java.util.logging.Logger.getLogger(FilmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(FilmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(FilmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(FilmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        FilmDialog dialog = new FilmDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btAbbrechen;
  private javax.swing.JButton btUebernehmen;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel pButton;
  private javax.swing.JPanel pContent;
  private javax.swing.JPanel pSouth;
  // End of variables declaration//GEN-END:variables
}
