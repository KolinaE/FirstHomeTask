package utils;

public class Helper {


    public static int getRandom(int min, int max) {
        int r = (int) Math.round((max-min) * Math.random()) + min;
        return r;
    }

    public static void showArray(int[] arr) {
        for(int element : arr) {
            System.out.printf("[%d}", element);
        }
        System.out.printf("\n");
    }
}
