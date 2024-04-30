package zinseszinssatz;

/**
 *
 * @author iris06
 */
public class ZinseszinsCalculator
{
  private final double grundKapital;
  private final double laufzeit;
  private final double zinssatz;

  private double gesamtKapital;

  

  public ZinseszinsCalculator(double grundKapital, double laufzeit, double zinsatz) 
  {
 
      this.grundKapital = grundKapital;
      this.laufzeit = laufzeit;
      this.zinssatz = zinsatz;
    calculate();
  }

  private void calculate()
  {
    final double r;
    r = 1 + zinssatz / 100;
    gesamtKapital = grundKapital *(Math.pow(r, laufzeit));
  }

  public double getGesamtKapital()
  {
    return gesamtKapital;
  }
  public static void main(String[] args)
  {
    final ZinseszinsCalculator calculator = new ZinseszinsCalculator(1500, 30, 2.5);
    System.out.format("%.1f, %.2f", calculator.laufzeit, calculator.gesamtKapital);
  }

}