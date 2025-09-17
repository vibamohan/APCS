import java.util.Scanner;

public class Formulas {
    public static final double PI = 3.14;
    private final Scanner scanner;

    public Formulas() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("---- FORMULA CHOICES ----");
        System.out.println("1. Area of a triangle");
        System.out.println("2. Trig identity");
        System.out.println("3. Volume of a sphere");
        System.out.println("4. Area of a circle");
        System.out.println("5. Circumference of a circle");
        System.out.println("6. Distance formula");
        System.out.println("7. Kinematics formula");
        System.out.println("8. Gas law formula");
        System.out.println("9. Arithmetic series");
        System.out.println("10. Geometric series");
        System.out.println("11. Difference quotient");
        System.out.println("12. Chain rule");
        System.out.println("13. Remainder theorem");
        System.out.println("14. Law of cosines");
        System.out.println("15. Avg rate of change");
        System.out.println();
        System.out.println("-> ");
        int choice = scanner.nextInt();
        return choice;
    }

    // Choice 1: Area of a triangle
    public void areaTriangle() {
        System.out.println("Area of a triangle: ");
        System.out.println("Enter a base of a triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter a height of a triangle: ");
        double height = scanner.nextDouble();
        double area = base * height * 0.5;
        System.out.println("The area of your triangle is " + area);
    }

    // Choice 2: law of sines
    public void lawOfSines() {
        System.out.println("Law of sines");
        System.out.print("Enter a side of your triangle");
        System.out.println();
        double side1 = scanner.nextDouble();
        System.out.print("Enter the opposite angle of that side in degrees: ");
        double deg1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter another angle of your triangle: ");
        double deg2 = scanner.nextDouble();
        System.out.println();
        double side2 = (side1 * Math.sin(Math.toRadians(deg1))) / Math.sin(Math.toRadians(deg2));
        System.out.println("The other side of your triangle is " + side2);
    }

    // Choice 3: Volume of a sphere 
    public void volumeSphere() {
        System.out.println("Volume of a sphere");
        System.out.print("Enter the radius of your sphere: ");
        System.out.println();
        double radius = scanner.nextDouble();
        double volume = (4.0/3.0) * PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is " + volume);
    }

    // Choice 4: Area of a circle
    public void areaCircle() {
        System.out.println("Area of a circle");
        System.out.print("Enter the radius of your circle: ");
        System.out.println();
        double radius = scanner.nextDouble();
        double volume = PI * Math.pow(radius, 2);
        System.out.println("The volume of the sphere is " + volume);
    }

    // Choice 5: Circumference of a circle 
    public void circCircle() {
        System.out.println("Circumference of a circle");
        System.out.print("Enter the radius of your circle: ");
        System.out.println();
        double radius = scanner.nextDouble();
        double volume = PI * radius * 2;
        System.out.println("The volume of the sphere is " + volume);
    }

    // Choice 6: Distance formula 
    public void distance() {
        System.out.println("Distance formula");
        System.out.print("Enter the first point x y: ");
        int x1 = scanner.nextInt(); int y1 = scanner.nextInt();
        System.out.print("Enter the second point x y: ");
        int x2 = scanner.nextInt(); int y2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("\n The distance is " + distance);
    }

    // Choice 7: Kinematics
    public void kinematic() {
        System.out.println("Kinematic formula");
        System.out.print("Enter the initial velocity: ");
        double v0 = scanner.nextDouble();
        System.out.print("Enter the time taken: ");
        System.out.println();
        double t = scanner.nextDouble();
        System.out.print("Enter the acceleration: ");
        double a = scanner.nextDouble();
        double deltaX = (v0 * t) + 0.5 * a * Math.pow(t, 2);
    }

    // Choice 9: Arithmetic series
    public void arithmeticSum() {
        System.out.println("Sum of an arithmetic series");
        System.out.print("Enter the first term: ");
        double a0 = scanner.nextDouble();
        System.out.print("\nEnter the common difference: ");
        double diff = scanner.nextDouble();
        System.out.print("\nEnter the number of terms: ");
        int numTerms = scanner.nextInt();
        double sum = (a0 * numTerms) + (diff * (numTerms - 1));
        System.out.println("The sum is " + sum);
    }

    // Choice 10: Geometric series
    public void geometricSum() {
        System.out.println("Sum of an geometric series");
        System.out.print("Enter the first term: ");
        double a0 = scanner.nextDouble();
        System.out.print("\nEnter the common multiplier: ");
        double ratio = scanner.nextDouble();
        System.out.print("\nEnter the number of terms: ");
        int numTerms = scanner.nextInt();
        double sum = (a0 * (Math.pow(ratio, numTerms) - 1)) / (numTerms - 1);
        System.out.println("The sum is " + sum);
    }

    // Choice 11: Law of cosines 
    public void lawOfCosines() {

    }

    // Choice 12: Avg rate of change
    public void avgROC() {
        System.out.println("Average rate of change");
        int x1, y1;
    }
}
