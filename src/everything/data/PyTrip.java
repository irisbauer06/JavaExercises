package everything.data;

/**
 *
 * @author iris06
 */
public record PyTrip(int a, int b, int c)
  {
    @Override
    public String toString()
    {
      return String.format("%9d %9d %9d",a,b,c );
    }

}
