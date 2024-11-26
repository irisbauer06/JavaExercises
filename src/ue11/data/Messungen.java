package ue11.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.io.*;

/**
 * Colletection
 * Liste aller Messungen
 * @author leonb
 */
public class Messungen
{
  private final List<Messung> messungen = new ArrayList<>();
  
  // Testdaten
  public Messungen()
  {
    try
    {
      messungen.add(
        new Messung(
          LocalDate.of(2024, Month.NOVEMBER, 13),
          10.0, Sensor.TEMPERATUR));
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  
  // Getter-Methode
  public List<Messung> getMessungen()
  {
    return messungen;
  }
  
  // Delegate-Methods
  public int size()
  {
    return messungen.size();
  }

  public Messung get(int index)
  {
    return messungen.get(index);
  }

  public boolean add(Messung e)
  {
    return messungen.add(e);
  }
  
  // Schreiben/Lesen
  public void writeTo(BufferedWriter writer) 
    throws Exception
  {
    for (Messung messung : messungen)
      messung.writeTo(writer);
  }
  
  public void readFrom(BufferedReader reader)
    throws Exception
  {
    messungen.clear();  // Messungen löschen
    while(true)   // Endlosschleife
      try
      {
       messungen.add(new Messung(reader));  // EINE Messung lesen und anfügen
      }
      catch (Exception ignore)
      { 
        break;    // Beenden, sobald eine Exception geworfen wird
      }
  }
}
