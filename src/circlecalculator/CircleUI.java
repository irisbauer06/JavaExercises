package circlecalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class CircleUI
{
  private double radius;
  private double kreisUmfang;
  private double kreisFläche;

  public CircleUI()
  {
    try
    {
      eingabe();
      calculate();
      ausgabe();
    }
    catch (NoSuchElementException ex)
      
      {
        System.out.println("An error occured");
      }
    catch (Exception e)
    {
      System.out.println("An error occured: " + e.getMessage());
    }
  }

  private void eingabe()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte den Radius eingeben: ");
    radius = scanner.nextDouble();
  }

  private void calculate() throws Exception
  {
    final CircleCalculator circleCalculator = new CircleCalculator(radius);
    kreisFläche = circleCalculator.getKreisFläche();
    kreisUmfang = circleCalculator.getKreisUmfang();
  }

  private void ausgabe()
  {
    System.out.format("Kreis Umfang betraegt: %.1fl%n", kreisUmfang);
    System.out.format("Kreis Flaeche betraegt: %.1fl%n", kreisFläche);
  }

  public static void main(String[] args)
  {
    new CircleUI();
  }

}
