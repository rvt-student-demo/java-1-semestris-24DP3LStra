package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Your code goes here...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int n_number = Integer.valueOf(scanner.nextLine());

        int sum_n = 0;
        int sumof_n = 0;
        for (int number = 0; number < n_number; number += 1){
            sum_n +=1;
            sumof_n += sum_n;
            
        }
        System.out.println("The sum is "+sumof_n);
        scanner.close();
    }
}
