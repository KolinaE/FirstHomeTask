package hometask2;

public class Calculations {

    public static void main(String[] args) {

        int firstResult = Main.methodCalc1(10, 20, 48);
        System.out.println("1. The result of this calculation is " + firstResult);

        int secondResult = Main.methodCalc2(2, 19);
        System.out.println("2. The result of this calculation is " + secondResult);

        int thirdResult = Main.methodCalc3(35, 1, 2);
        System.out.println("3. The result of this calculation is " + thirdResult);

        int fourthResult = Main.methodCalc4(25, 5, 3);
        System.out.println("4. The result of this calculation is " + fourthResult);




        if(isNumberEven(8461)) {
            System.out.println("Число является чётным");
        }else {
            System.out.println("Число является нечётным");
        }
    }


    public static boolean isNumberEven(int x) {
        int result = x % 2;
        if(result == 0) {
            return true;
        }else {
            return false;
        }
    }
}
