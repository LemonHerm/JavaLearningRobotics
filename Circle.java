package JAVA102;

public class Circle {
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}

    public static Circle fromPoints(Point p1, Point p2, Point p3) {
        double determinants = 2 * (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y))

        double centerX = ((Math.pow(p1.x, 2) + Math.pow(p1.y, 2)) * (p2.y - p3.y) + (Math.pow(p2.x, 2) + Math.pow(p2.y, 2)) * (p3.y - p1.y)+ (Math.pow(p3.x, 2) + Math.pow(p3.y, 2)) * (p1.y - y2)) / determinants;
    
        double centerY = ((Math.pow(p1.x, 2) + Math.pow(p1.y, 2)) * (p3.x - p2.x)+ (Math.pow(p2.x, 2) + Math.pow(p2.y, 2)) * (p1.x - p3.x)+ (Math.pow(p3.x, 2) + Math.pow(p3.y, 2)) * (p2.x - p1.x)) / d;
        
        double radius = Math.hypot(centerX - p1.x, centerY - p1.y);
    
        Point Center = Point(centerX, centerY);

        return new Circle(Center, radius);
    }
}
