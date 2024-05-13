package perfektezahl.data;

import java.util.List;
import javax.swing.AbstractListModel;


/**
 *
 * @author iris06
 */
public class PerfekteZahlListModel extends AbstractListModel<PerfekteZahl>
{
  private final List<PerfekteZahl> perfekteZahlen;

  public PerfekteZahlListModel(List<PerfekteZahl> perfekteZahlen)
  {
    this.perfekteZahlen = perfekteZahlen;
  }
  
  @Override
  public int getSize()
  {
    return perfekteZahlen.size();
  }

  @Override
  public PerfekteZahl getElementAt(int index)
  {
    return perfekteZahlen.get(index);
  }
  
}
