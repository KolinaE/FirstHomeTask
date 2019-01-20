package hometask3;

public class Main {
    public static void main(String[] args) {
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
