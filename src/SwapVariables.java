public class SwapVariables{
    public static void main(String[] args){
        int a, b, c;

        a = 10;
        b = 20;
        System.out.println("Before swapping : a, b = " + a + ", " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("After swapping : a , b = " + a + ", " + b);
    }
}