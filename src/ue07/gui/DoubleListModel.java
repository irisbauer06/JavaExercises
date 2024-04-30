package ue07.gui;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author iris06
 */
public class DoubleListModel extends AbstractListModel<Double>
{
  private final List<Double> zahlen;
  public DoubleListModel(java.util.List<java.lang.Double> zahlen)
  {
    this.zahlen = zahlen;
  }
  
  @Override
  public int getSize()
  {
    return zahlen.size();
  }

  @Override
  public Double getElementAt(int index)
  {
    return zahlen.get(index);
  }
 
  
}
