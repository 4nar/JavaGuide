package chapter3;

/**
 * Created by anar on 10/5/17.
 * Use continue
 */
public class ContDemo {
    public static void main(String[] args) {
        for(int i=0; i <= 100; i++){
            if (i%2 != 0) continue;  //iterate
            System.out.println(i);
        }

    }

}
