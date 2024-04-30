package ue02;

import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 *
 * @author iris06
 */
public class CuboidUI
{
  private double length, width, height;
  private double volume, surface, spaceDiagonale; //Datenelemente

  //Methoden
    //Konstruktor, ohne Paramter, nur in UI klasse
  public CuboidUI()
  { 
    try
    {
      input();
      calculate();
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

  //Methode
  private void input()
  {
    //Sannerobjekt zur Umwandlung von Texten in Zahlen erzeugen
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Please specify the length: ");
    length = scanner.nextDouble();
    System.out.print("Please specify the width: ");
    width = scanner.nextDouble();
    System.out.print("Please specify the height: ");
    height = scanner.nextDouble();
  }

  private void calculate() throws Exception
  {
    final CuboidCalculator calculator = new CuboidCalculator(length, width, height);
    
    this.surface = calculator.getSurface(); //
    this.volume = calculator.getVolume();
    this.spaceDiagonale = calculator.getSpaceDiagonale();
  }

  private void output()
  {
    System.out.format("Surface is %.2f%n", surface);
    System.out.format("Volume is %.2f%n", volume);
    System.out.format("Spacediagonale is %.2f%n", spaceDiagonale);
  }

  public static void main(String[] args)
  {
    new CuboidUI();
  }

}
//überall final bei variablen und wenn es nicht gebraucht wird meldet er sich 