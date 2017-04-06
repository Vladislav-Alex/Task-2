package shape;
import java.util.Scanner;

public class Triangle implements Geometry {
    double[] nums = new double[4];
    Scanner in = new Scanner(System.in);
    Triangle() {
        System.out.println("¬ведите значени€ высоты h и основани€ a, и сторон b , c");

        for(int i = 0; i < 4; i++){
            nums[i] = in.nextDouble();
        }
    }
    public void GetPerimeter() {
        double Perimeter = (nums[1] + nums[2] + nums[3]);
        System.out.println("Perimeter = (a+b+c) =" + Perimeter);
    }
    public void GetArea() {
        double Area = 0.5*nums[0]*nums[1];
        System.out.println("Area = 1/2*a*h =" + Area);
    }
}

