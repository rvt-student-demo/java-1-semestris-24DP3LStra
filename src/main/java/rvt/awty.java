package rvt;

import java.util.Scanner;

public class awty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_num = 0;
        int sum_num = 0;
        while (true) {
            System.out.println("Give a number: ");
            int command = Integer.valueOf(scanner.nextLine());
            
            if (command != 0) {
                sum_num +=  command;
                count_num += 1;
            }

            if (command == 0) {
                break;
            }
            
        }
        System.out.println("Number of numbers: "+ count_num);
        System.out.println("Sum of the numbers: "+ sum_num);

        scanner.close();
    }
}
