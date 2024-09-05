import java.util.Scanner;

public class PalindromeSeries {
    public static void main(String[] args) {
        int a, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's palindrome or not : ");
        int number = sc.nextInt();

        int check = number;

        while (number > 0) {
            a = number % 10;
            sum = (sum * 10) + a;
            number = number / 10;
        }
        if (check == sum)
            System.out.printf("%d is a palindrome number", check);
        else
            System.out.printf("%d is not a palindrome number", check);
    }
}
