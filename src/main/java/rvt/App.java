package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Your code goes here...

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int skaitlis1 = Integer.valueOf(scanner.nextLine());

        if (skaitlis1 > 0) {
            System.out.println("The number is positive.");

        }
        else {
            System.out.println("The number is negative.");
        }
        scanner.close();
    }
}
