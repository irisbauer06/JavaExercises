package ue09.data;

import java.time.LocalDate;

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
