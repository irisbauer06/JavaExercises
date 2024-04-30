package triangle;

/**
 *
 * @author iris06
 */
public class TriangleCalculator
{
  private final double seiteA;
  private final double seiteB;

  private double hypothenuse;
  private double umfang;
  private double fläche;
  private double halbeUmfang;

  public TriangleCalculator(double seiteA, double seiteB) throws Exception
  {
    this.seiteA = seiteA;
    this.seiteB = seiteB;
    
    if (seiteA < 0)
      throw new Exception("Length must be greater 0");
    if (seiteB < 0)
      throw new Exception("Length must be greater 0");
    
    calculate();
  }
  
  private void calculate() 
  {
    hypothenuse = Math.sqrt(Math.pow(seiteA, 2) + Math.pow(seiteB, 2));
    umfang = seiteA + seiteB + hypothenuse;
    halbeUmfang = umfang / 2;
    fläche = Math.sqrt(halbeUmfang * (halbeUmfang - seiteA)
      * (halbeUmfang - seiteB) * (halbeUmfang - hypothenuse));
  }

  public double getHypothenuse()
  {
    return hypothenuse;
  }

  public double getUmfang()
  {
    return umfang;
  }

  public double getFläche()
  {
    return fläche;
  }

}
