package chapter2;

/**
 * Created by anar on 9/19/17.
 *
 * Demonstrate automatic conversion from long to double
 */
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 1001123285L;
        D = L;

//        D = 1001123285.0;
//        L = D;

        System.out.println("L and D: " + L + " " + D);
    }
}
