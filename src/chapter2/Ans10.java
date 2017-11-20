package chapter2;

/**
 * Created by anar on 11/13/17.
 */
public class Ans10 {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;
        for (i = 2; i < 100; i++){
            isPrime = true;
            // see if the number is evenly divisible
            for (j = 2; j <= i/j; j++) {
                // if it is, then its not prime
                if (i%j==0){
                    isPrime = false;
                }

            }
            if (isPrime){
                System.out.println(i + " is prime");
            }
        }
    }

//    public static void main(String[] args) {
//        int i, j;
//        boolean isprime;
//
//        for(i=2; i<100; i++){
//            isprime = true;
//
//            for(j=2; j < i; j++){
//                if (i%j == 0)
//                    isprime = false;
//            }
//            if (isprime)
//                System.out.println(i + " is prime");
//
//        }
//
//    }
}
