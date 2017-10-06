package chapter1;

/**
 * Created by anar on 9/12/17.
 *
 * Demonstrate a block of code.
 */
public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 0;
        j = 10;

        // the target of this if is a block
        if(i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
