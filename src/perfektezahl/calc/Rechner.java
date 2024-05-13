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
    if(untergrenze<100)
      throw new Exception("Größer 100!");
    if(obergrenze>=9999)
      throw new Exception("Kleiner 10000!");
    rechnen();
  }
  private void rechnen()
  {
    
  }
  public List<PerfekteZahl> getPerfekteZahlen()
  {
    return perfekteZahlen;
  }
  
}
