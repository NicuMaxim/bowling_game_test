package company;

import static company.BowlingGame.*;
import static company.Deliveries.*;


public class Strike {


      static int thisRoundNumStrike;




    static   public void setStrikeScore(int round) {

            thisRoundNumStrike = round;
            delivery++;
            allDeliveriesArray[delivery++] = "x";

            totalScore += 10;
            scoreArray[thisRoundNumStrike] = totalScore;


        }


     static   public void addStrikeScore() {

            totalScore += firstDelivery + secondDelivery;

            scoreArray [thisRoundNumStrike] = totalScore;

            afterStrike = false;


         }



    static   public void strikeAfterSpare() {

        System.out.println("Bravo! A Strike after Spare!");

        thisRoundNumStrike = round;
        delivery++;
        allDeliveriesArray[delivery++] = "x";

        totalScore += firstDelivery;

        scoreArray [thisRoundNumStrike-1] = totalScore;

        afterSpare = false;


        totalScore += 10;
        scoreArray[thisRoundNumStrike] = totalScore;



    }





}
