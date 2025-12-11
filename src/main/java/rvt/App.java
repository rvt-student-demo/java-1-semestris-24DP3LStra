package rvt;

import java.util.Scanner;

public class App {
    public static void main ( String[] args ){ 

            overloadedCounter c1 = new overloadedCounter(10);

            // Palielina par 1
            c1.increase();
            System.out.println("Value after increase(): " + c1.value());

            // Palielina par 5
            c1.increase(5);
            System.out.println("Value after increase(5): " + c1.value());

            // Samazina par 3
            c1.decrease(3);
            System.out.println("Value after decrease(3): " + c1.value());

            //palielina ar negatīvu skaitli
            c1.increase(-2);
            System.out.println("Value after increase(-2): " + c1.value());

            //samazina ar negatīvu skaitli
            c1.decrease(-4);
            System.out.println("Value after decrease(-4): " + c1.value());
    }
}







    //  Box smallBox = new Box(2.0, 3.0, 4.0);
    //     Box bigBox = new Box(5.0, 6.0, 7.0);

    //     System.out.println("Small box nests inside big box? " + smallBox.nests(bigBox));
    //     System.out.println("Big box nests inside small box? " + bigBox.nests(smallBox));

                
        // Student st1 = new Student("Jack");

        // PaymentCard paulsCard = new PaymentCard(20);
        // PaymentCard mattsCard = new PaymentCard(30);

        // paulsCard.eatHeartily();
        // System.out.println("Paul: "+ paulsCard);
        // mattsCard.eatAffordably();
        // System.out.println("Matt: "+ mattsCard);
        // paulsCard.addMoney(20);
        // System.out.println("Paul: "+ paulsCard);
        // mattsCard.eatHeartily();
        // System.out.println("Matt: "+ mattsCard);
        // paulsCard.eatHeartily();
        // System.out.println("Paul: "+ paulsCard);
        // mattsCard.addMoney(50);
        // System.out.println("Matt: "+ mattsCard);
        // }


// System.out.println(st1.name);
// // st1.group = "DP2-1";
// System.out.println(st1.group);
// Student st2 = new Student("Mike");
// System.out.println(st2.name);
// Student st3 = new Student("Jordan");
// System.out.println(st3.name);

// }
// }

// Scanner scanner = new Scanner(System.in);

// Statistics statistics = new Statistics();
// Statistics evenStat = new Statistics();
// Statistics unevenStat = new Statistics();

// System.out.println("Give numbers: ");
// while(true){
// int num = Integer.valueOf(scanner.nextLine());
// if (num == -1) {
// break;
// } else {
// statistics.addNumber(num);
// }

// if (num%2==0){
// evenStat.addNumber(num);
// } else{
// unevenStat.addNumber(num);
// }

// }
// System.out.println("Count: " + statistics.getCount());
// System.out.println("Sum: " + statistics.sum());
// System.out.println("Average: " + statistics.average());
// System.out.println("Sum of even numbers: "+ evenStat.sum());
// System.out.println("Sum of odd numbers: "+unevenStat.sum());
// }
