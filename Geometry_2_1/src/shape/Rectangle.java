package shape;

public class Rectangle extends Square {
    double[] sideRec = new double[2];
    Rectangle(double[] sideRec_) {
        super(sideRec_);
        for(int i = 0; i < sideRec_.length; i++){
            sideRec[i] = sideRec_[i];
        }
    }
    public void getPerimeter() {
        double perimeter = (sideRec[0] + sideRec[1]) * 2;
        System.out.println("Perimeter = (a + b) * 2 = " + perimeter);
    }
}

