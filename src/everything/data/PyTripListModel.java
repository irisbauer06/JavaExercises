package everything.data;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author iris06
 */
public class PyTripListModel extends AbstractListModel<PyTrip>
{
  private final List<PyTrip> pyTrips;

  public PyTripListModel(List<PyTrip> pyTrips)
  {
    this.pyTrips = pyTrips;
  }

  @Override
  public int getSize()
  {
    return pyTrips.size();
  }

  @Override
  public PyTrip getElementAt(int index)
  {
    return pyTrips.get(index);
  }
  
}
