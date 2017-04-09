package shape;

public class Triangle implements GeometryInterface {
    double[] nums = new double[4];
    Triangle(double[] nums_) {
        for (int i = 0; i < nums_.length; i++) {
            nums[i] = nums_[i];
        }
    }
    public void getPerimeter() {
        double perimeter = (nums[1] + nums[2] + nums[3]);
        System.out.println("Perimeter = (a+b+c) = " + perimeter);
    }
    public void getArea() {
        double area = 0.5 * nums[0] * nums[1];
        System.out.println("Area = 1 / 2 * a * h = " + area);
    }
}

