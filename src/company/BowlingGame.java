package company;

import java.util.Arrays;
import static company.DisplayScore.displayScore;

import java.io.*;
import java.util.Scanner;


public class BowlingGame {


    static int [] scoreArray = new int[10];
    static int round = 0;

    static String [] allDeliveriesArray = new String [21];
    static int delivery = 0;

    static int totalScore = 0;

    static String name;




    public static void main(String[] args) {

	// Test OpenLM - Bowling Game



            Arrays.fill(scoreArray, 0);
            Arrays.fill(allDeliveriesArray, " ");


            System.out.println("\n================BOWLING GAME TEST================\n");

            System.out.println("Здравствуйте! Предлагаем вам сыграть одну партию в боулинг.\n" +
                    "Вы играете один. Просто вводите количество сбитых вами кеглей после каждого броска.\n" +
                    "Не забывайте, что всего перед Вами 10 кеглей в каждом раунде.");

            System.out.println("\nВам предстоит 10 увлекательных раундов. Наберите больше всех очков!\n");

            System.out.println("Введите Ваше имя:");

            Scanner conin = new Scanner(System.in);
            if (conin.hasNextLine())
                name = conin.nextLine();

            System.out.println("Начинаем игру " + name + "!\n");


            Round r1 = new Round(round);
            r1.play();
            round++;

            Round r2 = new Round(round);
            r2.play();
            round++;

            Round r3 = new Round(round);
            r3.play();
            round++;

         Round r4 = new Round(round);
        r4.play();
        round++;

        Round r5 = new Round(round);
        r5.play();
        round++;

        Round r6 = new Round(round);
        r6.play();
        round++;

        Round r7 = new Round(round);
        r7.play();
        round++;

        Round r8 = new Round(round);
        r8.play();
        round++;

        Round r9 = new Round(round);
        r9.play();
        round++;

       Round r10 = new Round(round);
        r10.play();
        round++;


            displayScore();


            System.out.println("Молодец " + name + "! Вы набрали " + totalScore + " очков.");


            // записываем новый рекорд. выводим старые рекорды


            String str = "\n\t\t\t\t\t" + name + " : " + totalScore;
            String str2;


            try (BufferedWriter bw = new BufferedWriter(new FileWriter("score.txt", true))) {


                bw.write(str);  // записали рекорд
            } catch (IOException exp) {
                System.out.println("I/O Exception: " + exp);
            }


            // читаем все рекорды


            System.out.println("\n\n\t\t\t=====ТАБЛИЦА РЕКОРДОВ=====");


            try (BufferedReader br = new BufferedReader(new FileReader(new File("score.txt")))) {


                str2 = br.readLine();

                while (str2 != null) {
                    System.out.println(str2);

                    str2 = br.readLine();
                }

            } catch (IOException exp) {
                System.out.println("I/O Exception: " + exp);
            }



           System.out.println("Good bye!");



    }
}


