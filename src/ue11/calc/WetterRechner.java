package ue11.calc;

import java.util.List;
import ue11.data.*;

/**
 * design-pattern: Rechnerklasse
 * @author leonb
 */
public class WetterRechner
{
  // Datenelemente
  // Eingangsgrößen
  private final List<Messung> messungen;
  
  // Ausgangsgrößen
  private double avg_temp, avg_feuchte, avg_druck;
  
  // Konstruktor
  public WetterRechner(List<Messung> messungen) 
    throws Exception
  {
    this.messungen = messungen;
    
    // Plausikontrolle
    if(messungen.isEmpty())
      throw new Exception("Liste darf nicht leer sein!");
    
    rechnen();
  }
  
  // Rechnen
  private void rechnen()
  {
    avg_temp = getDurchschnitt(Sensor.TEMPERATUR);
    avg_feuchte = getDurchschnitt(Sensor.FEUCHTE);
    avg_druck = getDurchschnitt(Sensor.DRUCK);
  }
  
  private double getDurchschnitt(Sensor sensor)
  {
    double sum = 0;
    int counter = 0;
    
    for (Messung messung : messungen)
    {
      if(messung.getSensor() == sensor)
      {
        sum += messung.getMesswert();
        counter++;
      }
    }
    
    if (counter > 0)
      return sum / counter;
    else
      return 0;
  }
 
  
  // Getter-Methoden
  public double getTemperatur()
  {
    return avg_temp;
  }

  public double getFeuchte()
  {
    return avg_feuchte;
  }

  public double getDruck()
  {
    return avg_druck;
  }
}
