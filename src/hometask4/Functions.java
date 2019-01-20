package hometask4;

public class Functions {
    public static double convert(double g, double d) {
        return g * d;
    }


    public static int summary(int n) {
        int a, b, c;
        a = n % 10;
        b = (n / 10) % 10;
        c = n / 100;
        return a + b + c;
    }


    public static int farmPlotPerimeter(int l, int w) {
        return 2 * (l + w);
    }


    public static int farmPlotArea(int l, int w) {
        return l * w;
    }



    public static boolean trains(int v1, int v2) {
        int t1, t2;
        t1 = 4 / v1;
        t2 = 6 / v2;
        if (t1 <= t2) {
            System.out.println("The trains won't collide");
            return true;
        } else {
            System.out.println("The trains will collide");
            return false;
        }

    }

    public static int quadraticSolution(int a, int b, int c) {
        // a * x * x + b * x + c = 0;
        int d = (b * b) - (4 * a * c);
        double x1, x2;
        if (d < 0) {
            System.out.println("This equation has no roots");
        } else {
            if (d > 0) {
                x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
                x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
                System.out.println("This equation has two roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (d == 0) {
                    x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
                    System.out.println("This equation has only one root x1 =  " + x1);

                }
            }
        }
        return 0;
    }

}
