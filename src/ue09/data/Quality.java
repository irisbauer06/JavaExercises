package ue09.data;

/**
 *
 * @author iris06
 */
public enum Quality
{
  SD, HD_READY, FULL_HD, UHD;
  
  private String [] humanReadable =
  {
    "Standard Definiton", "HD Ready (1280x720)", 
    "Full HD (1920x1080)", "UHD 4k (3840x2160)"
  };
  
  @Override
  public String toString()
  {
    
    return humanReadable[ordinal()];
  }
}
