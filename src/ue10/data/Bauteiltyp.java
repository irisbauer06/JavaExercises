package ue10.data;

/**
 *
 * @author iris06
 */
public enum Bauteiltyp
{
  WIDERSTAND, TRANSISTOR, LED, KONDENSATOR, INDUKTIVITÄT, DIODE;
  
  private String [] humanReadable =
  {
    "Widerstand","Transistor","LED","Kondensator","Spule","Diode"
  };
  
  @Override
  public String toString()
  {
    
    return humanReadable[ordinal()];
  }
  
}
