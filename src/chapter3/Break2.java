package chapter3;

/**
 * Created by anar on 10/5/17.
 * Read input until a q is received
 */
public class Break2 {
    public static void main(String[] args) throws java.io.IOException{
        char ch;

        for(;;){
            ch = (char) System.in.read();
            if (ch=='q') break;

        }
        System.out.println("YOu pressed q!");

    }

}
