package shape;
import java.util.Scanner;

public class Rectangle extends Square{
    double nums1;
    Scanner in = new Scanner(System.in);
    Rectangle() {
        System.out.print("¬ведите значение другой стороны b = ");
        nums1 = in.nextDouble();
    }
    public void GetPerimeter() {
        double Perimeter = (nums + nums1) * 2;
        System.out.println("Perimeter = (a + b) * 2 = " + Perimeter);
    }
    public void GetArea() {
        double Area = nums * nums1;
        System.out.println("Area = a * b = " + Area);
    }
}
