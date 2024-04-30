package ue08.data;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author iris06
 */
public class PytTripListModel extends AbstractListModel<PytTrip>
{
  private final List<PytTrip> pytTrips;

  public PytTripListModel(List<PytTrip> pytTrips)
  {
    this.pytTrips = pytTrips;
  }
  
  @Override
  public int getSize()
  {
    return pytTrips.size();
  }

  @Override
  public PytTrip getElementAt(int index)
  {
    return pytTrips.get(index);
  }
  
}
