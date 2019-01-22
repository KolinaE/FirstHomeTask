package utils;

public class Helper {


    public static int getRandom(int min, int max) {
        int r = (int) Math.round((max - min) * Math.random()) + min;
        return r;
    }

    public static void showArray(int[] arr) {
        for (int element : arr) {
            System.out.printf("[%d}", element);
        }
        System.out.printf("\n");
    }

    public static void showArray(char[] arr) {
        for (char element : arr) {
            System.out.printf("[%c}", element);
        }
        System.out.printf("\n");
    }

    public static void showArray(double[] arr) {
        for (double element : arr) {
            System.out.printf("[%f}", element);
        }
        System.out.printf("\n");
    }
}
