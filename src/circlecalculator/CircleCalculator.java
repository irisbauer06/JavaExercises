package circlecalculator;

/**
 *
 * @author iris06
 */
public class CircleCalculator
{
  private final double radius;
  
  private double kreisUmfang;
  private double kreisFläche;
  
  public CircleCalculator(double radius) throws Exception
  {
    this.radius = radius;
    if(radius < 0.0)
      throw new Exception("Der Radius muss groeßer 0 sein!");
    
    calculate();
  }
    private void calculate()
    {
      kreisUmfang = 2 * radius * Math.PI;
      kreisFläche = Math.pow(radius, 2) * Math.PI;
    }
    public double getKreisUmfang()
    {
      return kreisUmfang;
    }

    public double getKreisFläche()
    {
      return kreisFläche;
    }
}
