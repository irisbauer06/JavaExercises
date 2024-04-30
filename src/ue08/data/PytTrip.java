package ue08.data;

/**
 *
 * @author iris06
 */
public record PytTrip(int a, int b, int c)
  {
    @Override
    public  String toString()
    {
      return String.format("%9d %9d %9d", a, b, c);
    }
    
}
