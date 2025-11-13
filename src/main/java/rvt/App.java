package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);
    }
}

    //     Scanner scanner = new Scanner(System.in);

    //     Statistics statistics = new Statistics();
    //     Statistics evenStat = new Statistics();
    //     Statistics unevenStat = new Statistics();

    //     System.out.println("Give numbers: ");
    //     while(true){
    //         int num = Integer.valueOf(scanner.nextLine());
    //         if (num == -1) {
    //             break;
    //         } else {
    //             statistics.addNumber(num);
    //         }

    //         if (num%2==0){
    //             evenStat.addNumber(num);
    //         } else{
    //             unevenStat.addNumber(num);
    //         }

    //     }
    //     System.out.println("Count: " + statistics.getCount());
    //     System.out.println("Sum: " + statistics.sum());
    //     System.out.println("Average: " + statistics.average());
    //     System.out.println("Sum of even numbers: "+ evenStat.sum());
    //     System.out.println("Sum of odd numbers: "+unevenStat.sum());
    // }

