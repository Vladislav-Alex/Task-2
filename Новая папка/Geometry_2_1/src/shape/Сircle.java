package shape;
import java.util.Scanner;

public class Ñircle implements Geometry{
    double radius;
    double p = 3.14;
    Scanner in = new Scanner(System.in);
    Ñircle() {
        System.out.print("Enter the radius : radius = ");
        radius = in.nextDouble();
    }
    public void GetPerimeter() {
        double Perimeter = 2 * p * radius;
        System.out.println("Perimeter = 2 * p * radius = " + Perimeter);
    }
    public void GetArea() {
        double Area = Math.pow(radius, 2)*p;
        System.out.println("Area = radius ^ 2 * p =" + Area);
    }
}

