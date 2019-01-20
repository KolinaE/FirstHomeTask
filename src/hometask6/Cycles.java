package hometask6;

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
}
