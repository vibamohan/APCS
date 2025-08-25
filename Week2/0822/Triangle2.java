import java.util.Scanner;

/**
 * Print "The Area of a Triangle \n" 
 * Print "Enter the base of the triangle: " 
 * Create a double variable base 
 * Get a number from the user and set it to the variable base. 
 * Print "Enter the height
 * of the traingle:" 
 * Create a double variable height 
 * Get a number from the user and set it to the
 * variable height. 
 * Create a double variable area Set the variable to (base*height)/2.0 Print "Area
 * is: " + area
 */

public class Triangle2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Area of a Triangle");
    double base, height,area;
    
    System.out.println("Enter in a base: ");
    base = scan.nextDouble();

    System.out.println("Enter in a height");
    height = scan.nextDouble();

    area = 0.5 * base * height;
    System.out.println("The area is: " + area);
  }
}
