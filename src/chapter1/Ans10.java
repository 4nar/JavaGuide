package chapter1;

/**
 * Created by anar on 9/22/17.
 * Write a program that finds all of the prime numbers between 2 and 100.
 */
public class Ans10 {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for(i=2; i<100; i++){
            isprime = true;

            for(j=2; j < i; j++){
                if (i%j == 0)
                    isprime = false;
            }
            if (isprime)
                System.out.println(i + " is prime");

        }

    }


}
