package chapter3;

/**
 * Created by anar on 10/5/17.
 * Demonstrate the do-while loop.
 */
public class DWDemo {
    public static void main(String[] args) throws java.io.IOException{

        char ch;
        do{
            System.out.println("Press a key followed by enter");
            ch = (char) System.in.read(); //get a char
        } while(ch != 'q');

    }
}
