package company;


import static company.BowlingGame.*;
import static company.Deliveries.*;
import static company.Strike.*;
import static company.Spare.*;



public class Round {


    static int roundNum;


    Round(int n) {
        roundNum = n;
    }        // конструктор




    public void play() {                              // запуск раунда

            Deliveries d = new Deliveries();

            // 1 бросок

        d.delivery1();

        if (strike == true && afterSpare == true ) {   // если страйк после спэр

            strikeAfterSpare();

        }


        else if (strike == true) {                   // если Страйк

            setStrikeScore(roundNum);
        }

        else  {                               // если обычные броски
        allDeliveriesArray[delivery++] = String.valueOf(firstDelivery);



            // 2 бросок

        d.delivery2();


            if (spare == true && afterSpare == true) {           // если Спэйр и сейчас и в прошлом

                whenTwoSpares (roundNum);


            } else  if (spare == true)                           // если Спэйр

                setSpareScore(roundNum);


            else

        allDeliveriesArray[delivery++] = String.valueOf(secondDelivery);    // если ничего не было




            if (afterStrike == true) {                  // если в прошлом раунде был страйк

                addStrikeScore();
            }


            if (afterSpare == true) {                  // если в прошлом раунде был спэйр

                addSpareScore();
            }



        totalScore += d.roundSum;
        scoreArray[roundNum] = totalScore;  }




        d.roundDisplay();

        System.out.println();

}

}
