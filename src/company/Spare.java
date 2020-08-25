package company;

import static company.BowlingGame.*;
import static company.Deliveries.*;



public class Spare {


    static int thisRoundNumSpare;


   static public void setSpareScore(int round) {


        thisRoundNumSpare = round;
        allDeliveriesArray[delivery++] = "/";


    }


    static public void addSpareScore() {


       totalScore += firstDelivery;

       scoreArray [thisRoundNumSpare] = totalScore;

       afterSpare = false;


    }


    static public void whenTwoSpares ( int round) {

        System.out.println("Bravo! Two Spares in a row!");

        allDeliveriesArray[delivery++] = "/";

        thisRoundNumSpare = round;

        scoreArray [thisRoundNumSpare-1] += firstDelivery;


    }



}
