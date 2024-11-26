package vivi.ueben;
import java.lang.Math;
 

/**
 *
 * @author iris06
 */
public class Rectangle
{
  //Datenelemente
  private Point point1, point2;
  
  //Konstruktor
  public Rectangle(Point point1, Point point2)
  {
    this.point1 = point1;
    this.point2 = point2;
  }
  
  //Methode zum ermitteln der Breite
  //die Breite als Betrag der Differenz 
  //zwischen den x-Koordinaten der Punkte
  public int getWidth() {
        return Math.abs(point2.getX() - point1.getX());
    }
  //Methode zum ermitteln der Höhe
    public int getHeight() {
        return Math.abs(point2.getY() - point1.getY());
    }
  //Methode zum Berechnen der Fläche
    public int getArea() {
        return getWidth() * getHeight();
    }
    
    public void draw() {
        int width = getWidth(); // Breite des Rechtecks
        int height = getHeight(); // Höhe des Rechtecks

        // Keine Zeichnung, wenn Breite oder Höhe 0 ist
        if (width == 0 || height == 0) {
            System.out.println("Keine Zeichnung möglich");
            return;
        }

        // Horizontale obere Linie
        System.out.println("  " + "-".repeat(width * 2 + 2)); //repeat wiederholt die Strings

        // Vertikale Linien für die Seiten des Rechtecks
        for (int i = 0; i < height; i++) {
            System.out.println("  |" + " ".repeat(width * 2) + "|");
        }

        // Horizontale untere Linie
        System.out.println("  " + "-".repeat(width * 2 + 2)); //Angenommen, Breite ist 4, dann entstehen
                                                              //vier * zwei (Weil pro Einheit zwei "-" verwendet werden) "-"
                                                              //und zwei extra Leerzeilen am Beginn der Zeile
    }
}
