package Java102;

import java.util.ArrayList;

public class Point {
    double x;
    double y;

    public Point(double xAverage, double yAverage) {
       this.x = xAverage;
       this.y = yAverage; 
    }

    public Point translationx(int t) {
        return new Point(x + t, y);
    }

    public Point translatey(int t) {
        return new Point(x + t, y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    public static Point centerOfMass(Point[] points) {
        double xSum = 0.0;
        double ySum = 0.0;
        for (int i = 0; 1 < points.length; i ++) {
            xSum += points[i].x;
            ySum += points[i].y; 
            }
        double xAverage = xSum / points.length;
        double yAverage = ySum / points.length;
        return new Point(xAverage, yAverage);
        }

    public Point rotate(double theta) {
        double original_radian = Math.atan2(y, x); 
        double original_angle = Math.toDegrees(original_radian);
        
        double new_angle = original_angle + theta;
        double new_radian = Math.toRadians(new_angle);

        double y_value = Math.sin(new_radian);
        double x_value = Math.cos(new_radian);

        return new Point(x_value, y_value);
    }

}