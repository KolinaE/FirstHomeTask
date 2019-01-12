package hometask4;

import java.util.Scanner;

import static hometask4.Cycles.inputYearOfBirth;

public class Main {

    public static void main(String[] args) {

        Cycles.countdown(10);

        Cycles.factorialCalculation(4);

        Cycles.arithmeticProgression(0);

        Cycles.summary(1);

        Cycles.notEvenNumbers(1);


        System.out.println("Enter the year of your birth");
        int year = inputYearOfBirth();
        int a = 2019 - year;
        System.out.println("Your age is " + a);

    }
}
