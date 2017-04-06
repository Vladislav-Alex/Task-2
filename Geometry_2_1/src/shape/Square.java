package shape;
import java.util.Scanner;

public class Square implements Geometry {
    double nums;
    Scanner in = new Scanner(System.in);
    Square() {
        System.out.print("¬ведите значение стороны a = ");
        nums = in.nextDouble();
    }
    public void GetPerimeter() {
        double Perimeter = nums * 4;
        System.out.println("Perimeter = a * 4 = " + Perimeter);
    }
    public void GetArea() {
        double Area = Math.pow(nums , 2);
        System.out.println("Area = a ^ 2 = " + Area);
        
    }
}

