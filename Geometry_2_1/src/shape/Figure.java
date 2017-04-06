package shape;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Figure {
 
    public static void main(String[] args) throws IOException
    {
        System.out.print("������� ����� ������ \n" + "������� - 1\n"
                                                   + "���������� - 2\n"
                                                   + "����������� - 3\n"
                                                   + "������������� - 4\n");
        try {
            Scanner in = new Scanner(System.in);
        int repeat = 4;
        while (repeat > 0) {
            selectFigure(in.nextInt());

            System.out.println("������ ����������? (���� ���, ������� No)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            if(str.equalsIgnoreCase("NO")) {
                break;
            }
            repeat--;
        }
        in.close();
        } catch (InputMismatchException e) {
            System.out.println("������� ������������ ��������");
        }
    }

    static void selectFigure(int figure) {
        switch(figure) {
            case 1:
                Geometry square = new Square();
                square.GetPerimeter();
                square.GetArea();
                break;

            case 2:
                Geometry circle = new �ircle();
                circle.GetPerimeter();
                circle.GetArea();
                break;

            case 3:
                Geometry triangle = new Triangle();
                triangle.GetPerimeter();
                triangle.GetArea();
                break;

            case 4:
                Geometry rectangle = new Rectangle();
                rectangle.GetPerimeter();
                rectangle.GetArea();
                break;

            default:
                System.out.print("�������� ��� ��� \n");
                break;
        }
    }
}