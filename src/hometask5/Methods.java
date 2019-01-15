package hometask5;

public class Methods {



    public static void summary(int k) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * k) - 9;
            sum = sum + r;
            System.out.println(r);
        }
        System.out.println("Сумма случйных чисел равна " + sum);
        System.out.println(

        );
    }

    public static void intArray() {

        int[] a1 = new int[]{-10, 20, 34, -11, 100, 20};
        int min = 0;
        if (a1[0] < a1[1]) {
            min = a1[0];
        }
        if (a1[1] < min) {
            min = a1[1];
        }
        if (a1[2] < min) {
            min = a1[2];
        }
        if (a1[3] < min) {
            min = a1[3];
        }
        if (a1[4] < min) {
            min = a1[4];
        }
        if (a1[5] < min) {
            min = a1[5];
        }

        System.out.println("Наименьший элемент массива равен " + min);

        int max = 0;
        if (a1[0] > a1[1]) {
            max = a1[0];
        }
        if (a1[1] > max) {
            max = a1[1];
        }
        if (a1[2] > max) {
            max = a1[2];
        }
        if (a1[3] > max) {
            max = a1[3];
        }
        if (a1[4] > max) {
            max = a1[4];
        }
        if (a1[5] > max) {
            max = a1[5];
        }

        System.out.println("Наибольший элемент массива равен " + max);
        System.out.println(

        );

    }



    public static void doubleArray() {
        double[] a2 = new double[] {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double max = 0;
        if (a2[0] > a2[1]) {
            max = a2[0];
        }
        if (a2[1] > max) {
            max = a2[1];
        }
        if (a2[2] > max) {
            max = a2[2];
        }
        if (a2[3] > max) {
            max = a2[3];
        }
        if (a2[4] > max) {
            max = a2[4];
        }
        if (a2[5] > max) {
            max = a2[5];
        }
        if (a2[6] > max) {
            max = a2[6];
        }

        System.out.println("Наибольший элемент массива равен " + max);

        double min = 0;
        if (a2[0] < a2[1]) {
            min = a2[0];
        }
        if (a2[1] < min) {
            min = a2[1];
        }
        if (a2[2] < min) {
            min = a2[2];
        }
        if (a2[3] < min) {
            min = a2[3];
        }
        if (a2[4] < min) {
            min = a2[4];
        }
        if (a2[5] < min) {
            min = a2[5];
        }
        if (a2[6] < min) {
            min = a2[6];
        }

        System.out.println("Наименьший элемент массива равен " + min);
    }
}




