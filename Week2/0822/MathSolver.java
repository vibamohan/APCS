import java.util.Scanner;

public class MathSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Volume of a cube
        System.out.println("Volume of a cube");
        
        System.out.println("Enter a value for the base");
        double base = scanner.nextDouble();
        
        System.out.println("Enter a value for the width");
        double width = scanner.nextDouble();
        
        System.out.println("Enter a value for the height");
        double height = scanner.nextDouble();

        double volume = (base*width*height);
        System.out.println("The volume is" +  volume);

        // Pythagorean formula
        System.out.println("Pythagorean formula");
        System.out.println("Please enter in a leg: ");
        double leg1 = scanner.nextDouble();
        System.out.println("Please enter in another leg: ");
        double leg2 = scanner.nextDouble();

        double hyp = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        System.out.println("Hypotenuse is: " + hyp);

        // Perimeter of a rectangle;
        System.out.println("Perimeter of a rectangle");
        System.out.println("Please enter in side1: ");
        double side1 = scanner.nextDouble();
        
        System.out.println("Please enter in side2: ");
        double side2 = scanner.nextDouble();

        double perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter: " + perimeter);
    }
}
