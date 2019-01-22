package hometask11;

import utils.Helper;

public class Sorting {


    public static void main(String[] args) {

        int[] arr = {58, 89, 103, 4, 1, 96, 162, 3, 2, 786};
        Helper.showArray(arr);
        sort(arr);
        Helper.showArray(arr);

    }

    public static int getMaxIndex(int[] arr, int startIndex) {
        int maxIndex = startIndex;
        int max = arr[maxIndex];
        for (int i = startIndex; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }


        }
        return maxIndex;
    }

    public static void swapIndex(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = getMaxIndex(arr, i);
            swapIndex(arr, i, maxIndex);
        }
    }
}