package perfektezahl.calc;

import java.util.ArrayList;
import java.util.List;
import perfektezahl.data.PerfekteZahl;

/**
 *
 * @author iris06
 */
public class Rechner
{
  private final int obergrenze;
  private final int untergrenze;

  private final List<PerfekteZahl> perfekteZahlen = new ArrayList<>();

  public Rechner(int obergrenze, int untergrenze) throws Exception
  {
    this.obergrenze = obergrenze;
    this.untergrenze = untergrenze;
    if (untergrenze < 10)
      throw new Exception("Größer 10!");
    if (obergrenze >= 9999)
      throw new Exception("Kleiner 10000!");
    rechnen();
  }

  private void rechnen()
  {
    for (int zahlen = untergrenze; zahlen <= obergrenze; zahlen++)
    {
      if (istPerfekteZahl(zahlen))
      {
        perfekteZahlen.add(new PerfekteZahl(zahlen));
      }
    }
  }

  private boolean istPerfekteZahl(int zahl)
  {
    int summe = 0;
    for (int i = 1; i < zahl; i++)
    {
      if (zahl % i == 0)
      {
        summe += i;
      }
    }
    return summe == zahl;
  }

  public int anzahlPerfekteZahlen()
  {
    int anzahl = 0;
    for (int zahl = untergrenze; zahl <= obergrenze; zahl++)
    {
      if (istPerfekteZahl(zahl))
      {
        anzahl++;
      }
    }
    return anzahl;
  }

  public List<PerfekteZahl> getPerfekteZahlen()
  {
    return perfekteZahlen;
  }

  public static void main(String[] args)
  {
    try
    {
      final Rechner rechner = new Rechner(600, 100);
      final List<PerfekteZahl> perfekteZahlen = rechner.getPerfekteZahlen();
      for (PerfekteZahl perfekteZahl : perfekteZahlen) //Klasse, variable, liste
        
        //System.out.format("%9d %9d %9d%n", pytTrip.getA(), 
          //pytTrip.getB(), pytTrip.getC());
       System.out.println(perfekteZahl);
       System.out.format("Es wurden %d Perfekte Zahlen gefunden%n", perfekteZahlen.size());
       //System.out.format("Die Rechenzeit betrug %d Millisekunden%n", rechner.getMillis());
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
