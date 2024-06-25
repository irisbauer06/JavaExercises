package ue09.test;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author iris06
 */
public class TableTestGui
{
  public static void main(String[] args)
  {
    try
    {
      final JFrame frame = new JFrame(); //Rahmenfenster erzeugen
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      frame.setSize(800, 600); //Größe setzen
      frame.setLocationByPlatform(true); //Posotion setzen
      
      final JTable table = new JTable(); //Gui für Tabelle erzeugen
      final JScrollPane scrollPane = new JScrollPane();
      scrollPane.setViewportView(table);
      frame.getContentPane().add(scrollPane);
      
      final TestTableModel model = new TestTableModel();
      table.setModel(model);
      
      
      
      frame.setVisible(true);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
