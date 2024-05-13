package nivennumber.data;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author iris06
 */
public class NivenListModel extends AbstractListModel<NivenNumber>
{
  private final List<NivenNumber> nivenNumbers;

  public NivenListModel(List<NivenNumber> nivenNumbers)
  {
    this.nivenNumbers = nivenNumbers;
  }

  @Override
  public int getSize()
  {
    return nivenNumbers.size();
  }

  @Override
  public NivenNumber getElementAt(int index)
  {
    return nivenNumbers.get(index);
  }
  
}
