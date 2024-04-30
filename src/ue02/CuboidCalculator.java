package ue02;

/**
 *
 * @author iris06
 */
public class CuboidCalculator
{
  private final double length;
  private final double width;
  private final double height;

  private double surface;
  private double spaceDiagonale;
  private double volume;

  //Konstruktor (Hinweis; "Source + insert code)
  public CuboidCalculator(double length, double width, double height)
    throws Exception //Konstruktor kann Exceptions werfen
  {
    //Eingangsgrößen übernehmen
    this.length = length;
    this.width = width;
    this.height = height;
    
    //Plausikontrolle: Sind die Eingangsgrößen die gültig sind
    if (length <= 0)
    {
      throw new Exception("Length must be greater than 0"); //Objekt der Klasse Exception
    }

    if (width <= 0)
    {
      throw new Exception("Width must be greater than 0");
    }

    if (height <= 0)
    {
      throw new Exception("Height must be greater than 0");
    }

    calculate(); //Wenn alle Eingangsgrößen gültig sind: calculate
  }
  //Umsetzen des mathematischen Modells
  private void calculate()
  {
    volume = length * width * height;
    surface = 2 * (length * width + length * height + width * height);
    
    final double bottomDiagonal = Math.sqrt(width * width + length * length);
    
    spaceDiagonale = Math.sqrt(bottomDiagonal * bottomDiagonal + height * height);
  }

  //GETTER METHODEN!!!!
  public double getSurface()
  {
    return surface;
  }

  public double getSpaceDiagonale()
  {
    return spaceDiagonale;
  }

  public double getVolume()
  {
    return volume;
  }
  
  //Zwischenschritt, "Tester", nicht verpflichtend für Endprodukt
  public static void main(String[] args)
  {
    try
    {
      final CuboidCalculator calculator = new CuboidCalculator(3.0, 2.0, 1.0);
      System.out.format("V: %.3f%n0: %.3f%nSPD: %.3f%n", 
        calculator.getVolume(), calculator.getSurface(), 
        calculator.getSpaceDiagonale()); 
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
