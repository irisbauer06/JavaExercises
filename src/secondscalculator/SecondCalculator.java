package secondscalculator;

/**
 *
 * @author iris06
 */
public class SecondCalculator
{
  private final int hour;
  private final int min;
  private final int sec;
  
  private int sumSec;
  
  //Konstruktor
  public SecondCalculator(int hour, int min, int sec) throws Exception
    
  {
    //Initialisiert
    this.hour = hour; //Weil die Datenelemente final sind this.
    this.min = min;
    this.sec = sec;
    
    if(hour < 0)
      throw new Exception("NO UNDER 0 HOURS ALLOWED");
    if(min < 0)
      throw new Exception("NO UNDER 0 MINUTES ALLOWED");
    if(sec < 0)
      throw new Exception("NOT NEGATIVITY ALLOWED");

    calculate();
  }
  private void calculate()
  {
    //1 hour = 3600sec, 1min = 60sec, 1sec
    sumSec = hour*3600 + min*60 + sec;
  }

  public int getSumSec()
  {
    return sumSec;
  }
   
}
