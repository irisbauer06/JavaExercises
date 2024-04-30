package ue03;

/**
 *
 * @author iris06
 */
public class QuadrantPointCalculator
{
  //Eingangsgrößen
  private final double xPoint;
  private final double yPoint;
  
  //Ausgangsgrößen
  private int quadrant;
  private String description;

  //Konstruktor mit source insert code
  public QuadrantPointCalculator(double xPoint, double yPoint)
    throws Exception
  {
    this.xPoint = xPoint;
    this.yPoint = yPoint;
    
    calculate();
  }
  
  //Berechnungen
  private void calculateQuadrant()
    throws Exception
  {
    
    if(xPoint>0 && yPoint>0) quadrant=1;
    else if(xPoint<0 && yPoint>0) quadrant=2;
    else if(xPoint<0 && yPoint<0) quadrant=3;
    else if(xPoint>0 && yPoint<0) quadrant=4;
    else if(xPoint==0 && yPoint!=0) quadrant=5;
    else if(xPoint!=0 && yPoint==0) quadrant=6;

    if (xPoint == 0 && yPoint == 0)
      
      throw new Exception("Point is not allowed to lie in the origin");
  }
  
  private void calculateDescription()
  {
    /*
    switch(quadrant)
    {
      case 1, 2, 3, 4 -> description = String.format(
        "The Point lies in the %d quadrant", quadrant);
      case 5 -> description ="The Point lies on the x-Axis";
      case 6 -> description ="The point lies on the y-Axis";
      case 7 -> description ="The point lies in the origin";
    }*/
    
    // switch Expression
  description = 
    switch (quadrant)
    {
      case 1, 2, 3, 4 -> String.format(
        "The Point lies in the %d quadrant", quadrant); 
      case 5 ->  "The Point lies on the x-Axis";
      case 6 ->  "The point lies on the y-Axis";
      case 7 ->  "The point lies in the origin";
      default -> "Should not see me...";
    };
  }
  
  private void calculate()
    throws Exception
  {
    calculateQuadrant();
    calculateDescription();
  }

  //getter
  public int getQuadrant()
  {
    return quadrant;
  }

  public String getDescription()
  {
    return description;
  }
  
  public static void main(String[] args)
  {
    try
    {
      final QuadrantPointCalculator calculator = new QuadrantPointCalculator(-5,2.5);
      System.out.format("Quadrant: %d%n", calculator.getQuadrant());
      System.out.format("Description: %s%n", calculator.getDescription());
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}