package hometask3;


public class Functions {

    public static double convert(double g, double d) {
        return g * d;
    }


    public static int summary(int n) {
        int a, b, c;
        a = n % 10;
        b = (n / 10) % 10;
        c = n / 100;
        return a + b + c;
    }


    public static int farmPlotPerimeter(int l, int w) {
        return 2 * (l + w);
    }


    public static int farmPlotArea(int l, int w) {
        return l * w;
    }

    public static boolean trains(int v1, int v2) {
        if (v1 >= v2) {
            System.out.println("Trains won't collide");
            return true;
        } else {
            System.out.println("Trains will collide");
            return false;
        }

    }

    public static int quadraticSolution(int a, int b, int c) {
        // a * x * x + b * x + c = 0;
        int d = (b * b) - (4 * a * c);
        double x1, x2;
        if (d < 0) {
            System.out.println("This equation has no roots");
        } else {
            if (d > 0) {
                x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
                x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
                System.out.println("This equation has two roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (d == 0) {
                    x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
                    System.out.println("This equation has only one root x1 =  " + x1);

                }
            }
        }
        return 0;
    }


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