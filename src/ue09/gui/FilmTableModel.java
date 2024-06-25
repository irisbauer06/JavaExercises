package ue09.gui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ue09.data.Film;

/**
 *
 * @author iris06
 */
public class FilmTableModel extends AbstractTableModel
{
  private final static String[] colName =
  {
    "ID", "Titel", "Hauptdarsteller", "Genre", "Erscheinungsjahr", "Dauer", "FSK",
    "Lizenz", "Qualität", "Gesehen", "Erworben"
  };
  
  private final List<Film> filme;

  public FilmTableModel(List<Film> filme)
  {
    this.filme = filme;
  }

  
  @Override
  public int getRowCount()
  {
    return 0;
  }

  @Override
  public int getColumnCount()
  {
    return colName.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    final Film film = filme.get(rowIndex);
    return "??";
  }
  

  @Override
  public String getColumnName(int column)
  {
     return colName[column];
  }
  
  
}
