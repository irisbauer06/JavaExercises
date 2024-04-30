package ue07.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author iris06
 */
public class CollectionTest
{
  /* VERSION 1
  public static void main(String[] args)
  {
    //Einfaches Bsp
    //Erzeugen von 10 ZZ, Speichern in Collection, Ausgeben
    //In Spitze Klammer kommt ein Klassenname
    //Double ist Klasse
    //Erzeugen der Collection
    
    final ArrayList<Double> liste = new ArrayList<>(); //Diamond Operator
    for (int i = 1; i<=10; i++)
    {
      final double zz = Math.random() * 200.0 + 50; // ZufallsZahl zwischen 50 und 250
      final Double wrapper = new Double(zz); // ...wrap
      liste.add(wrapper);
    }
    final Iterator<Double> iterator = liste.iterator();
    while (iterator.hasNext())
    {
      final Double wrapper = iterator.next();
      final double zz = wrapper.doubleValue(); // ...unwrap
      System.out.println(zz);
    }
  }*/
  public static void main(String[] args)
  {
    
    //Erzeugen der Collection
    final Collection<Double> liste = new ArrayList<>(); //Diamond Operator
    for (int i = 1; i<=10; i++)
      liste.add(Math.random() * 200.0 + 50);        //auto wrapping
      
     //"for-each"-Schleife
     for (Double  zz : liste) //liste iterieren wir
       System.out.println(zz);
     
    /*final Iterator<Double> iterator = liste.iterator();
    while (iterator.hasNext())
      System.out.println(iterator.next()); */
  }
}
