package ue09.data;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.time.*;

/**
 *
 * @author iris06
 */
public class Filme
{
  private final List<Film> filme = new ArrayList<>();

  public Filme()
  {
    
    try
    {
      //Testdaten hinzufügen
      filme.add(
        new Film(1,"Die glorreichen Sieben", "Yul Brynner",
          Genre.WESTERN, 1960, 128, 16, Lizenz.GELIEHEN,
          Quality.HD_READY, true, LocalDate.of(2024, Month.SEPTEMBER, 17)
        )
      );
    }
    catch (Exception ex)
    {
    }
  }
  
  public List<Film> getFilme()
  {
    return filme;
  }

  public int size()
  {
    return filme.size();
  }

  public boolean add(Film e)
  {
    return filme.add(e);
  }

  public Film remove(int index)
  {
    return filme.remove(index);
  }

  public Film set(int index, Film element)
  {
    return filme.set(index, element);
  }

  public Film get(int i)
  {
    return filme.get(i);
  }
  
  
}
