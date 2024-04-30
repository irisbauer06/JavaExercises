package zinseszinssatz;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class ZinseszinsUI
{
  private double grundKapital;
  private double laufzeit;
  private double zinssatz;

  private double gesamtKapital;

  public ZinseszinsUI()
  {
    try
    {
      input();
      calculate();
      output();
    }
    catch (NoSuchElementException e)
    {
      System.out.println("An error occured!");
    }
    catch (Exception e)
    {
      System.out.println("An error occured: " + e.getMessage());
    }

  }

  private void input()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Grundkapital: ");
    grundKapital = scanner.nextDouble();
    System.out.print("Laufzeit in Jahren: ");
    laufzeit = scanner.nextDouble();
    System.out.print("Zinsatz in '%': ");
    zinssatz = scanner.nextDouble();
  }

  private void calculate() throws Exception
  {
    final ZinseszinsCalculator calculator = new ZinseszinsCalculator(grundKapital, laufzeit, zinssatz);
    gesamtKapital = calculator.getGesamtKapital();
  }

  private void output()
  {
    System.out.format("Das Gesamtkapital nach %.1f betraegt: %.2f Euro%n", laufzeit, gesamtKapital);
  }

  public static void main(String[] args)
  {
    new ZinseszinsUI();
  }

}
