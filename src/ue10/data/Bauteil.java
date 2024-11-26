package ue10.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.time.LocalDate;

/**
 *
 * @author iris06
 */
public class Bauteil
{
    private int id;
    private String name;
    private String hersteller;   
    private int jahr;                   
    private boolean defekt;   
    private LocalDate erworbenAm;
    private final int anzahl;
    private final double wert;
    private final Bauteiltyp bauteiltyp;


  public Bauteil(int id, String name, String hersteller, int jahr,
    boolean defekt, LocalDate erworbenAm, 
    int anzahl, double wert, Bauteiltyp bauteiltyp)
    throws Exception
  {
    this.id = id;
    this.name = name;
    this.hersteller = hersteller;
    this.jahr = jahr;
    this.defekt = defekt;
    this.erworbenAm = erworbenAm;
    this.anzahl = anzahl;
    this.wert = wert;
    this.bauteiltyp = bauteiltyp;
  }
  
  //TODO
  public Bauteil(BufferedReader reader)
    throws Exception
  {
    final String line = reader.readLine();
    final String [] token = line.split(";");
    anzahl = Integer.parseInt(token[1]);
    wert = Integer.parseInt(token[2]);
    bauteiltyp = Bauteiltyp.valueOf(token[3]); //Da Bauteiltyp ein enum ist, valueOf
  }

  public void writeTo(BufferedWriter writer) throws Exception
  {
    //TODO
    writer.write(
    String.format("%d;%d;%s", anzahl, wert, bauteiltyp.name()
    ));
    writer.newLine();
  }

  public int getAnzahl()
  {
    return anzahl;
  }

  public double getWert()
  {
    return wert;
  }

  public Bauteiltyp getBauteiltyp()
  {
    return bauteiltyp;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getHersteller()
  {
    return hersteller;
  }

  public int getJahr()
  {
    return jahr;
  }

  public boolean isDefekt()
  {
    return defekt;
  }

  public LocalDate getErworbenAm()
  {
    return erworbenAm;
  }
  
  
}
