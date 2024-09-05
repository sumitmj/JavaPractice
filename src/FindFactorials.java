import java.util.Scanner;

public class FindFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to find it's factorial : ");
        int number = sc.nextInt();
        int factorial = 1, value;

        value = number;

        while (number > 0) {
            factorial = number * factorial;
            number = number - 1;
        }

        System.out.printf("The factorial of %d is %d", value, factorial);

    }
}
