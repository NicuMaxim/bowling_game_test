package company;

import java.util.Scanner;
import static company.Round.*;


public class Deliveries {

    static boolean strike = false;
    static boolean afterStrike = false;

    static boolean spare = false;
    static boolean afterSpare = false;

    int roundSum = 0;

   static int firstDelivery;
   static int secondDelivery;



        public void  delivery1 () {                 // первый бросок

            System.out.println("\tRound " + (roundNum+1) + "\n" + "1st delivery: ");

            Scanner conin = new Scanner(System.in);
            if (conin.hasNext())
                firstDelivery = conin.nextInt();

            if (firstDelivery == 10) strike = true;
                else
                roundSum += firstDelivery;

        }



    public void  delivery2 () {                         // второй бросок

        System.out.println("2nd delivery: ");



        Scanner conin = new Scanner(System.in);
        if (conin.hasNext())
            secondDelivery = conin.nextInt();

        roundSum += secondDelivery;

        if (roundSum == 10)
            spare = true;

    }




        public void roundDisplay() {                   // результаты раунда

            if (strike == true) {
                System.out.println("STRIKE in Round " + (roundNum+1) + "!");
                strike = false;
                afterStrike = true;                                 }

            else
                if (spare == true) {
                    System.out.println("SPARE in Round " + (roundNum + 1) + "!");
                    spare = false;                                                   /// оно не тут должно стоять!!!
                    afterSpare = true;
                }
                    else
            System.out.println("You scored " + roundSum + " in Round " + (roundNum+1));

        }






}
