public class FirstReturn {
    static int values ( int x, int y ) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = values(3, 4);
        System.out.println(z);
    }
}
