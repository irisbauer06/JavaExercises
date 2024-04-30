package ue07.calc;
import java.util.*;

/**
 * Rechnerklasse zur Berechnung des arithmetischen Mittels und der n-1 - gewichteten 
 * Standardabweichung von beliebig vielen doppelt genauen Fließkommazahlen
 * @author iris06
 */
public class StatisticRechner
{
  //Eingangsgrößen
  private final List<Double> liste;
  //Ausgangsgrößen
  private double durchschnitt, stdAbw; //arithmetisches Mittel, Standardabweichung

  public StatisticRechner(List<Double> liste)
    throws Exception
  {
    this.liste = liste;
    if (liste.size() < 2) //Plausikontrolle
      throw new Exception("Zur Berechnung sind mindestens zwei Zahlen nötig.");
    rechnen();
  }
  
  private void berechneDurchschnitt()
  {
    double summe = 0.0;
    for (Double zahl : liste) //Iteriere über die Liste
      summe += zahl; //addiere jedes besuchte Element zur Summe
    durchschnitt = summe / liste.size();
  }
  
  private void berechneStdAbw()
  {
    double summe = 0.0;
    for (Double zahl : liste) //Iteriere über die Liste
      summe += (zahl - durchschnitt) * (zahl - durchschnitt);
    stdAbw = Math.sqrt(summe / (liste.size()-1));
    
  }
  
  private void rechnen()
  {
    berechneDurchschnitt();
    berechneStdAbw();
  }

  public double getDurchschnitt()
  {
    return durchschnitt;
  }

  public double getStdAbw()
  {
    return stdAbw;
  }
  public static void main(String[] args)
  {
    try
    {
      //Erzeugen und Befüllen einer Liste mit Testwerten
      /*final List<Double> liste = new ArrayList<>(); //Listenobjekt erzeugen
      liste.add(4.0);
      liste.add(5.0);
      liste.add(6.0);
      liste.add(7.0); */
      final List<Double> liste = Arrays.asList(4.0, 5.0, 6.0, 7.0);
      //rechnen
      final StatisticRechner rechner = new StatisticRechner(liste); //Rechnerobjekt erzeugen
      final double durchschnitt = rechner.getDurchschnitt(); //Ausgangsgrößen mit getter abholen
      System.out.format("Durchschnitt: %.3f%n", durchschnitt);
      final double stdAbw = rechner.getStdAbw();
      System.out.format("Standardabweichung: %.3f%n", stdAbw);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
 
}
