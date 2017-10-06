package chapter2;

/**
 * A promotion surprise
 * Created by anar on 9/22/17.
 */
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; //No cast needed because result is already evaluated to int

        b = 10;
        b = (byte) (b * b); //Cast is needed here to assign an int to a byte

        System.out.println("i and b: " + i + " " + b);

    }
}
