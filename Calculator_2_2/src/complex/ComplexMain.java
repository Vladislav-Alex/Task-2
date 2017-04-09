package complex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexMain {
    public static void main(String[] args) {
        int SIZE = 2;
        double[] nums1 = new double[SIZE];
        double[] nums2 = new double[SIZE];

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the real and imaginary parts of the first number");
            for(int i = 0; i < SIZE; i++){
                nums1[i] = in.nextDouble();
            }
            System.out.println("Enter the real and imaginary parts of the second number");
            for(int i = 0; i < SIZE; i++){
                nums2[i] = in.nextDouble();
            }
            Complex result = new Complex(0.0, 0.0);
            Complex obl = new Complex(nums1[0], nums1[1]);
            Complex ob2 = new Complex(nums2[0], nums2[1]);
            System.out.println("Enter the needed operation +, -, *, /");
            switch(in.next()) {
              case "+":
                   result = obl.plus(ob2);
                   break;
              case "-":
                  result = obl.minus(ob2);
                  break;
              case "/":
                  result = obl.div(ob2);
                  break;
              case "*":
                  result = obl.multipl(ob2);
                  break;
              default:
                  break;
            }
            result.toPrint();
            in.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered");
        }
    }
}
