import java.util.Scanner;

public class Test {
    private double pi= 0;
    private int radius = 0;
    private Scanner scan = new Scanner(System.in);

    public void setVariable() {
        System.out.println("Enter in a radius: ");
        radius = scan.nextInt();
        pi = 3.14;
    }

    public void printCircumference() {
        double cir = 2*pi*radius;
        System.out.println("circumeference: " + cir);
    }
}