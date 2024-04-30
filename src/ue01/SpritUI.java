package ue01;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *UI zur Spritverbrauchsberechnung
 * design pattern: UI KLasse
 * @author iris06
 */

public class SpritUI
{
  //Datenelemente
  private double gefahreneKm; //Zugriffsschutz
  private double verbrauchInLiter;
  //Ausgangsgrößen
  private double durchschnittsverbrauch;
  
  public SpritUI()
  {
    try
    {
    //Methoden
    eingabe();
    rechnen();
    ausgabe();
    }
    catch (NoSuchElementException ex)
    {
      System.out.println("Fehler bei der Eingabe aufgetreten");
    }
    catch (Exception ex)
    {
      System.out.println("Fehler aufgetreten: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
  
  private void eingabe()
  {
    System.out.println("Spritverbrauchberechnung");
    System.out.println("========================");
    System.out.println("");
    //Eingabe der Eingangsgrößen
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Gefahrene km: ");
    gefahreneKm = scanner.nextDouble();
    System.out.println("Verbrauch in Liter: ");
    verbrauchInLiter = scanner.nextDouble();
    //TODO
  }
  private void rechnen() //Methode rechnen
    throws Exception
  {
    final SpritRechner spritRechner = 
      new SpritRechner(gefahreneKm, verbrauchInLiter);
    durchschnittsverbrauch = spritRechner.getDurchschnittsverbrauch();
  }
  private void ausgabe()
  {
    System.out.format("%nDurchschnittsverbrauch betraegt %.2f l/100km%n%n",
      durchschnittsverbrauch);
  }
  public static void main(String[] args)
  {
     new SpritUI(); //Namenloses Objekt
  }
}
