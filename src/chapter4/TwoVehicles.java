package chapter4;

/**
 * Created by anar on 11/17/17.
 * This program creates two Vehicle objects
 */
public class TwoVehicles {
    public static void main(String[] args) {

        //minivan and sportscar refer to separate objects
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("MInivan can carry " + minivan.passengers + " with a range of " + range1 + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " miles");

    }
}
