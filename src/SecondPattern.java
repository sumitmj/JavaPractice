public class SecondPattern {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= row - i - 1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}