import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");

        int num = input.nextInt();

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("The multiplication of " + num + " and " + i + " is " + num*i);
        }
    }
}
