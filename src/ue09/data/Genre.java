package ue09.data;

import org.eclipse.paho.client.mqttv3.util.Strings;

/**
 *
 * @author iris06
 */
public enum Genre
{
  ACTION, DRAMA, THRILLER, WAR, SCIENCEFICTION, FANTASY, CRIME, BIOGRAPHY, ANIMATION,
  DOCUMENTATION, HORROR, COMEDY, MUSIC, ROMANCE, WESTERN;
  
  private String [] humanReadable =
  {
    "Actionfilm", "Drama", "Thriller", "Kriegsfilm", "Science Fiction", 
    "Fantasyfilm", "Krimi", "Biographie", "Animationsfilm", 
    "Dokumentation", "Horrorfilm", "Komödie", 
    "Musikfilm", "Romanze", "Westernfilm"
  };
  
  @Override
  public String toString()
  {
    
    return humanReadable[ordinal()];
  }
  
}
