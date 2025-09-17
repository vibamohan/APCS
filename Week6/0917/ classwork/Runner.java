import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) square");
        System.out.println("2) rectangle");
        System.out.println("3) circle");
        System.out.println("4) triangle");
        System.out.println("-> ");
        int choice = scanner.nextInt();
        System.out.println();
        if (choice == 1) {
            System.out.println("Enter a height for the square");
            double height = scanner.nextDouble();
            Square square = new Square(height);
            square.printArea();

        } else if (choice == 2) {
            System.out.println("Enter a length for the rectangle");
            double length = scanner.nextDouble();
            System.out.println("Enter a width for the rectangle");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);
            rectangle.printArea();


        } else if (choice == 3) {
            System.out.print("Please enter a radius for a circle: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            circle.printArea();
        } else if (choice == 4) {
            System.out.print("Please enter a height for a triangle: ");
            double height = scanner.nextDouble();
            System.out.println();
            System.out.println("Please enter a base for a triangle: ");
            double base = scanner.nextDouble();
            Triangle triangle  = new Triangle(height, base);
            triangle.printArea();

        } else {
            System.out.println("Sorry, please enter a number from 1->4 for a choice");
        }
        // }
        // Rectangle r1 = new Rectangle();
        // r1.printVariables();
        // r1.printArea();

        // Rectangle r2 = new Rectangle(5, 3);
        // r2.printVariables();
        // r2.printArea();

        // Triangle t1 = new Triangle();
        // t1.printVariables();
        // t1.printArea();

        // Triangle t2 = new Triangle(5, 3);
        // t2.printVariables();
        // t2.printArea();

        // Circle c1 = new Circle();
        // c1.printVariables();
        // c1.printArea();

        // Circle c2 = new Circle(10);
        // c2.printVariables();
        // c2.printArea();
    }
    
}
