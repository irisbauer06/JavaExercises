package ue01;

/**
 * ue01: Berechnung des Durchschnittlichen Spritverbrauchs pro 100km Verwendetes
 * Design-pattern: "Rechnerklasse"
 *
 * @author iris06
 */
public class SpritRechner
{
  //Datenelemente
  //Eingangsgrößen (Komponenten)
  private final double gefahreneKm; //Zugriffsschutz
  private final double verbrauchInLiter;
  //Ausgangsgrößen
  private double durchschnittsverbrauch;

  //Konstruktor (Kein Rückgabewert und ein Klassennamen)
  /**
   * Idee: eine methode, automatisch aufgerufen, immer dann,
     wenn ein Objekt erzeugt wird
   * Objekt soll in einen gültigen Anfangszustand gebracht werden
   * @param gefahreneKm zurückgelegte Distanz in Km
   * @param verbrauchInLiter verbrauchter Kraftstoff in Liter
   * @throws Exception 
   */

  public SpritRechner(double gefahreneKm, double verbrauchInLiter)
    throws Exception
  {
    this.gefahreneKm = gefahreneKm;
    this.verbrauchInLiter = verbrauchInLiter;
    
    if(gefahreneKm <=0)
      throw new Exception("Gefahrene km muessen groesser 0 sein!");
    if (verbrauchInLiter <0.0)
      throw new Exception("Verbrauch in Liter muss groesser gleich 0 sein!");
    
    rechnen();
  }
  
  //Methoden
  private void rechnen()
  {
    durchschnittsverbrauch = verbrauchInLiter / gefahreneKm * 100.0;
  }

  public double getDurchschnittsverbrauch()
  {
    return durchschnittsverbrauch;
  }
   
}
