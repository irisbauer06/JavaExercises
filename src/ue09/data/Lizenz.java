package ue09.data;

/**
 *
 * @author iris06
 */
public enum Lizenz
{
  GEKAUFT, GELIEHEN,PRIVATKOPIE, RAUPKOPIERT;
  private String [] humanReadable =
  {
    "gekauft", "ausgeliehen", "privat kopiert", "raubkopiert"
  };
  
  @Override
  public String toString()
  {
    
    return humanReadable[ordinal()];
  }
}
