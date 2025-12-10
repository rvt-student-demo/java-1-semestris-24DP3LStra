package rvt;

import java.util.*;

public class Chapter44 {
    public static void main(String[] args){
        //Testejam uzdevumu metodes seit
        ex6();
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        
        String name = String.valueOf(scanner.nextLine());

        //iznem liekas atstarpes
        name = name.trim();

        //izskaita kurs index ir atstarpe
        int spaceIndex = name.indexOf(" ");


        //atrod firstName un lastName, tos sadala
        if (spaceIndex > 0){
            String firstName = name.substring(0, spaceIndex); // visi burti no varda no 0 indeksa lidz atstarpes indeksam
            String lastName = name.substring(spaceIndex + 1);

            //uzvardu parvers uz UpperCase
            lastName = lastName.toUpperCase();

            //izprinte vards + atstarpe + uzvards
            System.out.println(firstName + " " + lastName);
        }

        // ja ir tikai vards un nav uzvards tad tikai izprinte vardu
        else{
            System.out.println(name);
        }


    }    
    public static void ex2(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String name = String.valueOf(scanner.nextLine());

        //atstarpe lai atdaliitu tekstus
        System.out.println("");

        //parbauda lai nebutu varda liekas atstarpes pirms printesanas
        name = name.trim();

        int skaitlis = 0;

        while (skaitlis < name.length()){
            System.out.println(name.charAt(skaitlis));
            skaitlis += 1;
        }
    }    
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(" "); // Atstarpe lai ir saskatami
            System.out.println("Enter a name: ");

            String name = String.valueOf(scanner.nextLine());
            name = name.trim();

            if (name.length() == 0){
                break;
            }

            if (name.startsWith("Amy")|| name.startsWith("Buffy") || name.startsWith("Cathy")){
                System.out.println("Ms. "+ name);
            }

            else if (name.startsWith("Elroy")|| name.startsWith("Fred") || name.startsWith("Graham")){
                System.out.println("Mr. "+name);
            }
            else{
                System.out.println(name);
            }
        }


    }    
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cook time: ");

        String timer = String.valueOf(scanner.nextLine());
        timer = timer.trim();

        if (timer.length() == 2){
            System.out.println("Your time-> "+ "0:"+timer);
        }
        else{
            String seconds = timer.substring(timer.length() - 2);
            String minutes = timer.substring(0, timer.length()-2);

            System.out.println(minutes+":"+seconds);
        }
    }    
    public static void ex5(){
        //nepildit, jo nav macits vel
    }    
    public static void ex6(){
        Scanner scanner = new Scanner(System.in);
        boolean der = false;

        while (!der) {
            System.out.println("Enter your password: ");
            String password = String.valueOf(scanner.nextLine());

            if (password.length()>=7){ //parbauda vai parole ir garaka par 7 simboliem
                if (!password.equals(password.toUpperCase()) && //parbauda vai paroles vienadas kad tas nomaina uz caps un otradi, ja ir vienadi, tad nav upper case
                !password.equals(password.toLowerCase())){ // un && - lietots ka AND 

                boolean hasDigit = false;

                for (int i = 0; i < password.length(); i++){
                        if (Character.isDigit(password.charAt(i))){ // parbaude vai parole ir cipars
                            hasDigit = true; // ja ir cipars hasDigits parmainas uz true
                    }
                }

                if (hasDigit == true) {
                    der = true;
                    System.out.println("That password is acceptable."); //ja parole atbilst visiem kriterijiem, tad der = true, citadak parole neder.
                }
                else{
                    System.out.println("That password is not acceptable.");
                    }
            }
            else{
                System.out.println("That password is not acceptable.");

                }
        }
        else {
            System.out.println("That password is not acceptable.");
            }
        }

    }    
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word -->");
        String word = String.valueOf(scanner.nextLine());
        word = word.trim();

        int spaces = 0;

    while (word.length() > 0) {
                // Print spaces
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                System.out.println(word);

                spaces++;
                if (word.length() > 2) {
                    word = word.substring(1, word.length() - 1);
                } else {
                    word = word.substring(1, word.length());
                }
            }
    }
}
