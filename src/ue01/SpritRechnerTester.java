package ue01;

/**
 *
 * @author iris06
 */
public class SpritRechnerTester
{
  public static void main(String[] args)
  {
    try
    {
      SpritRechner rechner = new SpritRechner(997.0, -10); //Referenz deklariert, rechner = Objekt in SpritRechner
    //rechner.gefahreneKm = 22.55;
    //rechner.init(1000.0, 55.0)
    //rechner.rechnen();
    System.out.format("Durchschnittsverbrauch: %.2f%n%n",rechner.getDurchschnittsverbrauch());
    }
    catch (Exception ex)
    {
      System.out.println(ex.getMessage());
      ex.printStackTrace();
    }
  }
}
