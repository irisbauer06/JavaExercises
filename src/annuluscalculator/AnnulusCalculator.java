package annuluscalculator;

/**
 *
 * @author iris06
 */
public class AnnulusCalculator
{
  private final double innenRing;
  private final double aussenRing;

  private double kreisRingUmfang;
  private double kreisRingFläche;

  private double umfangInnen;
  private double umfangAussen;

  public AnnulusCalculator(double innenRing, double aussenRing) throws Exception
  {
    this.innenRing = innenRing;
    this.aussenRing = aussenRing;
    
    if(innenRing < 0.0)
    {
      throw new Exception("Inner ring must be greater 0!");
    }
    if(aussenRing < 0.0)
    {
      throw new Exception("Outer ring must be greater 0!");
    }
    if (innenRing >= aussenRing) 
    {
      throw new Exception("Outer ring must be greater than Inner ring!");
    }
    
    calculate();
  }

  private void calculate()
  {
    umfangInnen = 2 * innenRing * Math.PI;
    umfangAussen = 2 * aussenRing * Math.PI;
    kreisRingUmfang = umfangAussen + umfangInnen;
    kreisRingFläche = aussenRing * aussenRing * Math.PI - innenRing * innenRing * Math.PI;
    
    //jetzt muss aussen ring immer größer sein ist logisch oder?
    //also this kann man nur auf datenelemente schreiben und auf method in derselben klasse 
    
    //Bei so einem cal
    
    //ja siehst aber wie ist die formeln für die kreisfläche?
    //(d^2*Pi) / 4
    //r^2 PI
  }

  public double getKreisRingUmfang()
  {
    return kreisRingUmfang;
  }

  public double getKreisRingFläche()
  {
    return kreisRingFläche;
  }

}
