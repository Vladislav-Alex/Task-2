public class Complex {

    private double re, im;
    Complex(double re_, double im_) { 
        re = re_;
        im = im_;
    }

    public void plus(Complex comp) {
        new Complex(re + comp.re, im + comp.im).toPrint();
    } 
    public void minus(Complex comp) {
        new Complex(re - comp.re, im - comp.im).toPrint();
    }
    public void div(Complex comp) {
        new Complex(re * comp.re - im * comp.im, re * comp.im + im * comp.re).toPrint();
    }
    public void multipl(Complex comp) { 
        new Complex(re * comp.re - im * comp.im, re * comp.im + im * comp.re).toPrint();
    }

    public void toPrint() {
        System.out.println("Complex [re = " + re + ", im = " + im + "]");
    }
}

