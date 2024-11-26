package ue11.data;

/**
 * Sensor Enum
 * @author leonb
 */
public enum Sensor
{
  // Konstanten
  TEMPERATUR, FEUCHTE, DRUCK; 
  
  private static String[] humanreadable = 
  {
    "Außentemperatur", "Luftfeuchtigkeit", "Luftdruck"
  };
  
  private static String[] dimension =
  {
    "°C", "%rF", "mbar"
  };
  
  private static double[] skalenanfang =
  {
    -50, 0, 500
  };
  
  private static double[] skalenende =
  {
    50, 100, 1100
  };

  @Override
  public String toString()
  {
    return humanreadable[ordinal()];
  }

  public String getDim()
  {
    return dimension[ordinal()];
  }

  public double getSka()
  {
    return skalenanfang[ordinal()];
  }

  public double getSke()
  {
    return skalenende[ordinal()];
  } 
}
