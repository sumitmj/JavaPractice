import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        char[] ExampleArray = sc.nextLine().toCharArray();

        System.out.print("Reverse string : ");

        for (int i = ExampleArray.length-1; i>=0 ; i--) {
            System.out.print(ExampleArray[i]);
        }
        System.out.print("\n");
    }
}
