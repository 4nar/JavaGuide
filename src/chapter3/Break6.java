package chapter3;

/**
 * Created by anar on 10/5/17.
 * Where you put a label is important
 */
public class Break6 {
    public static void main(String[] args) {
        int x=0, y=0;

//        here put label before for statement.

        stop1: for(x=0; x < 5; x++){
            for(y=0; y < 5; y++){
                if(y == 2) break stop1;
                System.out.println("x and y: " + x +" " + y);
            }
        }
        System.out.println();
//        x and y 0 0
//        x and y 0 1



//        now, put label immeadiately before {
        for(x=0; x < 5; x++)
            stop2: {
            for(y=0; y < 5; y++){
                if(y == 2) break stop2;
                System.out.println("x and y: " + x + " " + y);
            }
            }

//        x and y 0 0
//        x and y 0 1
//        x and y 1 0
//        x and y 1 1

//        ...
    }
}
