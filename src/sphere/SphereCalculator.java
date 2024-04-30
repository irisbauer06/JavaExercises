package sphere;

/**
 *
 * @author iris06
 */
public class SphereCalculator
{
  private final double radius1;
  private final double radius2;
  
  private double volumen1;
  private double volumen2;
  private double oberfl1;
  private double oberfl2;

  public SphereCalculator(double radius1, double radius2) throws Exception
  {
    this.radius1 = radius1;
    this.radius2 = radius2;
    
    if(radius1 < 0)
      throw new Exception("Radius kann nicht kleiner 0 sein");
    
    if(radius2 < 0)
      throw new Exception("Radius kann nicht kleiner 0 sein");
    
    calculate();
  }
  
  private void calculate()
  {
    oberfl1 = 4 * Math.PI * radius1 * radius1;
    oberfl2 = 4 * Math.PI * radius2 * radius2;
    volumen1 = (4/3) * Math.PI * (Math.pow(radius1,3));
    volumen2 = (4/3) * Math.PI * (Math.pow(radius2,3));
  }

  public double getVolumen1()
  {
    return volumen1;
  }

  public double getVolumen2()
  {
    return volumen2;
  }

  public double getOberfl1()
  {
    return oberfl1;
  }

  public double getOberfl2()
  {
    return oberfl2;
  }

}
