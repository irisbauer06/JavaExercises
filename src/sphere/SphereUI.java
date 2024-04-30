package sphere;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class SphereUI
{
  private double radius1;
  private double radius2;
  
  private double volumen1;
  private double volumen2;
  private double oberfl1;
  private double oberfl2;

  public SphereUI()
  {
    try
    {
    eingabe();
    rechnen();
    ausgabe();
    }
    catch(NoSuchElementException ex)
    {
      System.out.println("Ein Fehler bei der Eingabe ist aufgetreten!");
    }
    catch (Exception e)
    {
      System.out.println("Ein Fehler ist aufgetreten!" + e.getMessage());
    }
    
  }

  private void eingabe()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Radius der ersten Kugel eingeben [cm]: ");
    this.radius1 = scanner.nextDouble();
    System.out.print("Radius der zweiten Kugel eingeben [cm]: ");
    this.radius2 = scanner.nextDouble();
  }

  private void rechnen() throws Exception
  {
    final SphereCalculator rechnen = new SphereCalculator(radius1, radius2);
    volumen1 = rechnen.getVolumen1();
    volumen2 = rechnen.getVolumen2();
    oberfl1 = rechnen.getOberfl1();
    oberfl2 = rechnen.getOberfl2();
  }

  private void ausgabe()
  {
    System.out.format("Oberflaeche 1: %.2f cm2%n", oberfl1);
    System.out.format("Volumen 1: %.2f cm3%n", volumen1);
    System.out.format("Oberflaeche 2: %.2f cm2%n", oberfl2);
    System.out.format("Volumen 2: %.2f cm3%n", volumen2);
  }
  public static void main(String[] args)
  {
    new SphereUI();
  }

}
