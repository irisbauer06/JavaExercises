package ue10.data;

/**
 *
 * @author iris06
 */
public enum Bauteiltyp
{
  WIDERSTAND, TRANSISTOR, LED, DIODE;
  
  private String [] humanReadable =
  {
    "Widerstand","Transistor","LED","Diode", "Spule"
  };
  
  private String [] dimensions =
  {
    "Ohm", "B", "V", "V", "Henry"
  };
  
  @Override
  public String toString()
  {
    
    return humanReadable[ordinal()];
  }
  
  public String getDim()
  {
    return dimensions[ordinal()];
  }
  
}
