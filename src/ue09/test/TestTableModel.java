package ue09.test;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iris06
 */
public class TestTableModel extends AbstractTableModel
{
  //Speicher für 3x5 Objekte
  private final Object[][] memory = new Object[3][getColumnCount()];
  private final static String[] colName =
  {
    "Aepfel", "Birnen", "Zwetschken", "Datteln", "Erdbeeren"
  };
  
  @Override
  public String getColumnName(int column)
  {
     return colName[column];
  }
  
  
  @Override
  public int getRowCount()
  {
    return 3;
  }

  @Override
  public int getColumnCount()
  {
    return colName.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    return memory[rowIndex][columnIndex];
  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex)
  {
     return true;
  }

  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex)
  {
    memory[rowIndex][columnIndex] = aValue;
  }
  
  
  
}
