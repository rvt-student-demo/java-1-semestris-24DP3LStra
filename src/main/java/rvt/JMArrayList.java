package rvt;
import java.util.*;  //importejam vairakas klases


public class JMArrayList {
    public static void main(String[] args) {
        //Testējam metodes
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            strings.add("MyValue " + i);
        }

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sk;

        // Read numbers until -1
        while (true) {
            sk = Integer.valueOf(scanner.nextLine());
            if (sk == -1) {
                break;
            }
            numbers.add(sk);
        }

        System.out.println("From where?");
        int sk_sakums = Integer.valueOf(scanner.nextLine());

        System.out.println("To where?");
        int sk_beigas = Integer.valueOf(scanner.nextLine());

        System.out.println("");

        while (sk_sakums <= sk_beigas) {
            int num = numbers.get(sk_sakums);
            System.out.println(num);
            sk_sakums += 1;
        }

        scanner.close();

    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
            
        ArrayList<String> stringValues = new ArrayList<>();

        String name;
        String quit = "";
        while (true){
            name = String.valueOf(scanner.nextLine());
            if(name == quit){
                break;
            }
            stringValues.add(name);
        }

        int listSize = stringValues.size();
        System.out.println(listSize);
    }


    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
            
        ArrayList<String> stringValues = new ArrayList<>();

        String name;
        String quit = "";
        while (true){
            name = String.valueOf(scanner.nextLine());
            if(name == quit){
                break;
            }
            stringValues.add(name);
        }

        System.out.println("Search for? ");
        String vards;
        vards = String.valueOf(scanner.nextLine());
        
        if (stringValues.contains(vards)){
            System.out.println(vards + " was found!");
        }
        else{
            System.out.println(vards+" was not found!");
        }

    }


    public static void removeLast(ArrayList<String> strings) {

        strings.remove(strings.size()-1);


    }


}
