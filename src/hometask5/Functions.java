package hometask5;

public class Functions {
    public static void seasonDeterminationFirstVar(int inputNumber) {
        if (inputNumber == 12) {
            System.out.println("ЗИМА");
        } else if (inputNumber == 1) {
            System.out.println("ЗИМА");
        } else if (inputNumber == 2) {
            System.out.println("ЗИМА");
        } else if (inputNumber == 3) {
            System.out.println("ВЕСНА");
        } else if (inputNumber == 4) {
            System.out.println("ВЕСНА");
        } else if (inputNumber == 5) {
            System.out.println("ВЕСНА");
        } else if (inputNumber == 6) {
            System.out.println("ЛЕТО");
        } else if (inputNumber == 7) {
            System.out.println("ЛЕТО");
        } else if (inputNumber == 8) {
            System.out.println("ЛЕТО");
        } else if (inputNumber == 9) {
            System.out.println("ОСЕНЬ");
        } else if (inputNumber == 10) {
            System.out.println("ОСЕНЬ");
        } else if (inputNumber == 11) {
            System.out.println("ОСЕНЬ");
        } else {
            System.out.println("Месяца с таким номером не существует");
        }
    }

    public static void seasonDederminationSecondVar(int n) {

        switch (n) {
            case 12:
            case 1:
            case 2:
                System.out.println("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ОСЕНЬ");
                break;
            default:
                System.out.println("Месяца с таким номером не существует");

        }
    }


    public static long bitDivByFour(double number) {
        int c = 100;
        System.out.println(c >> 2);
        int c1 = 32;
        System.out.println(c1 >> 2);
        int c2 = 8;
        System.out.println(c2 >> 2);
        int c3 = 6;
        System.out.println(c3 >> 2);
        int c4 = 4;
        System.out.println(c4 >> 2);
        int c5 = 3;
        System.out.println(c5 >> 2);
        int c6 = 1;
        System.out.println(c6 >> 2);
        return 0;
    }

}
