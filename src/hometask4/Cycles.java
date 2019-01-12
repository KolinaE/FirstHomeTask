package hometask4;

import java.util.Scanner;

public class Cycles {


    public static void countdown(int x) {
        System.out.println(

        );
        do {
            if (x - 1 >= 0) {
                System.out.println("x = " + x);
            }
            x--;
        } while (x >= 1);
        System.out.println(

        );
    }


    public static int factorialCalculation(int f) {
        int c = 1;
        for (int i = 1; i <= f; i++) {
            c = c * i;

        }
        System.out.println("The factorial of the number is " + c);
        System.out.println(

        );
        return c;


    }


    public static void arithmeticProgression(int a) {
        System.out.println("The arithmetic progression:");
        for (a = 0; a <= 50; a = a + 2) {
            System.out.println(a);
        }
        System.out.println(

        );

    }


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
