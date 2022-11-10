public class CircleWithPrivateDataFields {
  /** The radius of the circle */
  private double radius = 1;

  /** The number of the objects created */
  // private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithPrivateDataFields() {

  }

  /** Construct a circle with a specified radius */
  public CircleWithPrivateDataFields(double newRadius) {
    radius = newRadius;
    // numberOfObjects++;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {

    if (newRadius >= 0)
      this.radius = newRadius;
    else
      this.radius = 0 ;

    // radius = (newRadius >= 0) ? newRadius : 0;

  }

  /** Return numberOfObjects */
 /* public static int getNumberOfObjects() {
    return numberOfObjects;
  }*/

  /** Return the area of this circle */
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}
