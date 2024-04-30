package ue08.data;

/**
 *designpattern: Datenhaltungklasse repräsentiert pyth. Triple
 * "Immutable"
 * @author iris06
 */
public class PytTripOld
{
  private final int a,b,c;

  public PytTripOld(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA()
  {
    return a;
  }

  public int getB()
  {
    return b;
  }

  public int getC()
  {
    return c;
  }
  
  @Override
  public String toString()
  {
    return String.format("%9d %9d %9d", a, b, c);
  }
  
}
