package chapter4;

/**
 * Created by anar on 11/17/17.
 * A program that uses the Vehicle class.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;


        //assign values to fields in minivan
        //Notice the use of the dot operator to access a member
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //compute a range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range + " miles");

    }
}
