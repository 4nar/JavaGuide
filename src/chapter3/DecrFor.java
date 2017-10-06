package chapter3;

/**
 * Created by anar on 10/4/17.
 * A negative running for loop
 */
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for(x=100; x > -100; x -= 5){
            // Loop contorol variable is decremented by 5 each time
            System.out.println(x);
        }
    }
}
