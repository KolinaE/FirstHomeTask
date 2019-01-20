package hometask4;


public class Main {
    public static void main(String[] args) {
        double result = Functions.convert(653.89, 27.75);
        System.out.println("The result of convrtation is " + result);
        System.out.println(

        );


        int sum = Functions.summary(768);
        System.out.println("The summary is " + sum);
        System.out.println(

        );


        int perimeter = Functions.farmPlotPerimeter(89, 126);
        System.out.println("The perimeter of the rectangle farm plot is " + perimeter);


        int area = Functions.farmPlotArea(49, 35);
        System.out.println("The area of the rectangle farm plot is " + area);
        System.out.println(

        );

        Functions.trains(4, 9);
        Functions.trains(8, 8);
        Functions.trains(47, 35);
        System.out.println(

        );

        Functions.quadraticSolution(20, 2, 7);
        Functions.quadraticSolution(2, 12, 3);
        Functions.quadraticSolution(3, -18, 27);
        System.out.println(

        );
    }
}
