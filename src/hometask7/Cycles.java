package hometask7;

import java.util.Scanner;

public class Cycles {
    public static void summary(int s) {

        s = 0;
        for (int i = 1; i <= 100; i++) {
            s = s + i;

        }
        System.out.println("The summary of numbers in the range from 1 to 100 is " + s);
        System.out.println(

        );

    }


    public static void notEvenNumbers(int n) {
        System.out.println("Not even numrers in the range from 1 to 100 are :");
        for (n = 1; n <= 100; n = n + 2) {
            System.out.println(n);
        }
        System.out.println(

        );
    }


    public static int inputYearOfBirth() {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        return inputYear;
    }
}

