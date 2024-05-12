package everything.calc;

import everything.data.PyTrip;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iris06
 * Ein -& Ausgangsgrößen, wobei a,b,c im Record sind, Konstruktor mit Exception, 
 * rechner-Methode, Getter
 */
public class Calc
{
  private final int obergrenze;
  private final List<PyTrip> pyTrips = new ArrayList<>();
  private long millis;

  public Calc(int obergrenze) throws Exception
  {
    this.obergrenze = obergrenze;
    if(obergrenze<1)
      throw new Exception("Obere Grenze größer 1!");
    rechnen();
  }
  
  private void rechnen()
  {
    final long zeit1 = System.currentTimeMillis();
    
    for(int a=1;a<=obergrenze;a++)
      for(int b=a+1;b<=obergrenze;b++)
        for(int c=b+1;c<=obergrenze;c++)
          if(a*a + b*b == c*c)
            pyTrips.add(new PyTrip(a,b,c));
    
    final long zeit2 = System.currentTimeMillis();
    millis = zeit2 -zeit1;
  }

  public List<PyTrip> getPyTrips()
  {
    return pyTrips;
  }

  public long getMillis()
  {
    return millis;
  }
  
}
