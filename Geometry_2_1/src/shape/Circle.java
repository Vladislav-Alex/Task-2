package shape;

public class Circle implements GeometryInterface{
    double radius;
    double p = 3.14;
    Circle(double radius_) {
        radius = radius_;
    }
    public void getPerimeter() {
        double perimeter = 2 * p * radius;
        System.out.println("Perimeter = 2 * p * radius = " + perimeter);
    }
    public void getArea() {
        double area = Math.pow(radius, 2) * p;
        System.out.println("Area = radius ^ 2 * p = " + area);
    }
}

