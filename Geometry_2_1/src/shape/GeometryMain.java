package shape;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeometryMain {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter figure number \n" + "Square - 1\n"
                                                  + "Circle - 2\n"
                                                  + "Triangle - 3\n"
                                                  + "Rectangle - 4\n");
        try {

            int repeat = 5;
            String figure = in.next();
            while (repeat > 0) {
                selectFigure(figure);
                System.out.println("\nYou have " + repeat + " attempts to select apropriate figure." +
                                   " If you want to finish enter No");
                figure = in.next();
                if(figure.equalsIgnoreCase("NO")) {
                    break;
                }
                repeat--;
            }
            in.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered.");
        }
    }

    static void selectFigure(String figure) {
        double value;
        switch(figure) {
            case "1":
                System.out.print("Enter the value of the side a = ");
                value = in.nextDouble();
                GeometryInterface square = new Square(value);
                square.getPerimeter();
                square.getArea();
                break;

            case "2":
                System.out.print("Enter the radius : radius = ");
                value = in.nextDouble();
                GeometryInterface circle = new Circle(value);
                circle.getPerimeter();
                circle.getArea();
                break;

            case "3":
                double[] array = new double[4];
                System.out.println("Enter the height values h, the base - a, and the sides b , c ");
                for(int i = 0; i < 4; i++){
                    array[i] = in.nextDouble();
                }
                GeometryInterface triangle = new Triangle(array);
                triangle.getPerimeter();
                triangle.getArea();
                break;

            case "4":
                double[] sideRec = new double[2];
                System.out.println("Enter the value of side a, b ");
                for(int i = 0; i < 2; i++){
                    sideRec[i] = in.nextDouble();
                }
                GeometryInterface rectangle = new Rectangle(sideRec);
                rectangle.getPerimeter();
                rectangle.getArea();
                break;

            default:
                System.out.println("Try once again.");
                break;
        }
    }
}
