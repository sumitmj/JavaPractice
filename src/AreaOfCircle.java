import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        double radius = getUserInput();
        double area = calculateArea(radius);
        displayArea(area);
    }

    public static double getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        return input.nextDouble();
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void displayArea(double area) {
        System.out.println("The area of the circle is: " + area);
    }
}
