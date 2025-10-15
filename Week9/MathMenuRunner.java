import java.util.Scanner;

public class MathMenuRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MathLibrary mathLib = new MathLibrary();

        int choice;

        System.out.println("=== Math Menu ===");
        System.out.println("1. Circumference");
        System.out.println("2. Area of a Circle");
        System.out.println("3. Volume of a Sphere");
        System.out.println("4. Volume of a Cylinder");
        System.out.println("5. Volume of a Cone");
        System.out.print("Enter your choice (1-5): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius: ");
                double r1 = input.nextDouble();
                System.out.println("Circumference: " + mathLib.circumference(r1));
                break;

            case 2:
                System.out.print("Enter the radius: ");
                double r2 = input.nextDouble();
                System.out.println("Area of Circle: " + mathLib.areaCircle(r2));
                break;

            case 3:
                System.out.print("Enter the radius: ");
                double r3 = input.nextDouble();
                System.out.println("Volume of Sphere: " + mathLib.volSphere(r3));
                break;

            case 4:
                System.out.print("Enter the radius: ");
                double r4 = input.nextDouble();
                System.out.print("Enter the height: ");
                double h4 = input.nextDouble();
                System.out.println("Volume of Cylinder: " + mathLib.volCylinder(r4, h4));
                break;

            case 5:
                System.out.print("Enter the radius: ");
                double r5 = input.nextDouble();
                System.out.print("Enter the height: ");
                double h5 = input.nextDouble();
                System.out.println("Volume of Cone: " + mathLib.volCone(r5, h5));
                break;

            default:
                System.out.println("Invalid choice! Please run the program again.");
        }

        input.close();
    }
}
