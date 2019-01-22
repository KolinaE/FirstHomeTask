package hometask10;

import utils.Helper;

public class Methods {

    public static int[] fillArray(int len, int min, int max) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Helper.getRandom(0, 15);
        }
        return arr;
    }

    public static void getSummaryDifference(int[] arr) {
        int sum1 = 0; //  even
        int sum2 = 0; // not even
        for (int num : arr) {
            if (num % 2 == 0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        int dif = sum1 - sum2;
        System.out.println("The summary of even numbers is " + sum1);
        System.out.println("The summary of not even numbers is " + sum2);
        System.out.println("The difference is " + dif);
    }

    public static void swapElements(char[] arr, int ind1, int ind2) {
        char temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }


    public static int getMin(double[] arr) {
        int minIndex = 0;
        double min = arr[minIndex];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMax(double[] arr) {
        int maxIndex = 0;
        double max = arr[maxIndex];
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swapIndex(double[] arr, int ind1, int ind2) {
        double temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }
}