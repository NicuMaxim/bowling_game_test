package company;

import static company.BowlingGame.*;

public class DisplayScore {




    public static void displayScore() {

        System.out.println("---------------------------------------------------------------------------------");

         for (int j = 0; j < 21; j++)
        System.out.print("| " + allDeliveriesArray[j] + " ");


        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (scoreArray[i] < 10)
                System.out.print("|   " + scoreArray[i] + "   ");
            else

                if (scoreArray[i] > 99)

                    System.out.print("|  " + scoreArray[i] + "  ");

                else
                  System.out.print("|  " + scoreArray[i] + "   ");
        }

        System.out.println("|");
        System.out.println("---------------------------------------------------------------------------------");




    }

}
