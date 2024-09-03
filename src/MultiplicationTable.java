import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        int UserInput = GetInput();
        int num = 0;
        Multiplication(num, UserInput);
    }

    public static int GetInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        return sc.nextInt();
    }

    public static void Multiplication(int num, int UserInput){
        for (int i = 1; i <=10; i++) {
            num = UserInput * i;
            System.out.println(num);
        }
    }

}
