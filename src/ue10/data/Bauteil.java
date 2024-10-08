package ue10.data;

/**
 *
 * @author iris06
 */
public class Bauteil
{
  private final int anzahl;
  private final double wert;
  private final Bauteiltyp bauteiltyp;

  public Bauteil(int anzahl, double wert, Bauteiltyp bauteiltyp)
    throws Exception
  {
    this.anzahl = anzahl;
    this.wert = wert;
    this.bauteiltyp = bauteiltyp;
    
  }

  public int getAnzahl()
  {
    return anzahl;
  }

  public double getWert()
  {
    return wert;
  }

  public Bauteiltyp getBauteiltyp()
  {
    return bauteiltyp;
  }
  
  
}
