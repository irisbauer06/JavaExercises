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
    
    //Testdaten hinzufügen
    filme.add(
    new Film(1,"Die glorreichen Sieben", "Yul Brynner", 
      Genre.WESTERN, 1960, 128, 16, Lizenz.GELIEHEN,
      Quality.HD_READY, true, LocalDate.of(2024, Month.SEPTEMBER, 17)
    )
    );
  }
  
  public List<Film> getFilme()
  {
    return filme;
  }
}
