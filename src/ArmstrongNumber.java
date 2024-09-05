import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's armstrong or not : ");
        int number = sc.nextInt();

        int check = number;
        int power = String.valueOf(number).length();

        while (number > 0) {

            a = number % 10;
            sum += (int) Math.pow(a, power);
            number = number / 10;
        }
        if (check == sum)
            System.out.printf("%d is an armstrong number", check);
        else
            System.out.printf("%d is not an armstrong number", check);
    }
}
