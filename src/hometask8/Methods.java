package hometask8;

import utils.Helper;

public class Methods {


    public static void headOrTail(int[] arr) {
        int countHeads = 0;
        int countTails = 0;
        for (int e : arr) {
            if (e == 1) {
                countHeads++;
            } else {
                countTails++;
            }
            }
        System.out.println("Heads = " + countHeads);
        System.out.println("Tails = " + countTails);

        }
        public static int[] fillArray(int len, int min, int max) {
        int[] a = new int[len];
            for (int i = 0; i < len ; i++) {
                a[i] = Helper.getRandom(0, 1);
            }
            return a;
        }


        public static void matrix() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(i == j) {
                        System.out.print("x");
                    }
                    System.out.print("0");
                }
                System.out.println();

            }
        }



    public static void summary(int k) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * k) - 9;
            sum = sum + r;
            System.out.println(r);
        }
        System.out.println("The summary of random numbers is  " + sum);
        System.out.println(

        );
    }
}
