package chapter3;

/**
 * Created by anar on 10/4/17.
 * Use commas in a for statement
 */
public class Comma {
    public static void main(String[] args) {
        int i, j;

        for(i=0, j=10; i < j && i != 1; i++, j--){
//            Notice the two loop control variables
            System.out.println("i and j: " + i + " " + j);
        }
    }
}
