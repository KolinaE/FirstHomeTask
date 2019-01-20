package hometask7;

import static hometask7.Cycles.inputYearOfBirth;

public class Main {
    public static void main(String[] args) {
        Cycles.summary(1);

        Cycles.notEvenNumbers(1);


        System.out.println("Enter the year of your birth");
        int year = inputYearOfBirth();
        int a = 2019 - year;
        System.out.println("Your age is " + a);

    }
}