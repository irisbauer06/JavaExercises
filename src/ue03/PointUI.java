package ue03;

import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 *
 * @author iris06
 */
public class PointUI
{
  private double xPoint;
  private double yPoint;

  private int quadrant;
  private String description;

  public PointUI()
  {
    try
    {
      input();
      calculator();
      output();
    }
    catch (NoSuchElementException ex) //eine spezielle runtime Exception 
    //wenn kein double eingegeben wird, nextDouble wirft es 
    {
      System.out.println("An Error occured");
    }
    catch (Exception ex)
    {
      System.out.println("An Error occurred: " + ex.getMessage());
      ex.printStackTrace();

    }
  }

  private void input()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Please define the point on the X-axis: ");
    xPoint = scanner.nextDouble();
    System.out.print("Please define the point on the Y-axis: ");
    yPoint = scanner.nextDouble();
  }

  private void calculator()
    throws Exception
  {
    final QuadrantPointCalculator calculator = new QuadrantPointCalculator(xPoint, yPoint);
    
    quadrant = calculator.getQuadrant();
    description = calculator.getDescription();
  }
  private void output()
  {
    System.out.format("Quadrant is %d%n", quadrant);
    System.out.format("%s%n", description);
  } 
  
  public static void main(String[] args)
  {
    new PointUI();
  }
}