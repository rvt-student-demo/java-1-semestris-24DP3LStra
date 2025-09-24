package rvt;

import java.util.Scanner;

public class additions {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number: ");   
    int skaitlis1 = Integer.valueOf(scanner.nextLine());
    
    System.out.println("Give the second number: ");   
    int skaitlis2 = Integer.valueOf(scanner.nextLine());

    System.out.println(skaitlis1 + " + " + skaitlis2 + " = " + (skaitlis1 + skaitlis2));
    scanner.close();
    
    }
    
}
