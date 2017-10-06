package chapter3;

/**
 * Created by anar on 10/6/17.
 * A PROGRAM THAT READS CHARACTERS FROM THE KEYBOARD UNTIL A PERIOD IS RECEIVED.
 * HAVE THE PROGRAM COUNT THE NUMBER OF SPACES.
 * REPORT THE TOTAL AT THE END OF THE PROGRAM
 */
public class Ans1 {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        int spaces = 0;
        System.out.print("Press period to stop: ");
        do{
            ch = (char) System.in.read();
            if(ch == ' ') spaces++;
//            spaces++;
        } while(ch!='.');
        System.out.println("Spaces: " + spaces);
    }

}
