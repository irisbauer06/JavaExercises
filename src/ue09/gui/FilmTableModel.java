package ue09.gui;

import java.time.format.DateTimeFormatter;
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
    return filme.size();
  }

  @Override
  public int getColumnCount()
  {
    return colName.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    final Film film = filme.get(rowIndex); //"Richtigen" Film holen
    return
    switch (columnIndex)
    {
      case  0 -> film.getId(); 
      case  1 -> film.getTitel(); 
      case  2 -> film.getHauptdarsteller();
      case  3 -> film.getGenre(); //TODO toString() überlagern
      case  4 -> film.getErscheinungsjahr();
      case  5 -> String.format("%d:%02d,",
                  film.getDauerInMinuten()/60,
                  film.getDauerInMinuten()%60);
      case  6 -> film.getFsk();
      case  7 -> film.getLizenz(); //TODO
      case  8 -> film.getQuality();
      case  9 -> film.isGesehen() ? "Ja" : "Nein";
      case 10 -> DateTimeFormatter.ofPattern("yyyy-MM-dd")
                                        .format(film.getErworbenAm());
      default -> "Should not see me ...";
    };
    
  }
  

  @Override
  public String getColumnName(int column)
  {
     return colName[column];
  }
  
  
}
