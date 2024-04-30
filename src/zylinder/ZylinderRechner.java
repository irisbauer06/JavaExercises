package zylinder;

/**
 *
 * @author iris06
 */
public class ZylinderRechner
{
  private final double h;
  private final double r;
  
  private double o;
  private double v;
  private double g;
  private double m;
  private double d;

  public ZylinderRechner(double h, double r)
    throws Exception
  {
    
    this.h = h;
    this.r = r;
    
    rechnen();
  }
  private void rechnen()
  {
    o = 2 * Math.PI * r * (r + h);
    v = Math.pow(r, 2) * Math.PI * h;
    g = Math.PI * Math.pow(r, 2);
    m = 2 * Math.PI * r * h;
    d = 2 * r;
  }

  public double getO()
  {
    return o;
  }

  public double getV()
  {
    return v;
  }

  public double getG()
  {
    return g;
  }

  public double getM()
  {
    return m;
  }

  public double getD()
  {
    return d;
  }
  
}
