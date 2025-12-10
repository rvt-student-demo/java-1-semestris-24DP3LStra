package rvt;

public class testingCodes {
    public static void main(String[] args) {
        int[] numbers= new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;


        numbers[0] = numbers[1];
        numbers[1] = numbers[0];

        System.out.println(numbers[0] + " " +  numbers[1]);


    }

}
