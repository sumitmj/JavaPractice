public class FibonacciSeries {
    static int a = 0, b = 1, c = 0;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        int count = 10;
        printFibonacci(count - 2);
    }

    public static void printFibonacci(int count){
        if (count > 0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            printFibonacci(count - 1);
        }
    }
}
