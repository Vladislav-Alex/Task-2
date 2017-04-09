package shape;

public class Square implements GeometryInterface {
    double a;
    double b;
    Square(double value_) {
        a = b = value_;
    }
    Square(double[] sideRec_) {
        a = sideRec_[0];
        b = sideRec_[1];
    }
    public void getPerimeter() {
        double perimeter = a * 4;
        System.out.println("Perimeter = a * 4 = " + perimeter);
    }
    public void getArea() {
        double area = a * b;
        System.out.println("Area = a * b = " + area);
    }
}

