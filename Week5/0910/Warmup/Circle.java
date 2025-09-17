import java.util.Scanner;

public class Circle {
    public void printCircumference() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a radius: ");
        int radius = scanner.nextInt();
        double circumference = 3.14 * radius * 2;
        System.out.println("The circumference of the circle is " + circumference);
        scanner.close();
    }

    public void printArea() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("please enter a radius: ");
       int radius = scanner.nextInt();
       double circumference = 3.14 * radius * radius;
       System.out.println("The circumference of the circle is " + circumference); 
       scanner.close();
    }
}