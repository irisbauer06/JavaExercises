package secondscalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author iris06
 */
public class SecondUI
{
  //Variablen sind nur in Rechnerklasse final
  private int hour;
  private int min;
  private int sec;

  private int sumSec;

  public SecondUI()
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
    catch (Exception e)
    {
      System.out.println("Error occured " + e.getMessage());
    }

  }

  private void input()
  {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Please specify the hours: ");
    hour = scanner.nextInt();
    System.out.print("Please specify ze minutes: ");
    min = scanner.nextInt();
    System.out.print("Please specify the seconds: ");
    sec = scanner.nextInt();
  }

  private void calculate() throws Exception
  {
    //Object von Secondcalculator erstellen
    SecondCalculator secondCalculator = new SecondCalculator(hour, min, sec); //KOnstruktor wird aufgerufen
    sumSec = secondCalculator.getSumSec(); //Klammern immer nach Methodenaufruf
  }

  private void output()
  {
    System.out.format("%d seconds have passed since midnight%n", sumSec);
  }

  public static void main(String[] args)
  {
    new SecondUI();
  }
}
