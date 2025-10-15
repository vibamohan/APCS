import java.util.Scanner;

public class MyMath {
  // PARITY
  public void parity(Scanner sc) {
    // ask for input
    System.out.println("This will print if the number is odd or even");
    System.out.print("Enter a number: ");
    double num = sc.nextInt();
    // give results
    System.out.println("This number is " + ((num % 2 == 0) ? "even" : "odd"));
  }

  // QUADRATIC
  public void quadratic(Scanner sc) {
    // ask for A
    System.out.println("Input A: ");
    double a = sc.nextDouble();
    // ask for B
    System.out.println("Input B: ");
    double b = sc.nextDouble();
    // ask for C
    System.out.println("Input C: ");
    double c = sc.nextDouble();
    // if a is 0
    if (a == 0) {
      System.out.println("A cannot be zero");
      a = 1;
    }
    // make first equation
    double pos = ((b * -1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    // make second equation
    double neg = ((b * -1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    if (pos != neg) {
      // give results
      System.out.println("x is equal to " + pos + " or " + neg);
    } else if (pos == neg) {
      // give results
      System.out.println("x is equal to " + pos);
    } else {
      System.out.println("x has no real number solutions");
    }

  }
}
