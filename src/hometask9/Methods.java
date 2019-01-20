package hometask9;

public class Methods {
    public static void getMin() {

        int[] a = new int[]{-10, 20, 34, -11, 100, 20};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }


    public static void getMax() {
        double[] a = new double[]{10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

}



