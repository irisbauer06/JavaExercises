package vivi.ueben;

/**
 *
 * @author iris06
 */
public class Point {
    private int x;
    private int y;

    //Konstruktor zur Initialisierung eines Punktes mit
    //den gegebenen x- und y-Koordinaten
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }
    
    
    public void setX(int x) {
        this.x = x;
    }

    
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

