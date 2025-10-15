import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    MyMath mm = new MyMath();
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Quadratic formula");
    System.out.println("2. Even or odd");
    System.out.print("-> ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      mm.quadratic(scanner);
    } else {
      mm.parity(scanner);
    }
  }
}
