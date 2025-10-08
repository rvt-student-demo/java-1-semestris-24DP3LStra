package rvt;

import java.util.Scanner;

public class Sumofseq {
    public static void main(String[] args) {
        // Your code goes here...

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int n_number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");
        int n_number = Integer.valueOf(scanner.nextLine());

        int sumof_n = 0;
        for (int i = n_number1; i <= n_number; i += 1){

            sumof_n += i;
            
        }
        System.out.println("The sum is "+sumof_n);
        scanner.close();
}
}
