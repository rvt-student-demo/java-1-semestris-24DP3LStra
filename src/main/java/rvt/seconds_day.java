package rvt;

import java.util.Scanner;

public class seconds_day {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("You gave " + number + " days");
        
        int sekundes = number * 24 * 60 * 60;
        System.out.println("Your days converted into seconds is: " + sekundes);
        scanner.close();

    }
    
}
