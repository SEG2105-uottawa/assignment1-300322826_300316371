/**
 * This class contains instances of coordinates in cartesian format.
 * It also provides the utilities to convert them into polar
 * format. It is not an optimal design, it is used only to
 * illustrate some design issues.
 *
 * Edited base on the class PointCP.java
 */
public class PointCP3 extends PointCP5{
    //Instance variables ************************************************


    /**
     * Contains the current value of x
     */
    private double x;

    /**
     * Contains the current value of y
     */
    private double y;


    //Constructors ******************************************************
    /**
     * Constructs a coordinate object
     */
    public PointCP3(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    //Instance methods **************************************************


    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRho()
    {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta()
    {
        return Math.toDegrees(Math.atan2(y, x));
    }


    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP2 pointB) {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP5 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP3(
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }


    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as " + "Cartesian  (" + getX() + "," + getY() + ")" + "\n";
    }

}
