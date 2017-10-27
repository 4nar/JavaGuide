package chapter2;

/**
 * Created by anar on 10/24/17.
 */
public class CharAutoConv {
    public static void main(String[] args) {
        char a = 'a'; //16 bits
        int charToInt = a; //32
        long charToLong = a; //64
        float charToFloat = a; //32
        double charToDouble = a; //64

        System.out.println("int " + charToInt);
        System.out.println("long " + charToLong);
        System.out.println("float " + charToFloat);
        System.out.println("double " + charToDouble);



    }
}
