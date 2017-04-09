import java.util.InputMismatchException;
import java.util.Scanner;

public class Complex_Test {
    public static void main(String[] args) {
        double[] nums1 = new double[2];
        double[] nums2 = new double[2];

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the real and imaginary parts of the first number");
            for(int i = 0; i < 2; i++){
                nums1[i] = in.nextDouble();
            }
            System.out.println("Enter the real and imaginary parts of the second number");
            for(int i = 0; i < 2; i++){
                nums2[i] = in.nextDouble();
            }

            Complex obl = new Complex(nums1[0], nums1[1]);
            Complex ob2 = new Complex(nums2[0], nums2[1]);
            System.out.println("Enter the needed operation +, -, *, /");
            switch(in.next()) {
              case "+":
                  obl.plus(ob2);
                  break;
              case "-":
                  obl.minus(ob2);
                  break;
              case "/":
                  obl.div(ob2);
                  break;
              case "*":
                  obl.multipl(ob2);
                  break;
              default:
                  break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered");
        }
    }
}
