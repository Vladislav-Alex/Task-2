package complex;

public class Complex {

    private double re, im;
    Complex(double re_, double im_) { 
        re = re_;
        im = im_;
    }

    public Complex plus(Complex comp) {
        return new Complex(re + comp.re, im + comp.im);
    } 
    public Complex minus(Complex comp) {
        return new Complex(re - comp.re, im - comp.im);
    }
    public Complex div(Complex comp) {
        return new Complex(re * comp.re - im * comp.im, re * comp.im + im * comp.re);
    }
    public Complex multipl(Complex comp) { 
        return new Complex(re * comp.re - im * comp.im, re * comp.im + im * comp.re);
    }

    public void toPrint() {
        System.out.println("Complex [re = " + re + ", im = " + im + "]");
    }
}

