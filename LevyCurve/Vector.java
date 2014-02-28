public class Vector extends Point {

public Vector(double x, double y) {
 super(x,y);
}

/**
 * The magnitude
 * @return the magnitude.
 */
public double getMagnitude() {
 return Math.sqrt(x*x+y*y);
}

/**
 * Creates a new vector that is perpendicular to this one, pointing to the right.
 * @return a new vector
 */
public Vector getPerpendicularRight() {
 return new Vector(-y, x);
}

/**
 * Creates a new vector that is perpendicular to this one, pointing to the left.
 * @return a new vector
 */
public Vector getPerpendicularLeft() {
 return new Vector(y, -x);
}

/**
 * Creates a new vector like this one but scaling both coordinates by d
 * @param d
 * @return a new vector
 */
public Vector multiplyBy(double d) {
 return new Vector(x*d, y*d);
}

}