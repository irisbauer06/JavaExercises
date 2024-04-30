package kreditrechner;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class KreditUI
{
  private double monatlicheRate;
  private double laufzeit;
  private double zinssatz;
  
  private double gesamtkapital;
  
  public KreditUI()
  {
    try
    {
    eingabe();
    rechnen();
    ausgabe();
    }
    catch(NoSuchElementException ex)
    {
      System.out.println("Ein Fehler in der Eingabe kam auf!");
    }
    catch (Exception e)
    {
      System.out.println("Ein Fehler ist aufgetreten!" + e.getMessage());
    }

  }

  private void eingabe()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Monatliche Rate in Euro: ");
    monatlicheRate = scanner.nextDouble();
    System.out.print("Laufzeit in monaten: ");
    laufzeit = scanner.nextDouble();
    System.out.print("Zinsatz in %: ");
    zinssatz = scanner.nextDouble();
  }
 

  private void rechnen() throws Exception 
  {
    final KreditRechner rechner = new KreditRechner(monatlicheRate, laufzeit, zinssatz);
    gesamtkapital = rechner.getGesamtkapital();
  }

  private void ausgabe()
  {
    System.out.format("Gesamtkapital nach %.1f Monaten: %.3f%n", laufzeit,gesamtkapital);
  }
  public static void main(String[] args)
  {
    new KreditUI();
  }
  
}
