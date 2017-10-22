package chapter2;

/**
 * Created by anar on 9/18/17.
 */
public class IncrDecr {
    public static void main(String[] args) {
        int x, y;
        int ch;
        x = 10;
        y = ++x;

        System.out.println("x: " + x + ", y: " + y);

        x = 10;
        ch = x++;

        System.out.println("x: " + x + ", ch: " + ch);
    }

}
