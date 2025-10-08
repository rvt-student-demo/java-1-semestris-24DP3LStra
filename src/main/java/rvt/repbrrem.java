package rvt;

import java.util.Scanner;

public class repbrrem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers: ");
        int num = Integer.valueOf(scanner.nextLine());
        while(true){
            if (num == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: "+sum);
                System.out.println("Numbers: "+count);
                System.out.println("Average: "+((double)sum/count));
                System.out.println("Even: "+even);
                System.out.println("Odd: "+odd);
                break;
            }

            if (num % 2 == 0){
                even += 1;
            }

            else {
                odd += 1;
            }

            if (num != -1){
                count += 1;
                sum += num;
                num = Integer.valueOf(scanner.nextLine());
            }

        }
    }
    

    

}
