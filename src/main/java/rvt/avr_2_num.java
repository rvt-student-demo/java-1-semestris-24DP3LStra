package rvt;

import java.util.Scanner;

public class avr_2_num {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int skaitlis1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int skaitlis2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int skaitlis3 = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is " + (((double)skaitlis1 + skaitlis2 + skaitlis3)/3));

        scanner.close();

    }
}
