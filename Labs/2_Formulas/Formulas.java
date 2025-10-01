import java.math.BigInteger;
import java.util.Scanner;

public class Formulas {
    public static final double PI = 3.14;
    private final Scanner scanner;

    public Formulas() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("---- FORMULA CHOICES ----");
        System.out.println("0. Exit");
        System.out.println("1. Area of a triangle");
        System.out.println("2. Law of sines");
        System.out.println("3. Half angle formula");
        System.out.println("4. Volume of a sphere");
        System.out.println("5. Area of a circle");
        System.out.println("6. Circumference of a circle");
        System.out.println("7. Distance formula");
        System.out.println("8. Kinematics");
        System.out.println("9. Gas law");
        System.out.println("10. Arithmetic series");
        System.out.println("11. Geometric series");
        System.out.println("12. Law of cosines");
        System.out.println("13. Avg rate of change");
        System.out.println("14. Binomial theorem");
        System.out.println("15. Differential");
        System.out.println("-------------------------");
        System.out.print("-> ");
        return scanner.nextInt();
    }

    // Choice 1
    public void areaTriangle() {
        System.out.println("Area of a triangle");
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }

    // Choice 2
    public void lawOfSines() {
        System.out.println("Law of sines");
        System.out.print("Enter side length: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter angle opposite that side (degrees): ");
        double deg1 = scanner.nextDouble();
        System.out.print("Enter another angle of the triangle (degrees): ");
        double deg2 = scanner.nextDouble();
        double side2 = (side1 * Math.sin(Math.toRadians(deg2))) / Math.sin(Math.toRadians(deg1));
        System.out.println("Other side length: " + side2);
    }

    // Choice 3
    public void halfAngle() {
        System.out.println("Half angle identity");
        System.out.print("Enter angle in degrees: ");
        double deg = scanner.nextDouble();
        double rad = Math.toRadians(deg);
        double sinHalf = Math.sqrt((1 - Math.cos(rad)) / 2);
        double cosHalf = Math.sqrt((1 + Math.cos(rad)) / 2);
        System.out.println("sin(angle/2): " + sinHalf);
        System.out.println("cos(angle/2): " + cosHalf);
    }

    // Choice 4
    public void volumeSphere() {
        System.out.println("Volume of a sphere");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume: " + volume);
    }

    // Choice 5
    public void areaCircle() {
        System.out.println("Area of a circle");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = PI * Math.pow(radius, 2);
        System.out.println("Area: " + area);
    }

    // Choice 6
    public void circCircle() {
        System.out.println("Circumference of a circle");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    // Choice 7
    public void distance() {
        System.out.println("Distance formula");
        System.out.print("Enter first point x y: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter second point x y: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);
    }

    // Choice 8
    public void kinematic() {
        System.out.println("Kinematics given velocity, time, and acceleration");
        System.out.print("Enter initial velocity: ");
        double v0 = scanner.nextDouble();
        System.out.print("Enter time: ");
        double t = scanner.nextDouble();
        System.out.print("Enter acceleration: ");
        double a = scanner.nextDouble();
        double deltaX = v0 * t + 0.5 * a * t * t;
        System.out.println("Displacement: " + deltaX);
    }

    // Choice 9
    public void gasLaw() {
        System.out.println("Boyle's law");
        System.out.print("Enter initial pressure: ");
        double p1 = scanner.nextDouble();
        System.out.print("Enter initial volume: ");
        double v1 = scanner.nextDouble();
        System.out.print("Enter final pressure: ");
        double p2 = scanner.nextDouble();
        double v2 = (p1 * v1) / p2;
        System.out.println("Final volume: " + v2);
    }

    // Choice 10
    public void arithmeticSum() {
        System.out.println("Sum of arithmetic series");
        System.out.print("Enter first term: ");
        double a0 = scanner.nextDouble();
        System.out.print("Enter common difference: ");
        double diff = scanner.nextDouble();
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        double sum = n / 2.0 * (2 * a0 + (n - 1) * diff);
        System.out.println("Sum: " + sum);
    }

    // Choice 11
    public void geometricSum() {
        System.out.println("Geometric Sum");
        System.out.print("Enter first term: ");
        double a0 = scanner.nextDouble();
        System.out.print("Enter common ratio: ");
        double r = scanner.nextDouble();
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        if (r == 1) {
            System.out.println("Sum: " + (a0 * n));
        } else {
            double sum = a0 * (Math.pow(r, n) - 1) / (r - 1);
            System.out.println("Sum: " + sum);
        }
    }

    // Choice 12
    public void lawOfCosines() {
        System.out.println("Law Of Cosines");
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter angle C (degrees): ");
        double degC = scanner.nextDouble();
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(degC)));
        System.out.println("Side c: " + c);
    }

    // Choice 13
    public void avgROC() {
        System.out.println("Slope/Rate of Change");
        System.out.print("Enter first point x1 y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter second point x2 y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double avg = (double) (y2 - y1) / (x2 - x1);
        System.out.println("Average rate of change: " + avg);
    }

    // Binomial helper
    private static BigInteger nCr(int n, int r) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                           .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    // Choice 14
    public void binomialExpansion() {
        System.out.println("Binomial expansion");
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.print("Enter n (non-negative integer): ");
        int n = scanner.nextInt();

        for (int k = 0; k <= n; k++) {
            BigInteger coeff = nCr(n, k);
            BigInteger termX = BigInteger.valueOf(x).pow(n - k);
            BigInteger termY = BigInteger.valueOf(y).pow(k);
            BigInteger term = coeff.multiply(termX).multiply(termY);

            System.out.print(term);
            if (k != n) System.out.print(" + ");
        }
        System.out.println();
    }

    // Choice 15
    public void diffQuotient() {
        System.out.println("Differential/Difference Quotient");
        System.out.print("Enter function as 'ax^b + ...' (space-separated, all coefficients positive): ");
        scanner.nextLine(); // consume newline
        String fn = scanner.nextLine();
        String cleaned = fn.replace("+", " ");
        String[] elements = cleaned.trim().split("\\s+");
        Term[] terms = new Term[elements.length];
        for (int i = 0; i < elements.length; i++) {
            String[] curTermStr = elements[i].split("x\\^");
            int coef = Integer.parseInt(curTermStr[0]);
            int power = Integer.parseInt(curTermStr[1]);
            terms[i] = new Term(coef, power);
        }

        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();
        double h = 0.00001;

        double fxh = 0;
        double fx = 0;
        for (Term term : terms) {
            fxh += term.coef() * Math.pow(x + h, term.power());
            fx += term.coef() * Math.pow(x, term.power());
        }

        double diffQuotient = (fxh - fx) / h;
        System.out.println("Difference quotient: " + diffQuotient);
    }

    public void closeScanner() {
        scanner.close();
    }
}

record Term(int coef, int power){}
