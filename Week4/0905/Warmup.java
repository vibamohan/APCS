import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of your cylinder: ");
        double rad = scanner.nextDouble();
        System.out.println("Enter the height of your cylinder: ");
        double height = scanner.nextDouble();
        double volume = 3.14 * rad * rad * height;
        System.out.println("the volume was " + volume);

        System.out.println("Geography: ");
        System.out.print("What is the smallest country in the world: ");
        scanner.nextLine();
        String smallest = scanner.nextLine();
        if (smallest.toLowerCase().strip().equals("vatican city")) {
            System.out.println("correct!");
        } else {
            System.out.println("incorrect :( it was vatican city");
        }
    }
}
