package kreditrechner;

/**
 *
 * @author iris06
 */
public class KreditRechner
{
  private final double monatlicheRate;
  private final double laufzeit;
  private final double zinssatz;

  private double gesamtkapital;

  public KreditRechner(double monatlicheRate, double laufzeit, double zinssatz) 
    throws Exception
  {
    this.monatlicheRate = monatlicheRate;
    this.laufzeit = laufzeit;
    this.zinssatz = zinssatz;
    
    if(laufzeit <0)
      throw new Exception("Laufzeit muss groe?er 0 Monate sein!");
    if(monatlicheRate < 0)
      throw new Exception("Monatliche Rate muss groeßer 0 sein!");
    if(zinssatz < 0)
      throw new Exception("Zinsatz kann nicht kleiner 0 sein!");
    rechnen();
  }

  private void rechnen()
  {
    final double q = 1 + zinssatz / (12 * 100);
    gesamtkapital = monatlicheRate * (1 - Math.pow(q, laufzeit))/ (1 - q);
  }

  public double getGesamtkapital()
  {
    return gesamtkapital;
  }

}
