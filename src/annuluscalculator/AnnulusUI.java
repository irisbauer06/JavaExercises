package annuluscalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class AnnulusUI
{
  private double innenRing;
  private double aussenRing;

  private double kreisRingUmfang;
  private double kreisRingFläche;
  
  public AnnulusUI()
  {
    try
    {
     input();
     calculate();
     output();
    }
    catch (NoSuchElementException ex)
    {
      System.out.println("An error occured"); 
    }
    catch (Exception e)
    {
      System.out.println("An error occured" + e.getMessage());
    }
      
  }

  private void input()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Please specify the radius of the smaller ring: ");
    innenRing = scanner.nextDouble();
    System.out.print("Please specify the radius of the bigger ring: ");
    aussenRing = scanner.nextDouble();
    
  }

  private void calculate() throws Exception
  {
    AnnulusCalculator calculator = new AnnulusCalculator(innenRing, aussenRing);
    kreisRingFläche = calculator.getKreisRingFläche();
    kreisRingUmfang = calculator.getKreisRingUmfang();
  }

  private void output()
  {
    System.out.format("The scope of the annulus is %.3f%n", kreisRingUmfang);
    System.out.format("The area of the annulus is %.3f%n", kreisRingFläche);
  }
  public static void main(String[] args)
  {
    new AnnulusUI();
  }
  
}
