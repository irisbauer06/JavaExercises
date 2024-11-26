/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ue11.gui;

import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ue11.data.*;

/**
 * TabelModel
 * @author leonb
 */
public class MessungTableModel extends AbstractTableModel // WICHTIG!!!
{
  private final static String[] colName = 
  {
    "Datum", "Messwert", "Einheit", "Sensor"
  };
  
  // Datenelemente
  private final List<Messung> messungen;
  
  // Konstruktor
  public MessungTableModel(List<Messung> messungen)
  {
    this.messungen = messungen;
  }

  // Override Methods
  @Override
  public String getColumnName(int column)
  {
    return colName[column];
  }
 
  @Override
  public int getRowCount()
  {
    return messungen.size();
  }

  @Override
  public int getColumnCount()
  {
    return colName.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    final Messung messung = messungen.get(rowIndex);  // Richtige Messung holen
    
    return 
      switch(columnIndex)
      {
        case 0 -> DateTimeFormatter.ofPattern("yyyy-MM-dd").format(messung.getDate());
        case 1 -> messung.getMesswert();
        case 2 -> messung.getSensor().getDim();
        case 3 -> messung.getSensor();
        default -> "Should not see me...";
      };
  }
}
