package triangle;

import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 *
 * @author iris06
 */
public class TriangleUI
{
  private double seiteA;
  private double seiteB;

  private double hypothenuse;
  private double umfang;
  private double fläche;
  
  public TriangleUI()
  {
    try
    {
      input();
      calculate();
      output();
    }
    catch (NoSuchElementException e)
    {
      System.out.println("An error occured");
    }
    catch (Exception e)
    {
      System.out.println("An error occured" + e.getMessage());
      //e.printStackTrace();
    }
    
  }

  private void input()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Please specify length A: ");
    seiteA = scanner.nextDouble();
    System.out.print("Please specify length B: ");
    seiteB = scanner.nextDouble();
  }

  private void calculate() throws Exception
  {
    final TriangleCalculator calculator = new TriangleCalculator(seiteA, seiteB);
    this.hypothenuse = calculator.getHypothenuse();
    this.umfang = calculator.getUmfang();
    this.fläche = calculator.getFläche();
  }

  private void output()
  {
    System.out.format("The length of the hypothenuse is %.1f%n", hypothenuse);
    System.out.format("The scope is %.1f%n", umfang);
    System.out.format("The area is %.1f%n", fläche);
  }
  
  public static void main(String[] args)
  {
    new TriangleUI();
  }
}
