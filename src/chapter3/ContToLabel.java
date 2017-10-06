package chapter3;

/**
 * Created by anar on 10/5/17.
 * Use continue with a label.
 */
public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i=1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i +
                            ", Inner loop: ");

            for(int j =1 ; j < 10; j++){
                if(j == 5) continue outerloop; //continue outerloop
                System.out.print(j);
            }
        }
    }
}

//Outer loop pass 1, Inner loop: 1234
//Outer loop pass 2, Inner loop: 1234
//...
//Outer loop pass 9, Inner loop: 1234