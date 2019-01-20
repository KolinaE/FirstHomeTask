package hometask8;

import utils.Helper;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = Methods.fillArray(2000, 0, 1);
        Methods.headOrTail(randomArray);
        Helper.getRandom(0, 1);
        Methods.matrix();
        Methods.summary(19);

    }
}
