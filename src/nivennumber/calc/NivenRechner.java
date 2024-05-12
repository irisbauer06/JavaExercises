package nivennumber.calc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iris06
 */
public class NivenRechner
{
  private final int obergrenze;
  //private final List<NivenNumber> nivenNumbers = new ArrayList<>();
  private long millis;

  public NivenRechner(int obergrenze) throws Exception
  {
    this.obergrenze = obergrenze;
    if(obergrenze<100)
      throw new Exception("Obergrenze muss größer 100 sein!");
    rechnen();
  }

  private void isQuersumme()
  {
    
  }
  private void isNivenNumber()
  {
    
  }
  private void rechnen()
  {
    
  }
  
  //public List<NivenNumber> getNivenNumbers()
  {
    //return nivenNumbers;
  }

  public long getMillis()
  {
    return millis;
  }

}
