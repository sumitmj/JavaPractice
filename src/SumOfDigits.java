import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer : ");

        long n = sc.nextLong();

        System.out.println("The sum of the digits from given integer is " + Sum(n));
    }

    public static int Sum(long n){
        int sum = 0;

        while (n != 0){
            sum+= n % 10;
            n = n/10;
        }
        return sum;
    }
}