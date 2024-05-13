package nivennumber.data;

/**
 *
 * @author iris06
 */
public class NivenNumber
{
  private final int isNivenNumber;

  public NivenNumber(int isNivenNumber)
  {
    this.isNivenNumber = isNivenNumber;
  }

  public int getIsNivenNumber()
  {
    return isNivenNumber;
  }

  @Override
  public String toString()
  {
    return "NivenNumber{" + "isNivenNumber=" + isNivenNumber + '}';
  }
  
}
