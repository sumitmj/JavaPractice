import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        int largest;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3)
            largest = number1;

        else if (number2 > number1 && number2 > number3) {
            largest = number2;
        }

        else
            largest = number3;
        System.out.printf("The largest number among %d, %d and %d is %d ", number1, number2, number3, largest);
        System.out.println();
    }
}
