package stack;

import java.util.Random;

public class StackMain {
    private static final int COUNT = 10;
    final Random random = new Random();

    public static void main(String [] args) {
        ListStack stack = new ListStack();
        System.out.print("Push elem: ");
        for(int i = 0; i < COUNT; i++) {
            int num = (int)(Math.random() * 11);
            stack.push(num);
            System.out.print(num + " ");
        }
        System.out.print("\nPop elem: ");
        for(int i = 0; i < COUNT; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
