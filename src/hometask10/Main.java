package hometask10;

import utils.Helper;

public class Main {
    public static void main(String[] args) {

        int[] randomArray = Methods.fillArray(10, 0, 15);
        Helper.showArray(randomArray);
        Methods.getSummaryDifference(randomArray);
        char[] chArr = {'r', 'o', 'l', 'o', 'c'};
        Helper.showArray(chArr);
        Methods.swapElements(chArr, 0, 4);
        Helper.showArray(chArr);
        double[] arr = {43.543, 0.00001, 43.4, 0.01, 18.9, 96.2, 0.9};
        Helper.showArray(arr);
        Methods.swapIndex(arr, Methods.getMin(arr), Methods.getMax(arr));
        Helper.showArray(arr);

    }
}
