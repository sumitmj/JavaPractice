public class MethodOverload {
    static int DoubleMethod(int x, int y) {
        return x + y;
    }
    static double DoubleMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int calc1 = DoubleMethod(4, 5);
        double calc2 = DoubleMethod(4, 4.2);
        System.out.println(calc1);
        System.out.println(calc2);
    }
}
