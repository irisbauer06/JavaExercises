package ue11.data;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Datenhaltungsklasse
 * dsign-pattern: Immutable
 * @author leonb
 */
public class Messung
{
  // Datenelemente
  final LocalDate date;
  private final double messwert;
  private final Sensor sensor;
  
  // Konstruktor
  public Messung(LocalDate date, double messwert, Sensor sensor) 
    throws Exception
  {
    this.date = date;
    this.messwert = messwert;
    this.sensor = sensor;
    
    // Plausikontrolle
    if (messwert < sensor.getSka())
      throw new Exception("Messwert muss größer Skalenanfang sein!");
    if (messwert > sensor.getSke())
      throw new Exception("Messwert muss kleiner Skalenende sein!");
  }
  
  // zweiter Konstruktor für einlesen
  public Messung(BufferedReader reader)
    throws Exception
  {
    final String line = reader.readLine(); // Zeile aus dem Reader lesen
    final String[] token = line.split(";");
    
    date = LocalDate.parse(token[0], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    messwert = Double.parseDouble(token[1].replace(",", "."));
    sensor = Sensor.valueOf(token[2]);
  }
  
  // Writer
  public void writeTo(BufferedWriter writer)
    throws Exception
  {
    writer.write(
      String.format(    // Film schreibt sich selsbt als CSV-Zeile in den Writer
   "%s;%.2f;%s", DateTimeFormatter.ofPattern("yyyy-MM-dd").format(date), messwert, sensor.name())
    );
    writer.newLine(); // Cursor in die nächste Zeile setzen
  }
  
  // Getter-Methoden
  public LocalDate getDate()
  {
    return date;
  }

  public double getMesswert()
  {
    return messwert;
  }

  public Sensor getSensor()
  {
    return sensor;
  }
  
}
