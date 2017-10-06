package chapter2;

/**
 * Created by anar on 9/18/17.
 *
 * Side effects can be important
 */
public class SideEffects {

    public static void main(String[] args) {
        int i;

        i = 0;

        /* here, i is still incremented even though
           the if statement fails
         */
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //displays 1
        /*
           In this case, i is not incremented
           bcs the short-circuit operator
           skips the increment

         */
        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //still 1
    }
}
