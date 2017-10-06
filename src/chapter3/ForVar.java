package chapter3;

/**
 * Created by anar on 10/4/17.
 * Declare loop control variable inside the for.
 */
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

//        compute the factorial of the numbers through 5
        for(int i = 1; i <= 5; i++){
//            the variable i is declared inside the for statement
            sum += i;
            fact *= i;
        }
//        but, i is not known here

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
