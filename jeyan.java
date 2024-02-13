import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (1 for Rectangle, 2 for Circle):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double length = getDimension("Enter the length of the rectangle:");
            double width = getDimension("Enter the width of the rectangle:");

            double area = calculateRectangleArea(length, width);
            System.out.println("The area of the rectangle is: " + area);
        } else if (choice == 2) {
            double radius = getDimension("Enter the radius of the circle:");

            double area = calculateCircleArea(radius);
            System.out.println("The area of the circle is: " + area);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static double getDimension(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
