package hometask1;

public class Start {

    public static void main(String[] args) {
        System.out.println(" Results of operations for the integer data: ");

        int addResult = Calculator.add(5, 7);
        System.out.println("Our actual result of the addition is " + addResult);

        int subResult = Calculator.sub(100, 35);
        System.out.println("Our actual result of the subtraction is " + subResult);

        int divResult = Calculator.div(200, 50);
        System.out.println("Our actual result of the division is " + divResult);

        int mulResult = Calculator.mul(33, 3);
        System.out.println("Our actual result of the multiplication is " + mulResult);

        System.out.println(" Results of operations for the float data: ");

        double doubleAddResult = Calculator.add(3D, 6.8);
        System.out.println("Our actual result of the addition is " + doubleAddResult);

        double doubleSubResult = Calculator.sub(856D, 74.36);
        System.out.println("Our actual result of the subtraction is " + doubleSubResult);

        double doubleDivResult = Calculator.div(17.3, 5D);
        System.out.println("Our actual result of the division is " + doubleDivResult);

        double doubleMulResult = Calculator.mul(44.03, 7D);
        System.out.println("Our actual result of the multiplication is " + doubleMulResult);
    }
}

