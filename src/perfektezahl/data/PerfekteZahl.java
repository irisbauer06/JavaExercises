package perfektezahl.data;

/**
 *
 * @author iris06
 */
public class PerfekteZahl
{
  private final int zahlen;

  public PerfekteZahl(int zahlen)
  {
    this.zahlen = zahlen;
  }

  public int getZahlen()
  {
    return zahlen;
  }

  @Override
  public String toString()
  {
    return String.format("%9d", zahlen);
  }
}
