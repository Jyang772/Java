public class Point  {

public double x;
public double y;

/**
 * We return the nearest int to the current x value.
 * By keeping points as double we increase the precision of the final plot.
 * We only convert to int when absolutely necessary, that is, when plotting on screen.
 * @return
 */
public int getX() {
 return (int) Math.round(x);
}

public int getY() {
 return (int) Math.round(y);
}

public Point(int x, int y) {
 this.x = x;
 this.y = y;
}

public Point(double x, double y) {
 this.x = x;
 this.y = y;
}

public String toString() {
 return x + "," + y;
}

/**
 * Make a vector from this point to other
 * @param other
 * @return a new Vector
 */

public Vector getVectorTo(Point other) {
 return new Vector(other.x - x,other.y - y);
}

/**
 * Returns a Point that lies midway on the line between this point and other
 * @param other
 * @return a new Point
 */
public Point getMidPoint(Point other) {
 return new Point((x + other.x)/ 2, (y +other.y)/ 2);
}

/**
 * Move this point by vector v.
 * @param v
 * @return a new Point
 */
public Point addVector(Vector v) {
 return new Point(x + v.x, y + v.y);
}

}

