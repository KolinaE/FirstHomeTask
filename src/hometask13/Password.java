package hometask13;

import utils.Helper;

public class Password {

    public static void main(String[] args) {

        Password.passwordGenerator();
    }

    public static void passwordGenerator() {


        char smallLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char capitalLetters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char symbols[] = {'!', '@', '#', '$', '%', '_'};
        char numbers[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


        int r = Helper.getRandom(0, 25);
        int t = Helper.getRandom(0, 25);
        int x = Helper.getRandom(0, 25);
        int y = Helper.getRandom(0, 25);
        int z = Helper.getRandom(0, 5);
        int a = Helper.getRandom(0, 9);
        int b = Helper.getRandom(0, 9);
        int c = Helper.getRandom(0, 9);


        char[] password = new char[8];
        password[0] = smallLetters[r];
        password[1] = numbers[a];
        password[2] = symbols[z];
        password[3] = smallLetters[t];
        password[4] = capitalLetters[x];
        password[5] = numbers[b];
        password[6] = capitalLetters[y];
        password[7] = numbers[c];

        System.out.print(password);
    }
}
