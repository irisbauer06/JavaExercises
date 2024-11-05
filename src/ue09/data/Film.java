package ue09.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *Datenerhaltungklasse zur Repräsentation eines Films
 * auf einem digitalem Medium
 * @author iris06
 */
public class Film
{
  //Datenelemente
  private final int id;
  private final String titel, hauptdarsteller;
  private final Genre genre;
  private final int erscheinungsjahr, dauerInMinuten, fsk;
  private final Lizenz lizenz;
  private final Quality quality;
  private final boolean gesehen;
  private final LocalDate erworbenAm;

  public Film(int id, String titel, String hauptdarsteller, Genre genre,
    int erscheinungsjahr, int dauerInMinuten, int fsk, Lizenz lizenz,
    Quality quality, boolean gesehen, LocalDate erworbenAm)
    throws Exception
  {
    this.id = id;
    this.titel = titel;
    this.hauptdarsteller = hauptdarsteller;
    this.genre = genre;
    this.erscheinungsjahr = erscheinungsjahr;
    this.dauerInMinuten = dauerInMinuten;
    this.fsk = fsk;
    this.lizenz = lizenz;
    this.quality = quality;
    this.gesehen = gesehen;
    this.erworbenAm = erworbenAm;
    
    if(titel.isBlank())
      throw new Exception("Titel darf nicht leer sein!");
  }
  public Film(BufferedReader reader) 
    throws Exception
  {
    final String line = reader.readLine(); //Zeile aus dem Reader lesen
    final String[] token = line.split(";");
    id = Integer.parseInt(token[0]);
    titel =token[1];
    hauptdarsteller = token[2];
    genre = Genre.valueOf(token[3]);
    erscheinungsjahr = Integer.parseInt(token[4]);
    dauerInMinuten = Integer.parseInt(token[5]);
    fsk = Integer.parseInt(token[6]);
    lizenz = Lizenz.valueOf(token[7]);
    quality = Quality.valueOf(token[8]);
    gesehen = Boolean.parseBoolean(token[9]);
    erworbenAm =
      LocalDate.parse(token[10],
        DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    
  }
  public void writeTo(BufferedWriter writer)
    throws Exception
  {
    writer.write(
      String.format( //Film schreibt sich selbst als CSV-Zeile in den Writer
        "%d; %s; %s; %s; %d; %d; %d; %s; %s; %s",
        id, titel,hauptdarsteller, genre.name(),
        erscheinungsjahr,dauerInMinuten,fsk,
        lizenz.name(), quality.name(),Boolean.toString(gesehen),
        DateTimeFormatter.ofPattern("yyyy-MM-dd").format(erworbenAm)
    ));
    writer.newLine();
  }
  

  public int getId()
  {
    return id;
  }

  public String getTitel()
  {
    return titel;
  }

  public String getHauptdarsteller()
  {
    return hauptdarsteller;
  }

  public Genre getGenre()
  {
    return genre;
  }

  public int getErscheinungsjahr()
  {
    return erscheinungsjahr;
  }

  public int getDauerInMinuten()
  {
    return dauerInMinuten;
  }

  public int getFsk()
  {
    return fsk;
  }

  public Lizenz getLizenz()
  {
    return lizenz;
  }

  public Quality getQuality()
  {
    return quality;
  }

  public boolean isGesehen()
  {
    return gesehen;
  }

  public LocalDate getErworbenAm()
  {
    return erworbenAm;
  }

}
