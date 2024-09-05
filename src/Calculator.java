import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();

        System.out.print("Enter your second number : ");
        int number2 = sc.nextInt();

        System.out.print("Choose any one of the operations +, -, *, / : ");
        char operator = sc.next().charAt(0);

        if (operator == '+'){
            int sum = number1 + number2;
            System.out.print("The sum of two numbers is " + sum);
        } else if (operator == '-') {
            int sub = number1 - number2;
            System.out.println("The difference of two numbers is " + sub);
        } else if (operator == '*') {
            int prod = number1 * number2;
            System.out.println("The product of two numbers is " + prod);
        } else {
            if (number2 != 0){
                int div = number1 / number2;
                System.out.println("The division of two numbers is " + div);
            }
            else {
                System.out.println("Division by zero is not possible");
            }
        }
    }
}
