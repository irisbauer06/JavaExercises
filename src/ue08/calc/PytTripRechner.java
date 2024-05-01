package ue08.calc;


import java.util.ArrayList;
import java.util.List;
import ue08.data.PytTrip;

/**
 *Rechnerklasse zum Auffinden pythagoräischer Tripel
 * mit Hypothenuse kleiner gleich Obergrenze
 * @author iris06
 */
public class PytTripRechner
{
  //Eingangsgrößen
  private final int obergrenze; // Maximale Lönge der Hypothenuse
  //Ausgangsgrößen
  private final List<PytTrip> pytTrips = new ArrayList<>();
  private long millis;

  public PytTripRechner(int obergrenze) throws Exception
  {
    this.obergrenze = obergrenze;
    if (obergrenze<1)
      throw new Exception("Obergrenze muss positiv sein!");
    rechnen();
    
  }

  private void rechnen()
  {
    
    final long zeit1 = System.currentTimeMillis(); //unix time *1000 (1.1.1970 00:00UTC)
    
    for (int a=1;a<=obergrenze;a++)
      for (int b=a+1;b<=obergrenze;b++)
        for (int c=b+1;c<=obergrenze;c++)
          if (a*a + b*b == c*c)
            pytTrips.add(new PytTrip(a,b,c));
    
        
    final long zeit2 = System.currentTimeMillis();
    millis = zeit2 - zeit1;
  }
  
  public List<PytTrip> getPytTrips()
  {
    return pytTrips;
  }

  public long getMillis()
  {
    return millis;
  }
  
  public static void main(String[] args)
  {
    try
    {
      final PytTripRechner rechner = new PytTripRechner(20);
      final List<PytTrip> pytTrips = rechner.getPytTrips();
      for (PytTrip pytTrip : pytTrips) //Klasse, variable, liste
        
        //System.out.format("%9d %9d %9d%n", pytTrip.getA(), 
          //pytTrip.getB(), pytTrip.getC());
       System.out.println(pytTrip);
       System.out.format("Es wurden %d pythagroaeische Tripel gefunden%n", pytTrips.size());
       System.out.format("Die Rechenzeit betrug %d Millisekunden%n", rechner.getMillis());
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
